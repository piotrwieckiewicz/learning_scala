// package lab07.money

// case class Money(amount: BigDecimal, currency: Currency)(implicit currencyConverter: CurrencyConverter) {

//   //SIP CamelCase
//   private def amount_as(new_currency: Currency): BigDecimal = {
//     amount * currencyConverter.convert(currency, new_currency)
//   }

//   def +(other: Money): Money = {
//     Money(amount + other.amount_as(currency), currency)
//   }

//   def -(other: Money): Money = {
//     Money(amount - other.amount_as(currency), currency)
//   }

//   def *(num: BigDecimal): Money = {
//     Money(amount * num, currency)
//   }

//   def as(new_currency: Currency): Money = {
//     Money(amount_as(new_currency), new_currency)
//   }

//   def >(other: Money): Boolean = {
//     amount > other.amount_as(currency)
//   }

//   //SIP Could be also, def <(other: Money): Boolean = other > this
//   def <(other: Money): Boolean = {
//     amount < other.amount_as(currency)
//   }

//   override def toString: String = f"$amount%1.2f${currency.symbol}"
// }
