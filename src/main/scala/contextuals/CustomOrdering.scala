package contextuals

object CustomOrdering {

  given Ordering[Person] with
    def compare(x: Person, y: Person): Int = x.name.compareTo(y.name)

  given Ordering[Rational] with
    def compare(x: Rational, y: Rational): Int =
      x.num * y.denom - y.num * x.denom

  given dupa[A](using ord: Ordering[A]): Ordering[List[A]] with

    def compare(xs: List[A], ys: List[A]): Int =
      (xs, ys) match
        case (Nil, Nil) => 0
        case (Nil, _)   => 1
        case (_, Nil)   => -1
        case (x :: xt, y :: yt) =>
          val c = ord.compare(x, y)
          if c != 0 then c else compare(xt, yt)

}
