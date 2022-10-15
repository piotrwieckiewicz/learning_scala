// //SIP Redundant method, its already defined in isPrime.scala
// def isPrime(n: Int): Boolean = {
//   require(n>0)
//   for {div <- 2 until n if n % div == 0} return false
//   true
// }

// def primePairsUgly(n:Int): List[(Int, Int)] = {
//   require(n>0)

//   var primePairs: List[(Int, Int)] = Nil
//   var j = 1
//   while (j < n) {
//     var i = j+1

//     while (i < n) {
//       if (isPrime(i + j)) {
//         primePairs = (i, j)::primePairs
//       }
//       i += 1
//     }
//     j += 1
//   }
//   primePairs
// }

// def primePairs(n:Int): List[(Int, Int)] = {
//   require(n>0)

//   for { j <- (1 until n).toList
//         i <- (j+1 until n).toList
//         if isPrime(i+j)
//         } yield (i, j)
// }

// println(primePairsUgly(10))
// println(primePairs(10))
