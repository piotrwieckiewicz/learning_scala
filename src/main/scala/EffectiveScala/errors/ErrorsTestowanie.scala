package errors

import scala.util.{Success, Failure}
import errors.{BadFunctions, Reader, Time, Validation}

object ErrorsTestowanie extends App {

  // try BadFunctions.badFunction()
  // catch case exp: RuntimeException => println("Oh noes!")
  // finally println("finally")

  // BadFunctions
  //   .badFunctionTry()
  //   .recover({ case exn: RuntimeException =>
  //     println("Exception caught")
  //   })

  // Time.parseDate("2022-10-2334") match
  //   case Success(date)      => println(s"Udao sie: $date")
  //   case Failure(throwable) => println(s"Nie udao sie: $throwable")

  val period = Time.tryPeriod2("2022-10-23", "2022-10-20")
  // println(period)

  val filePath = "./src/main/scala/EffectiveScala/errors/dates.txt"
  // println(Reader.parseDates(filePath))

  println(Validation.parseDates(List("2020-01-01", "2020-01-02")))
  println(Validation.parseDates(List("sdfgsdgh", "2020-01-02", "sxfvedf")))

}
