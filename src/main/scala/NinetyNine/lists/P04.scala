package lists

import scala.annotation.tailrec

object P04 {

  def length[A](list: List[A]): Int = {
    @tailrec
    def lengthRecursive(list: List[A], acc: Int = 0): Int = {
      list match
        case Nil          => acc
        case head :: tail => lengthRecursive(tail, acc + 1)
    }
    lengthRecursive(list)
  }

  def lengthFucntional[A](list: List[A]): Int =
    list.foldLeft(0)((x, _) => x + 1)
}
