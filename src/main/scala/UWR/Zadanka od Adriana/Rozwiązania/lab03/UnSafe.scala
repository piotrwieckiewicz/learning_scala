// package lab03

// object UnSafe {
//   def unSafe[T](ex: Exception)(block: => T): T =
//     try {
//       block
//     }
//     catch {
//       case e: Exception =>
//         println("unSafe caught exception: " + e)
//         throw ex
//     }
// }
