package lists

import scala.annotation.tailrec

object P02 {

  @tailrec
  def penultimate[A](list: List[A]): A = list match {
    case head :: _ :: Nil => head
    case _ :: tail        => penultimate(tail)
    case _                => throw new NoSuchElementException
  }

}
