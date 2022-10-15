// package Lab04.cards

// sealed abstract class CardColor(val symbol: String)

// case object Spades extends CardColor("♠")
// case object Hearts extends CardColor("♥")
// case object Clubs extends CardColor("♣")
// case object Diamonds extends CardColor("♦")

// sealed abstract class CardValue(val value: Int, val symbol: String)
// sealed abstract class NumericalValue(value: Int, symbol: String) extends CardValue(value, symbol)
// sealed abstract class FaceValue(value: Int, symbol: String) extends CardValue(value, symbol)

// case object Ace extends CardValue(value=1, symbol="A")
// case object Two extends NumericalValue(value=2, symbol="2")
// case object Three extends NumericalValue(value=3, symbol="3")
// case object Four extends NumericalValue(value=4, symbol="4")
// case object Five extends NumericalValue(value=5, symbol="5")
// case object Six extends NumericalValue(value=6, symbol="6")
// case object Seven extends NumericalValue(value=7, symbol="7")
// case object Eight extends NumericalValue(value=8, symbol="8")
// case object Nine extends NumericalValue(value=9, symbol="9")
// case object Ten extends NumericalValue(value=10, symbol="10")
// case object Jack extends FaceValue(value=10, symbol="J")
// case object Queen extends FaceValue(value=10, symbol="Q")
// case object King extends FaceValue(value=10, symbol="K")

// case class Card(value: CardValue, color: CardColor) {
//   override def toString(): String = s"${value.symbol}${color.symbol}"
// }

// val colors: List[CardColor] = List(Spades, Hearts, Clubs, Diamonds)
// val values: List[CardValue] = List(Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King)
