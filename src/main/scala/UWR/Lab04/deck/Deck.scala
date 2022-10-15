// package Lab04.deck

// import scala.util.Random
// import Lab04.cards._

// object Deck {
//   def apply(): Deck = {
//     val cards: List[Card] = for {
//       c: CardColor <- colors
//       v: CardValue <- values
//     } yield Card(v, c)
//     Deck(Random.shuffle(cards))
//   }
// }

// case class Deck(cards: List[Card]) {
//   override def toString(): String = cards.toString
//   val isEmpty: Boolean = cards.isEmpty
//   def length: Int = cards.length
//   def top: Card = cards.head
//   def tail: Deck = Deck(cards.tail)
//   def push(c: Card): Deck = Deck(c :: cards)
//   def push(color: CardColor, value: CardValue): Deck = Deck(Card(value, color) :: cards)
//   val isStandard: Boolean = if (cards.length == 52 && cards.distinct.length == 52) true else false
//   def duplicatedOfCard(card: Card): Int = cards.count(_ == card)

//   private def countCards(p: (c: Card) => Boolean): Int = {
//     cards.foldLeft(0)((count: Int, c: Card) => if (p(c)) count + 1 else count)
//   }

//   private def isNumericalValue(x: Any): Boolean = x match {
//     case o: NumericalValue => true
//     case _ => false
//   }

//   private def isFaceValue(x: Any): Boolean = x match {
//     case o: FaceValue => true
//     case _ => false
//   }

//   def amountOfColor(color: CardColor): Int = countCards(c => c.color == color)
//   def amountOfNumerical(numerical: NumericalValue): Int = countCards(c => c.value == numerical)
//   val amountWithNumerical: Int = countCards(c => isNumericalValue(c.value))
//   def amountOfFace(face: FaceValue): Int = countCards(c => c.value == face)
//   val amountWithFace: Int = countCards(c => isFaceValue(c.value))
// }
