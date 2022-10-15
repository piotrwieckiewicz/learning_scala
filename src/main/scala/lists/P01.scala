package lists

import scala.annotation.tailrec

object P01 {

  @tailrec
  def last[A](list: List[A]): A = {
    list match {
      case head :: Nil  => head
      case head :: tail => last(list.tail)
      case Nil          => throw new NoSuchElementException
    }
  }

}
