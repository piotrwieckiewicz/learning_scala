// package lab02.numbers

// import lab02.numbers.Rational.{invert, opposite}

// import scala.annotation.tailrec

// class Rational(n: Int, d: Int) {
//   require(d != 0)

//   @tailrec private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b)
//   private val g = gcd(n.abs, d.abs)

//   val numer: Int = if (d > 0) n/g else -n/g
//   val denom: Int = d.abs/g

//   override def toString: String = if (numer%denom != 0) s"${numer/denom} ${numer%denom}/$denom" else s"${numer/denom}"

//   def +(other: Rational): Rational = {
//     val newN = numer*other.denom + other.numer*denom
//     val newD = denom*other.denom
//     new Rational(newN, newD)
//   }

//   def -(other: Rational): Rational = this + opposite(other)

//   def *(other: Rational): Rational = {
//     val newN = numer*other.numer
//     val newD = denom*other.denom
//     new Rational(newN, newD)
//   }

//   def /(other: Rational): Rational = {
//     require(other.numer != 0) // Should I even do it here again if it's already done in invert?
//     //SIP Yes. It may look redundant, but:
//     //Constraint checks should be on the beginning of calculation
//     //Also when some developer will by mistake remove the check in method invert(.), then we are still safe here
//     this * invert(other)
//   }
// }

// object Rational {

//   def invert(r: Rational): Rational = {
//     require(r.numer != 0)
//     new Rational(r.denom, r.numer)
//   }

//   def opposite(r: Rational): Rational = new Rational(-r.numer, r.denom)

//   def square(r: Rational): Rational = r * r

//   def sqrt(r: Rational): Double = scala.math.sqrt(r.numer.toDouble / r.denom.toDouble)

//   val zero: Rational = new Rational(0, 1)

//   val one: Rational = new Rational(1, 1)

//   def apply(n: Int, d: Int) = new Rational(n, d)
//   def apply(n: Int) = new Rational(n, 1)

//   def abs(r: Rational): Rational = if (r.numer < 0) opposite(r) else r

// }
