// package lab02.figures

// import lab02.numbers.Rational

// class Triangle(val p1: Point, val p2: Point, val p3: Point) extends Figure {
//   //SIP Missing require(.) to check if points create a triangle
//   //Now for example, user may invoke: new Traingle(new Point(0,0), new Point(0,0), new Point(0,0))
//   def area: Double = {
//     // Using heron's formula. It's not great from numerical perspective, but it's the easiest to implement.
//     val (a, b, c) = (p1.dist(p2), p2.dist(p3), p3.dist(p1))
//     val s = (a + b + c) / 2
//     math.sqrt(s*(s-a)*(s-b)*(s-c))
//   }

//   val description = s"Triangle ($p1, $p2, $p3)"

// }

// object Triangle {
//   def apply(p1: Point, p2: Point, p3: Point): Triangle = new Triangle(p1, p2, p3)

//   def transpose(t: Triangle, v: (Rational, Rational)): Triangle = {
//     new Triangle(Point.transpose(t.p1, v), Point.transpose(t.p2, v), Point.transpose(t.p3, v))
//   }
// }
