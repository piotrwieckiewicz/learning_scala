// package lab02.figures

// import lab02.numbers.DoubleUtils.{DoubleWithAlmostEquals, Precision}
// import lab02.numbers.Rational

// class Rectangle(val p1: Point, val p2: Point, val p3: Point, val p4: Point) extends Figure {
//   implicit val precision = Precision(0.001)
//   // For convenience, I assume the strict order of arguments.
//   require((p1.dist(p2) ~= p3.dist(p4)) && (p2.dist(p3) ~= p1.dist(p4)))
//   require(p1.dist(p2) * p1.dist(p2) + p1.dist(p4) * p1.dist(p4) ~= p2.dist(p4) * p2.dist(p4))

//   def area: Double = p1.dist(p2) * p1.dist(p4)

//   val description: String = s"Rectangle ($p1, $p2, $p3, $p4)"
// }

// object Rectangle {
//   def apply(p1: Point, p2: Point, p3: Point, p4: Point): Rectangle = new Rectangle(p1, p2, p3, p4)

//   def transpose(r: Rectangle, v: (Rational, Rational)): Rectangle = {
//     new Rectangle(Point.transpose(r.p1, v), Point.transpose(r.p2, v), Point.transpose(r.p3, v), Point.transpose(r.p4, v))
//   }
// }
