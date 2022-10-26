package errors

import errors.Time
import scala.util.{Success, Try, Using}
import java.time.LocalDate
import scala.io.Source

object Reader {

  def readDateStrings(fileName: String): Try[Seq[String]] =
    // Try {
    //   val source = Source.fromFile(fileName)
    //   val dateStrings = source.getLines.toSeq
    //   source.close()
    //   dateStrings
    // }

    Using(Source.fromFile(fileName)) { source =>
      source.getLines.toSeq
    }

  def parseDates(fileName: String): Try[Seq[LocalDate]] =
    readDateStrings(fileName).flatMap { (dateStrings: Seq[String]) =>
      dateStrings.foldLeft[Try[Seq[LocalDate]]](Success(List.empty)) {
        (tryDates, dateString) =>
          for {
            dates <- tryDates
            date <- Time.parseDate(dateString)
          } yield dates :+ date
      }
    }

}
