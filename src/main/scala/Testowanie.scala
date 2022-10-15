import contextuals.{sort, Person, Rational}
import contextuals.CustomOrdering.given
import scala.util.Sorting

object Testowanie extends App {

  val list = List(1, 5, 2, 3, 4, 67, 8)
  val strings = List("baba", "zupa", "arbuz")

  val p1 = Person("Piotrek", 29)
  val p2 = Person("Zbyszek", 19)
  val p3 = Person("Maria", 59)

  val persons = List(p1, p2, p3)

  val r1 = Rational(6, 2)
  val r2 = Rational(7, 2)
  val r3 = Rational(5, 2)
  val r4 = Rational(5, 3)

  val rationals = List(r1, r2, r3, r4)

  // println(sort(list))
  // println(sort(strings))
  // println(sort(persons))
  // println(sort(rationals))

  println(sort(List(List(1, 2, 3), List(5, 2), List(1, 2, 3, 5))))

}
