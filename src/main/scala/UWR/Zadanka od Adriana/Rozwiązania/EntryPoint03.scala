// import lab03.UnSafe.unSafe
// import lab03.Utils._

// object EntryPoint03 extends App {
//   // Sorted
//   assert(isAscSorted(List(1, 2, 3, 4, 5)))
//   assert(!isAscSorted(List(1, 2, 4, 3, 5)))
//   assert(isDescSorted(List(5, 4, 3, 2, 1)))
//   assert(!isDescSorted(List(1, 2, 3, 4, 5)))

//   // Fold
//   assert(sum(List(1, 2, 3, 4, 5)) == 15)
//   assert(length(List('a', 'b', 'c', 'd', 'e')) == 5)

//   // Compose
//   assert(repeated[Int](_ + 1, 5)(5) == 10)
//   assert(repeated[Int](_ * 2, 10)(1) == 1024)

//   // Curry
//   assert(curry[Int, Int, Int](_ + _)(42)(5) == 42 + 5)
//   assert(uncurry(curry[Int, Int, Int](_ + _))(42, 5) == 42+5)

//   // UnSafe
//   try {
//     unSafe(new RuntimeException("Ex")) {
//       1 / 0
//     }
//   }
//   catch {
//     case e: Exception => println("unSafe raised exception: " + e)
//   }

//   val x = try {
//     unSafe(new RuntimeException("Ex")) {
//        15
//     }
//   }
//   catch {
//     case e: Exception => println("unSafe raised exception: " + e)
//   }

//   println(x)
// }
