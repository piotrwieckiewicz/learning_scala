// package Lab04.deck

// import scala.util.Random
// import Lab04.cards._

// object Hand{
//   def apply(): Hand = Hand(cards=List())
// }

// case class Hand(cards: List[Card]) {

//   override def toString: String = cards.toString
//   def length: Int = cards.length
//   def add(card: Card): Hand = Hand(cards :+ card)

//   private def getScore(card: Card): List[Int] = {
//     card.value match {
//       case face: FaceValue => List(10)
//       case numeric: NumericalValue => List(card.value.value)
//       case Ace => List(1, 11)
//       case null => List(0)
//     }
//   }
  
//   private def getScore(cards: List[Card]): List[Int] = {
//     cards match
//       case Nil => List(0)
//       case head::tail => {
//         val scores = for
//             x <- getScore(head)
//             y <- getScore(tail)
//           yield x + y
//         scores.distinct
//       }
//   }

//   val score: List[Int] = getScore(cards)

// }

