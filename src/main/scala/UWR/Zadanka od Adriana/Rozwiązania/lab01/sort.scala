// def sortUgly(xs: List[Int]): List[Int] = {
//   //SIP Could be also:
//   // if (xs == Nil)
//   //  Nil
//   // else {
//   //  ...
//   // }
//   if (xs == Nil){
//     Nil
//   }
//   else {
//     val pivot = xs.head
//     var lesser: List[Int] = Nil
//     var greater: List[Int] = Nil
//     var equal: List[Int] = Nil
//     var it = 0
//     while (it < xs.length) {
//       if (xs(it) < pivot) {
//         lesser = xs(it) :: lesser
//       }
//       else if (xs(it) == pivot) {
//         equal = xs(it) :: equal
//       }
//       else {
//         greater = xs(it) :: greater
//       }
//       it += 1
//     }
//     sortUgly(lesser) ::: equal ::: sortUgly(greater)
//   }
// }

// def sort(xs: List[Int]): List[Int] = {
//   xs match {
//     case Nil => Nil
//     case pivot::tail =>
//       // Can I make it more efficient using just list comprehension?
//       //SIP for comprehension, list comprehension is in Python ;)
//       //Could be also like:
//       // def sort(xs: List[Int]): List[Int] = {
//       //   if (xs.length <= 1) return xs

//       //   val pivot = xs(xs.length / 2)
//       //   val lesserThanPivot = xs.filter(_ < pivot)
//       //   val equalToPivot = xs.filter(_ == pivot)
//       //   val greaterThanPivot = xs.filter(_ > pivot)

//       //   sort(lesserThanPivot) ++ equalToPivot ++ sort(greaterThanPivot)
//       // }

//       val lesser = for{ x <- tail if x < pivot } yield x
//       val equal = for{ x <- tail if x == pivot } yield x
//       val greater = for{ x <- tail if x > pivot } yield x
//       sort(lesser) ::: (pivot::equal) ::: sort(greater)
//   }
// }

// println(sortUgly(List(3,1,2,4,6,5)))
// println(sort(List(3,1,2,4,6,5)))
