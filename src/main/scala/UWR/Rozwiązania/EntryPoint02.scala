// import lab02.figures.{Figure, Point, Rectangle, Square, Triangle}
// import lab02.numbers.Rational

// object EntryPoint02 extends App{
//   println("--- Figures ---")
//   val t1 = Triangle(Point(0, 0), Point(4, 0), Point(0, 4))
//   val r1 = Rectangle(Point(0, 3), Point(3, 0), Point(7,4), Point(4, 7))
//   val s1 = Square(Point(0, (1, 3)), Point(1, 0), Point((4,3), 1), Point((1,3), (4,3)))
//   val allFigures = List(t1, r1, s1)
//   Figure.printAll(allFigures)
//   println(s"Sum of all figures: ${Figure.areaSum(allFigures)}")

//   println("--- Transpose square by vector [5, 5] ---")
//   val s2 = Square(Point(0, 0), Point(0, 1), Point(1, 1), Point(1, 0))
//   println(s2)
//   println(Square.transpose(s2, (Rational(5), Rational(5))))
// }
