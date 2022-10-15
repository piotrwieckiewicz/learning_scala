package lists

object P07 {

  // how to do it tail recursively?

  def flatten(list: List[Any]): List[Any] = {
    list match
      case (head: List[_]) :: tail => flatten(head) ::: flatten(tail)
      case head :: tail            => head :: flatten(tail)
      case Nil                     => Nil
  }

}
