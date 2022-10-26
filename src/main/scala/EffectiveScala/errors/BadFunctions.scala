package errors

import scala.util.Try

object BadFunctions extends App {

  def badFunction(): Unit =
    println("Ok")
    throw RuntimeException("Nope!")
    println("Invisible")

  def badFunctionTry(): Try[Unit] =
    Try {
      println("Ok")
      throw RuntimeException("Nope!")
      println("Invisible")
    }

}
