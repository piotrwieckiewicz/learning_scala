// package lab07.money

// case class CurrencyConverter(conversion: Map[Currency, (Currency, BigDecimal)]) {
//   def convert(from: Currency, to: Currency): BigDecimal = {
//     //SIP Naming convension. Stick to one (CamelCase is everywhere else) - currentRatio
//     def aux(current_ratio: BigDecimal, currency: Currency): BigDecimal = {
//       //SIP Would be safer to operate on Options here & handle the calls for non supported currencies, example: convert(PLN, ₿)
//       // conversion.get((from, to)) match {
//       //     case Some(rate) => ...
//       //     case None => throw new RatesException(s"Conversion non supported, $from -> $to")  
//       if (currency == to) {
//         current_ratio
//       } else {
//         val (next: Currency, rate: BigDecimal) = conversion(currency)
//         aux(current_ratio * rate, next)
//       }
//     }
//     aux(1, from)
//   }
// }
