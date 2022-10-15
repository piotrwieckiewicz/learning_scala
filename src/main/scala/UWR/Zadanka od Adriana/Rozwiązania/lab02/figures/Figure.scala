// package lab02.figures

// abstract class Figure {
//   def area: Double

//   val description: String

//   //SIP May also use string interpolation here: s"$description, area: $area"
//   override def toString: String = description + ", area: " + area
// }

// object Figure{
//   //SIP Could be also: figures.map(_.area).sum
//   def areaSum(figures: List[Figure]): Double = (for (figure <- figures) yield figure.area).sum
//   //SIP Could also be like: figures.foreach(f => println(f.description))
//   def printAll(figures: List[Figure]): Unit = for (figure <- figures) yield println(figure)
// }
