package lists

import scala.annotation.tailrec

object P03 {

  @tailrec
  def nth[A](n: Int, list: List[A]): A = {
    (n, list) match
      case (_, Nil)          => throw new NoSuchElementException
      case (0, _)            => list.head
      case (_, head :: tail) => nth(n - 1, list.tail)
  }
}
