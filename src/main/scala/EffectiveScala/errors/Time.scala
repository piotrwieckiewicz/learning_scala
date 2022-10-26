package errors

import scala.util.Try
import java.time.{LocalDate, Period}

object Time {

  def parseDate(str: String): Try[LocalDate] =
    Try(LocalDate.parse(str))

  def tryPeriod1(str1: String, str2: String): Try[Period] =
    parseDate(str1).flatMap { (date1: LocalDate) =>
      parseDate(str2).map { (date2: LocalDate) =>
        Period.between(date1, date2)
      }
    }

  def tryPeriod2(str1: String, str2: String): Try[Period] =
    for {
      date1 <- parseDate(str1)
      date2 <- parseDate(str2)
    } yield Period.between(date1, date2)

}
