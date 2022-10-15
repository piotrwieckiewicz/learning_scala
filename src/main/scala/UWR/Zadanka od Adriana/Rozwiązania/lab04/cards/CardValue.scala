// package lab04.cards

// sealed abstract class CardValue(val name: String, val short: String)

// sealed abstract class NumericalValue(name: String, short: String) extends CardValue(name, short)
// sealed abstract class FaceValue(name: String, short: String) extends CardValue(name, short)

// case object Ace extends CardValue("Ace", "A")
// //SIP Also could have just one case class here, like:
// // sealed abstract class Value    
// // case class Numerical(numericalValue: Int) extends Value {
// //    require(2 <= numericalValue && numericalValue <= 10)
// // }
// case object Two extends NumericalValue("Two", "2")
// case object Three extends NumericalValue("Three", "3")
// case object Four extends NumericalValue("Four", "4")
// case object Five extends NumericalValue("Five", "5")
// case object Six extends NumericalValue("Six", "6")
// case object Seven extends NumericalValue("Seven", "7")
// case object Eight extends NumericalValue("Eight", "8")
// case object Nine extends NumericalValue("Nine", "9")
// case object Ten extends NumericalValue("Ten", "10")

// case object Jack extends FaceValue("Jack", "J")
// case object Queen extends FaceValue("Queen", "Q")
// case object King extends FaceValue("King", "K")
