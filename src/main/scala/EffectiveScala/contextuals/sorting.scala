package contextuals

import scala.annotation.tailrec
import contextuals.CustomOrdering

def sort[A](list: List[A])(using ord: Ordering[A]): List[A] = {

  @tailrec
  def insert(
      elem: A,
      sortedList: List[A],
      acc: List[A] = Nil
  ): List[A] = {

    sortedList match
      case Nil => (elem :: acc).reverse
      case head :: tail =>
        if ord.lt(head, elem) then insert(elem, tail, head :: acc)
        else acc.reverse ::: elem :: sortedList
  }

  @tailrec
  def sortRec(list: List[A], acc: List[A]): List[A] = {
    list match
      case Nil          => acc
      case head :: tail => sortRec(tail, insert(head, acc))
  }

  sortRec(list, Nil)

}
