// val filesHere = new java.io.File("./lab01").listFiles()

// //SIP Nice
// //based on https://docs.scala-lang.org/tour/regular-expression-patterns.html

// def printNonEmptyUgly(pattern: String): Unit = {
//   var idx = 0
//   while (idx < filesHere.length) {
//     val filename = filesHere(idx).getName
//     if (filesHere(idx).length() != 0 && filename.matches(pattern)) {
//       println(filename)
//     }
//     idx = idx + 1
//   }
// }

// def printNonEmpty(pattern: String): Unit = {
//   for {
//     file <- filesHere
//     if file.length() != 0
//     if file.getName.matches(pattern)
//   } println(file.getName)
// }

// println("--printNonEmptyUgly--\n")
// printNonEmptyUgly(".*\\.scala")
// println()
// println("--printNonEmpty--\n")
// printNonEmpty(".*\\.scala")
