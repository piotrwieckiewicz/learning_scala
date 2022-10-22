package contextuals

case class Rational(num: Int, denom: Int)

object Rational:
  given fromInt: Conversion[Int, Rational] with
    def apply(n: Int): Rational = Rational(n, 1)


