// package lab02.numbers

// /*
// Based on:
// https://stackoverflow.com/questions/8385458/how-to-compare-floating-point-values-in-scala
// https://alvinalexander.com/scala/scala-2.10-implicit-class-example/
//  */

// //SIP Nice trick with approximately equals operator
// object DoubleUtils {
//   case class Precision(p: Double)

//   implicit class DoubleWithAlmostEquals(val d: Double) extends AnyVal {
//     def ~=(d2: Double)(implicit p: Precision) = (d - d2).abs < p.p
//   }
// }
