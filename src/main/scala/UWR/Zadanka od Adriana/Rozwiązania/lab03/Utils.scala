// package lab03

// import scala.annotation.tailrec

// object Utils {
//   def isSorted(as: List[Int], ordering: (Int, Int) => Boolean): Boolean = {
//     @tailrec
//     def aux(prev: Int, as: List[Int]): Boolean = {
//       as match {
//         case Nil => true
//         case head::tail => if (ordering(prev, head)) aux(head, tail) else false
//       }
//     }
//     as match {
//       case Nil => true
//       case head::tail => aux(head, tail)
//     }
//   }

//   //SIP Could be even simpler: isSorted(as, _ < _)
//   def isAscSorted(as: List[Int]): Boolean = isSorted(as, (_: Int) < (_: Int))

//    //SIP Similar idea as above
//   def isDescSorted(as: List[Int]): Boolean = isSorted(as, (_: Int) > (_: Int))

//   @tailrec
//   def foldLeft[A, B](l: List[A], z: B)(f: (B, A) => B): B = {
//     l match {
//       case Nil => z
//       case head::tail => foldLeft(tail, f(z, head))(f)
//     }
//   }

//   def sum(l: List[Int]): Int = foldLeft(l, 0)((_: Int) + (_: Int))

//   def length[A](l: List[A]): Int = foldLeft(l, 0)((len: Int, _: A) => len + 1)

//   def compose[A, B, C](f: B => C, g: A => B)(x: A): C = f(g(x))

//   // should this really be repeated[A, B]?
//   //SIP Right B is redundant here
//   def repeated[A](f: A => A, n: Int): A => A = {
//     require(n > 0)
//     //SIP Idea with recursive function is really good. May also reuse foldLeft(.) like:
//     //foldLeft((0 until n).toList, identity[A] _)((ff, _) => compose(f, ff))
//     if (n == 1) f else compose(repeated(f, n-1), f)
//   }

//   def curry[A, B, C](f: (A, B) => C): A => B => C = (a: A) => (b: B) => f(a, b)

//   // shouldn't uncurry(f)(1, 1)(1) be uncurry(f)(1, 1)?
//   //SIP Right. Solution is correct
//   def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)
// }
