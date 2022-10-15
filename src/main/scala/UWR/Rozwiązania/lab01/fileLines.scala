// def fileLinesUgly(file: java.io.File): List[String] = {
//   // I'm not very familiar with java, so I wasn't sure how to do that
//   // This is what I found on the internet
//   import java.io.{BufferedReader, FileReader}

//   val bufferedReader = new BufferedReader(new FileReader(file))
//   var lines: List[String] = Nil
//   while (bufferedReader.ready()) {
//     lines = bufferedReader.readLine()::lines
//   }
//   lines
// }

// def fileLines(file: java.io.File): List[String] = {
//   //SIP All OK, but may use Source object here (without Java classes), like:
//   // def fileLines(file: File): List[String] = {
//   //   val source = Source.fromFile(file)
//   //   try
//   //     source.getLines.toList
//   //   finally
//   //     source.close
//   // }

//   import java.io.{BufferedReader, FileReader}

//   def readLines(bufferedReader: BufferedReader): List[String] = {
//     if (bufferedReader.ready()) {
//       val line = bufferedReader.readLine()
//       line::readLines(bufferedReader)
//     }
//     else {
//       Nil
//     }
//   }

//   val bufferedReader = new BufferedReader(new FileReader(file))
//   readLines(bufferedReader)
// }

// println(fileLinesUgly(new java.io.File("./lab01/test_file.txt")))
// println(fileLines(new java.io.File("./lab01/test_file.txt")))
