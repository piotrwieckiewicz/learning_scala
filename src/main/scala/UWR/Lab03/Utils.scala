// package Lab03

// import scala.annotation.tailrec
// import scala.runtime.Nothing$

// object Utils {

//   def isSorted(listToBeChecked: List[Int], ordering: (Int, Int) => Boolean): Boolean = {
//     val zippedList = listToBeChecked.zip(listToBeChecked.tail)
//     @tailrec
//     def inner(list: List[(Int, Int)]): Boolean = {
//       val n1 = list.head(0)
//       val n2 = list.head(1)
//       if (list.tail.isEmpty) true
//       else {
//         if (!ordering(n1, n2)) false
//         else inner(list.tail)
//       }
//     }
//     inner(zippedList)
//   }
//   def isAscSorted(as: List[Int]): Boolean = isSorted(as, _ < _)
//   def isDescSorted(as: List[Int]): Boolean = isSorted(as, _ > _)

//   @tailrec
//   def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B = {
//     l match
//       case Nil => z
//       case head::tail => foldLeft(tail, f(z, head))(f)
//   }
//   def sum(l: List[Int]): Int = foldLeft(l, 0)(_+_)
//   def length(l: List[Int]): Int = foldLeft(l, 0)((x: Int, y: Int) => x + 1)

// }


// object Tests extends App {

//   val sortedListAsc: List[Int] = List(1,2,3,4,5,10)
//   val sortedListDesc: List[Int] = List(3,2,1,0)
//   val res1 = Utils.isAscSorted(sortedListAsc)
//   val res2 = Utils.isAscSorted(sortedListDesc)
//   val res3 = Utils.isDescSorted(sortedListAsc)
//   val res4 = Utils.isDescSorted(sortedListDesc)

//   def unSafe[T](ex: Exception)(block: T) = {
//     try {
//       block
//     }
//     catch {
//       case _: Exception => println("D")
//     }
//   }



  
  

// }
