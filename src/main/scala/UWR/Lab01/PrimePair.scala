// package Lab01
// import Prime.isPrime

// object PrimePair extends App {

//   def getPairs(n: Int): List[(Int, Int)] = {

//     val lists: IndexedSeq[(Int, Int)] = for {
//       x: Int <- 1 to (n / 2).toInt
//       y: Int <- x + 1 to (n / 2).toInt - 1
//       pair: (Int, Int) = (x, y) if (x + y <= n / 2) && isPrime(x + y)
//     } yield pair

//     lists.toList

//   }

//   val pairs: List[(Int, Int)] = getPairs(50)
//   println(pairs)

// }
