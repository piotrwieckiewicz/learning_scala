package lists

import scala.annotation.tailrec

object P08 {

  def compressFunctional[A](list: List[A]): List[A] = {

    list.foldRight(List[A]())((next, current) =>
      if current.isEmpty || current.head != next then next :: current
      else current
    )

  }

  def compress[A](list: List[A]): List[A] = {
    @tailrec
    def compressRec(
        list: List[A],
        compressed: List[A] = List(),
        current: Option[A] = None
    ): List[A] = {

      list match
        case head :: tail => {
          if head != current.getOrElse(None) then
            compressRec(tail, head :: compressed, Some(head))
          else compressRec(tail, compressed, current)
        }
        case Nil => compressed.reverse
    }
    compressRec(list)
  }

}
