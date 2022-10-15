// package lab04.deck

// import lab04.cards._

// import scala.util.Random

// class Deck(cards: List[Card]) {
//   // We need some way to check if the deck is empty
//   val isEmpty: Boolean = cards.isEmpty

//   // We need some method that allows us to check the top card of the deck
//   //SIP Bug... Will throw exception when cards == Nil
//   def top(): Card = cards.head

//   def pull(): Deck = if (!isEmpty) new Deck(cards.tail) else throw new RuntimeException("Can't pull from an empty deck")

//   def push(c: Card): Deck = new Deck(c::cards)

//   def push(color: CardColor, value: CardValue): Deck = new Deck(Card(color, value)::cards)

//   val isStandard: Boolean = cards.size == 52 && cards.distinct.size == cards.size

//   //SIP All of these methods below are very similar & better to create some higher order private method
//   //to hide the duplication like: private myFold(f: (Int, Card) => Int)): Int = ...
//   //& then invoke it in all the methods, for example:
//   //def amountOfColor(color: CardColor): Int = myFold((count: Int, currentCard: Card) => if (currentCard.color == color) count + 1 else count) 
        
//   def duplicatesOfCard(card: Card): Int =
//    //SIP Bug.. When card is only once in cards then the result will be: 1 duplicate (instead of 0)
//    //Could be like:
//    //  val res = cards.foldLeft(0: Int)((count: Int, currentCard: Card) => if (currentCard == card) count + 1 else count)     
//    //  Seq(res - 1, 0).max
//     cards.foldLeft(0: Int)(
//       (count: Int, currentCard: Card) => if (currentCard == card) count + 1 else count
//     )

//   def amountOfColor(color: CardColor): Int =
//     cards.foldLeft(0: Int)(
//       (count: Int, currentCard: Card) => if (currentCard.color == color) count + 1 else count
//     )

//   def amountOfNumerical(numerical: NumericalValue): Int =
//     cards.foldLeft(0: Int)(
//       (count: Int, currentCard: Card) => if (currentCard.value == numerical) count + 1 else count
//     )

//   val amountWithNumerical: Int =
//     //SIP Better to use Pattern matching instead of isInstanceOf(.)
//     //Same issue in amountWithFace(.) method
//     cards.foldLeft(0: Int)(
//       (count: Int, currentCard: Card) => if (currentCard.value.isInstanceOf[NumericalValue]) count + 1 else count
//     )

//   def amountOfFace(face: FaceValue): Int =
//     cards.foldLeft(0: Int)(
//       (count: Int, currentCard: Card) => if (currentCard.value == face) count + 1 else count
//     )

//   val amountWithFace: Int =
//     cards.foldLeft(0: Int)(
//       (count: Int, currentCard: Card) => if (currentCard.value.isInstanceOf[FaceValue]) count + 1 else count
//     )
// }

// object Deck{
//   def apply(numOfDecks: Int = 1): Deck = {
//     require(numOfDecks > 0)
//     // would've been easier if it had been an Enum
//     val allColors = List(Clubs, Diamonds, Hearts, Spades)
//     val allValues = List(Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King)
//     val allCards = for {color <- allColors; value <- allValues; _ <- 0 until numOfDecks} yield Card(color, value)
//     new Deck(Random.shuffle(allCards))
//   }
// }
