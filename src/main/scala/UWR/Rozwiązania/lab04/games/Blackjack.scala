// package lab04.games

// import lab04.cards.Card
// import lab04.deck.Deck
// import lab04.cards.{Ace, FaceValue, NumericalValue}

// import scala.annotation.tailrec

// class Blackjack(deck: Deck) {
//   // I wasn't sure how to handle aces, so I decided to return a list of possible scores
//   private def score(card: Card): List[Int] = {
//     card.value match {
//       case numVal: NumericalValue => List(numVal.short.toInt)
//       case _: FaceValue => List(10)
//       case Ace => List(1, 11)
//     }
//   }

//   private def score(cards: List[Card]): List[Int] = {
//     cards match {
//       case Nil => List(0)
//       case first::rest =>
//         val scores = for {
//         cardScore <- score(first);
//         restScore <- score(rest)
//       } yield cardScore + restScore

//         scores.distinct
//     }
//   }

//   def play(n: Int): Unit = {
//     @tailrec
//     def takeOne(n: Int, deck: Deck, cards: List[Card]): Unit =
//       n match {
//         case 0 => println(score(cards))
//         case _ =>
//           val card = deck.top()
//           println(s"${deck.top()}: ${score(card)}")
//           takeOne(n - 1, deck.pull(), card::cards)
//       }

//     takeOne(n, deck, List())
//   }

//   private def find21(cards: List[Card], deck: Deck): List[List[Card]] = {
//     val scores = score(cards)

//     if (scores.min < 21 && !deck.isEmpty)
//       find21(deck.top()::cards, deck.pull()):::find21(cards, deck.pull())
//     else if (scores.contains(21))
//       List(cards)
//     else
//       Nil
//   }

//   lazy val all21: List[List[Card]] = {
//     find21(List(), deck)
//   }

//   // is using polymorphism more elegant than auxiliary functions?
//   private def first21(cards: List[Card], deck: Deck): Option[List[Card]] = {
//     val scores = score(cards)

//     if (scores.contains(21))
//       Some(cards)
//     else if (scores.min < 21 && !deck.isEmpty)
//       first21(deck.top()::cards, deck.pull()) match {
//         case Some(cards) => Some(cards)
//         case None => first21(cards, deck.pull())
//       }
//     else None
//   }

//   def first21(): Option[List[Card]] = first21(List(), deck)

// }


// object Blackjack {
//   def apply(numOfDecks: Int): Blackjack = {
//     require(numOfDecks > 0)
//     new Blackjack(Deck(numOfDecks))
//   }
// }
