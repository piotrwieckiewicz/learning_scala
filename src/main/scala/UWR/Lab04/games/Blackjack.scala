// package Lab04.games

// import Lab04.cards.*
// import Lab04.deck.Deck
// import Lab04.deck.Hand

// import scala.annotation.tailrec
// import scala.io.StdIn.readLine

// case class Blackjack(deck: Deck) {

//   def play(n: Int): Hand = {
//     @tailrec
//     def createHand(currentHand: Hand, deckToPullFrom: Deck): Hand = {
//       if (currentHand.length == n) currentHand
//       else
//         createHand(
//           currentHand = currentHand.add(card = deckToPullFrom.top),
//           deckToPullFrom = deckToPullFrom.tail
//         )
//     }
//     createHand(currentHand = Hand(), deckToPullFrom = deck)
//   }

//   // def playInput() = {

//   //   println("start")
//   //   // val userInput: String = readLine()

//   //   @tailrec
//   //   def recursivePlay(currentHand: Hand, deckToPullFrom: Deck): Unit = {

//   //     val newCard: Card = deckToPullFrom.top
//   //     val hand: Hand = currentHand.add(card = newCard)

//   //     println(s"Current hand: $hand")
//   //     println(s"Current score: ${hand.score}")
//   //     println("Next card?")

//   //     val continueDecision = readLine()
//   //     continueDecision match
//   //       case "y" =>
//   //         recursivePlay(
//   //           currentHand = hand,
//   //           deckToPullFrom = deckToPullFrom.tail
//   //         )
//   //       case _ => println("end")
//   //   }
//   //   recursivePlay(currentHand = Hand(), deckToPullFrom = deck)
//   // }

//   // private def find21(hand: Hand, deck: Deck): List[List[Card]] = {
//   //   val scores = hand.score

//   //   if (scores.min < 21 && !deck.isEmpty)
//   //     find21(deck.top :: cards, deck.tail) ::: find21(cards, deck.tail)
//   //   else if (scores.contains(21))
//   //     List(cards)
//   //   else
//   //     Nil
//   // }

//   // lazy val all21: List[List[Card]] = {
//   //   find21(List(), deck)
//   // }
// }

// object Test extends App {

//   val deck: Deck = Deck()
//   val aceOfSpades: Card = Card(Ace, Spades)
//   val aceOfClubs: Card = Card(Ace, Clubs)
//   val twoOfHearts: Card = Card(Two, Hearts)
//   val tenOfHearts: Card = Card(Ten, Hearts)
//   val nonStandardDeck: Deck = Deck().push(value = Ace, color = Spades)

//   val game: Blackjack = Blackjack(deck)

//   // val hand: Hand = game.play(4)
//   // val hand: Hand = Hand(cards = List(aceOfSpades, aceOfClubs))
//   // val hand: Hand = Hand()

//   // println(hand)
//   // println(hand.score)

//   val l1 = List(1, 2, 3)
//   val l2 = List(4, 5, 6)



// }
