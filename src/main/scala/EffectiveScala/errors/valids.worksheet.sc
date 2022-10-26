type Errors = Seq[String]
type Validated[A] = Either[Errors, A]

val validInt: Validated[Int] = Right(42)
val inValidInt: Validated[Int] = Left(Seq("Invalid integer"))

validInt match
  case Right(n) => println("Valid int!")
  case Left(errors) => println("omg")

validInt.map(n => n *2)
inValidInt.map(n => n *2)