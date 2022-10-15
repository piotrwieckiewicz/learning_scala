// package Lab02.numbers

// import scala.annotation.targetName

// case class Rational(n1: Int, n2: Int) {
//   require(n2 != 0)

//   @targetName("+")
//   def +(other: Rational): Rational = {
//     val new_n1 = this.n1 * other.n2 + this.n2 * other.n1
//     val new_n2 = this.n2 * other.n2
//     Rational(n1=new_n1, n2=new_n2)
//   }
//   @targetName("-")
//   def -(other: Rational): Rational = {
//     val new_n1 = this.n1 * other.n2 - this.n2 * other.n1
//     val new_n2 = this.n2 * other.n2
//     Rational(n1=new_n1, n2=new_n2)
//   }
//   @targetName("*")
//   def *(other: Rational): Rational = {
//     val new_n1 = this.n1 * other.n1
//     val new_n2 = this.n2 * other.n2
//     Rational(n1=new_n1, n2=new_n2)
//   }
//   @targetName("/")
//   def /(other: Rational): Rational = {
//     val new_n1 = this.n1 * other.n2
//     val new_n2 = this.n2 * other.n1
//     Rational(n1=new_n1, n2=new_n2)
//   }
//   def square: Rational = this * this
//   def sqrt: Double = scala.math.sqrt(this.n1.toDouble / this.n2.toDouble)

//   override def toString: String = {
//     if (n1 % n2 != 0) s"${n1 / n2} ${n1 % n2}/$n2"
//     else s"${n1 / n2}"
//   }
// }

// object Rational {
//   val zero: Rational = Rational(n1=0, n2=1)
//   val one: Rational = Rational(n1=1, n2=1)
//   def apply(n: Int): Rational = Rational(n,1)
// }


// object Numbers extends App {
//   val three: Rational = Rational(n1=3, n2=1)
//   val five: Rational = Rational(5)
//   val pi: Rational = Rational(n1=22, n2=7)

//   println(pi)


// }
