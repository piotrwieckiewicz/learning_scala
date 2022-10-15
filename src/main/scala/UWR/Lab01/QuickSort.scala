// package Lab01

// import scala.annotation.tailrec

// object QuickSort extends App {

//   def sort(xs: List[Int]): List[Int] = {
//     if (xs.length <= 1) xs
//     else {
//       val pivot = xs(xs.length / 2)
//       val listLower = xs.filter(_ < pivot)
//       val listBigger = xs.filter(_ > pivot)
//       (sort(listLower) :+ pivot) ++ sort(listBigger)
//     }
//   }

//   val list = List(12,9,1,8,7,4,5,6,3,2,1)
//   println(sort(list))
// }
