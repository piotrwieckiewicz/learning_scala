// def scalarUgly(xs: List[Int], ys: List[Int]): Int = {
//   // Had an if returning 0 here in case of lists of different length,
//   // changed after last lecture
//   //SIP Nice
//   require(xs.length == ys.length)

//   var it = 0
//   var sum = 0
//   while ( it < xs.length ) {
//     sum += xs(it)*ys(it)
//     it += 1
//   }
//   sum
// }

// def scalar(xs: List[Int], ys: List[Int]): Int = {
//   require(xs.length == ys.length)

//   if (xs == Nil) {
//     0
//   }
//   else {
//     //SIP Formatting (here & in different places): xs.head * ys.head
//     //Soon we will speak about scalariform & scalafmt plugins which will perform auto-formatting
//     xs.head*ys.head + scalar(xs.tail, ys.tail)

//     //SIP Could be also like this:
//     //scalar(xs: List[Int], ys: List[Int]): Int = (for ((x, y) <- xs zip ys) yield x * y).sum
//   }
// }

// println(scalarUgly(List(1,2,3), List(3,2,1)))
// println(scalar(List(1,2,3), List(3,2,1)))
