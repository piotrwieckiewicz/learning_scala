// package Lab01
// import java.io.File
// import Lab01.Lines.fileLines

// object NonEmpty extends App {

//   def printNonEmpty(dir: String): Unit = {
//     val d = new File(dir)

//     for {
//       f <- d.listFiles().toList if f.getName.endsWith(".scala") && fileLines(f).isEmpty
//     } println(f)

//   }

//   //def printNonEmpty(pattern: String): Unit = ???

//   printNonEmpty(dir="./src/main/scala/Lab01/")


// }
