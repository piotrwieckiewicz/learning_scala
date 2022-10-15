package lists

import scala.annotation.tailrec

object P05 {

  def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def reverseRecursive(list: List[A], acc: List[A] = List()): List[A] = {
      list match
        case head :: tail => reverseRecursive(list.tail, acc = head :: acc)
        case Nil          => acc
    }
    reverseRecursive(list)
  }

  def reverseFunctional[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]())((x, y) => y :: x)
  }
}
