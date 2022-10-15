// package lab05.plugins

// import scala.annotation.tailrec


// abstract class Pluginable {
//   def plugin(s: String): String = s
// }

// trait Reverting extends Pluginable {
//   abstract override def plugin(s: String): String = super.plugin(s.reverse)
// }

// trait LowerCasing extends Pluginable {
//   abstract override def plugin(s: String): String = super.plugin(s.toLowerCase)
// }

// trait SingleSpacing extends Pluginable {
//   abstract override def plugin(s: String): String = super.plugin(s.replaceAll(" +", " "))
// }

// trait NoSpacing extends Pluginable {
//   abstract override def plugin(s: String): String = super.plugin(s.replaceAll(" ", ""))
// }

// trait DuplicateRemoval extends Pluginable {
//   /*
//   When testing, I realised that I treat uppercase and lowercase as different characters.
//   I left it as it is, since it wasn't clear which version we should implement.
//   To change it, it should be enough to use toLower on 'char' in findDuplicates, and then use it again in lambda
//   given to filterNot.
//    */
//   //SIP Right
//   //Check also different solutions:
//   // trait DuplicateRemoval extends Pluginable {
//   //   abstract override def plugin(s: String): String = super.plugin(s.filter(c => (s.count(_ == c) == 1)))
//   // }

//   // trait DuplicateRemoval extends Pluginable {
//   //   abstract override def plugin(s: String): String = {
//   //     def removeDuplicates(s: String): String = {
//   //       val duplicates = s.diff(s.distinct).distinct
//   //       s.filterNot(duplicates.contains(_))
//   //     }
//   //     super.plugin(removeDuplicates(s))
//   //   }
//   // }
    
//   abstract override def plugin(s: String): String = {
//     @tailrec
//     def findDuplicates(xs: List[Char], duplicates: Set[Char], singletons: Set[Char]): Set[Char] = {
//       xs match {
//         case Nil => duplicates
//         case char :: rest => if (duplicates(char)) {
//           findDuplicates(rest, duplicates, singletons)
//         } else if (singletons(char)) {
//           findDuplicates(rest, duplicates + char, singletons - char)
//         } else {
//           findDuplicates(rest, duplicates, singletons + char)
//         }
//       }
//     }

//     val duplicates = findDuplicates(s.toList, Set(), Set())

//     super.plugin(s.toList.filterNot(duplicates(_)).mkString)
//   }
// }

// trait Rotating extends Pluginable {
//   //SIP Check also different solution with safe-methods take(.) & takeRight(.):
//   //super.plugin(s.takeRight(1) + s.take(s.length - 1))
//   abstract override def plugin(s: String): String = {
//     if (s.isEmpty) super.plugin(s) else super.plugin(s"${s.last}${s.dropRight(1)}")
//   }
// }

// trait Doubling extends Pluginable {
//   //SIP Nice, could be also done with regex: super.plugin(s.replaceAll("(.)(.)", "$1$2$2"))
//   abstract override def plugin(s: String): String = {
//     @tailrec
//     def iter(xs: List[Char], acc: List[Char], double: Boolean): String = {
//       xs match {
//         case Nil => acc.reverse.mkString
//         case char :: rest => if (double) iter(rest, char :: char :: acc, !double) else iter(rest, char :: acc, !double)
//       }
//     }
//     super.plugin(iter(s.toList, Nil, false))
//   }
// }

// trait Shortening extends Pluginable {
//   //SIP Nice, also could be done with regex: super.plugin(s.replaceAll("(.)(.)", "$1"))
//   //And with usage of sliding(.) method:  super.plugin(s.sliding(1,2).mkString)
//   abstract override def plugin(s: String): String = {
//     val short = for (i <- 0 until s.length if i % 2 == 0) yield s(i)
//     super.plugin(short.mkString)
//   }
// }
