// package lab04.cards

// sealed abstract class CardColor(val name: String, val symbol: String)

// case object Clubs extends CardColor("Clubs", "♣" )
// case object Diamonds extends CardColor("Diamonds", "♦" )
// case object Hearts extends CardColor("Hearts", "♥")
// case object Spades extends CardColor("Spades", "♠")

// //SIP Enumeration is from Java & the case objects one is the recommended in Scala 2.x.
// //It changed with Scala 3.0, where the keyword "enum" is introduced. 
// //Will speak about it on Lecture 15
// /*
// I was also thinking about this, it seems more concise

// object CardColor extends Enumeration {
//   val Clubs: CardColor.Value = Value("♣")
//   val Diamonds: CardColor.Value = Value("♦")
//   val Hearts: CardColor.Value = Value("♥")
//   val Spades: CardColor.Value = Value("♠")
// }
//  */
