// def isPrimeUgly(n: Int): Boolean = {
//   require(n>0)

//   var div = 2
//   while (div * div <= n){
//     if (n % div == 0) {
//       return false
//     }
//     div += 1
//   }
//   true
// }

// def isPrime(n: Int): Boolean = {
//   require(n>0)

//   // Can I check divs to sqrt(n) without using auxiliary function?
//   //SIP For example & with better performance we may have:
//   //  for (divisor <- 2 to Math.sqrt(n).toInt) {
//   //   if (n % divisor == 0) return false
//   // }

//   true  

//   for {div <- 2 until n if n % div == 0} return false
//   true
// }

// println(isPrimeUgly(16))
// println(isPrimeUgly(17))
// println(isPrime(16))
// println(isPrime(17))