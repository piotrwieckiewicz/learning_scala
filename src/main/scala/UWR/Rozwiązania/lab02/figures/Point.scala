// package lab02.figures

// import lab02.numbers.Rational
// import lab02.numbers.Rational.{square, sqrt}

// class Point(val x: Rational, val y: Rational) {
//   def dist(other: Point): Double = sqrt(square(x-other.x) + square(y-other.y))

//   override def toString = s"($x, $y)"
// }

// object Point {
//   def apply (a: Rational, b: Rational): Point = new Point(a, b)
//   def apply (a: (Int, Int), b: (Int, Int)): Point = new Point(new Rational(a._1, a._2), new Rational(b._1, b._2))
//   def apply (a: Int, b: Int): Point = new Point(Rational(a), Rational(b))
//   def apply (a: Int, b: (Int, Int)): Point = new Point(Rational(a), Rational(b._1, b._2))
//   def apply (a: (Int, Int), b: Int): Point = new Point(Rational(a._1, a._2), Rational(b))

//   // In ideal scenario v would be of type vector, but let's not overdo it
//   //SIP :)
//   def transpose(p: Point, v: (Rational, Rational)): Point = new Point(p.x + v._1, p.y + v._2)
// }
