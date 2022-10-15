// package Lab01

// object Scalar extends App {

//   def scalar(xs: List[Int], ys: List[Int]) =

//     require(xs.length == ys.length)

//     val list: List[Int] = for {
//       (x, y) <- xs zip ys
//     } yield x * y

//     list.sum

//   val list1: List[Int] = List(2, 4, 6, 8, 10)
//   val list2: List[Int] = List(10, 20, 30, 40, 50)

//   try {
//     val scalarValue = scalar(list1, list2)
//     println(scalarValue)
//   } catch {
//     case e: IllegalArgumentException => println("Lists must be the same size.")
//   }

// }
