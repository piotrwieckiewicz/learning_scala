package contextuals


trait CustomOrdering[A]:
  def compare(x: A, y: A): Int
  extension (lhs: A)
    def < (rhs: A): Boolean = compare(lhs, rhs) < 0


object CustomOrdering {

  given Person: Ordering[Person] with
    def compare(x: Person, y: Person): Int = x.name.compareTo(y.name)

  given Rational: Ordering[Rational] with
    def compare(x: Rational, y: Rational): Int =
      x.num * y.denom - y.num * x.denom

  given Address: Ordering[Address] with
    def compare(x: Address, y: Address): Int = {
      val c = x.ZipCode.compare(y.ZipCode)
      if c != 0 then c else x.StreetName.compareTo(y.StreetName)
    }

  given orderingList[A](using ord: Ordering[A]): Ordering[List[A]] with

    def compare(xs: List[A], ys: List[A]): Int =
      (xs, ys) match
        case (Nil, Nil) => 0
        case (Nil, _)   => 1
        case (_, Nil)   => -1
        case (x :: xt, y :: yt) =>
          val c = ord.compare(x, y)
          if c != 0 then c else compare(xt, yt)

}
