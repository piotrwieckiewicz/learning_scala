// package lab02.figures

// import lab02.numbers.DoubleUtils.DoubleWithAlmostEquals
// import lab02.numbers.Rational

// class Square(p1: Point, p2: Point, p3: Point, p4: Point) extends Rectangle(p1, p2, p3, p4) {
//   require(p1.dist(p2) ~= p1.dist(p4))

//   override val description: String = s"Square ($p1, $p2, $p3, $p4)"
// }

// object Square {
//   def apply(p1: Point, p2: Point, p3: Point, p4: Point): Square = new Square(p1, p2, p3, p4)

//   def transpose(r: Square, v: (Rational, Rational)): Square = {
//     new Square(Point.transpose(r.p1, v), Point.transpose(r.p2, v), Point.transpose(r.p3, v), Point.transpose(r.p4, v))
//   }
// }