// package lab07

// import scala.language.implicitConversions

// package object money {
//   // I couldn't grasp how conversion and CurrencyConverter were supposed to look, so I changed the signature a little
//   //SIP Cleaner to have structure like:
//   // (EUR, PLN) ->...,
//   // (PLN, USD) -> ...,
//   // (USD, EUR) -> ...
//   //Also better to have this hardcoded val outside of money package (in EntryPoint07.scala)
//   //to let users change the Rates without modifying your code
//   val conversion: Map[Currency, (Currency, BigDecimal)] = Map(
//     Euro -> (Zloty, 4.63),
//     Zloty -> (Dollar, 0.24),
//     //SIP Redundant comma
//     Dollar -> (Euro, 0.89),
//   )

//   implicit val currencyConverter: CurrencyConverter = CurrencyConverter(conversion)

//   // Can this be done better?
//   //SIP We may also use Numeric[_] type class here & about type classes we will speak during Lecture 15
//   implicit def Decimal2Money(amount: BigDecimal): Currency => Money = currency => Money(amount, currency)
//   implicit def Double2Money(amount: Double): Currency => Money = currency => Money(amount, currency)
//   implicit def Int2Money(amount: Int): Currency => Money = currency => Money(amount, currency)

//   val EUR: Currency = Euro
//   val E: Currency = Euro // I tried to have € here, but it wouldn't compile (illegal character)
//   //SIP Its a tricky one, could be like: val `€`: Currency = EUR

//   val PLN: Currency = Zloty
//   val zl: Currency = Zloty

//   val USD: Currency = Dollar
//   val $: Currency = Dollar
// }
