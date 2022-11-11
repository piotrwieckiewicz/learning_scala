import java.io.File
import java.util.Scanner
import scala.io.Source
import scala.util.{Try, Using}

// import org.apache.commons.io.FileUtils

object ReadingFiles {
  
  val filePath: String = "src/main/scala/RockTheJVM/YouTube/resources/text_file.txt"

  // 1. Java way
  val file = new File(filePath)
  val scanner = new Scanner(file)

  // while(scanner.hasNextLine) {
  //   val line = scanner.nextLine()
  //   println(line)
  // }

  // 2. Java way with cheats
  // Requires to add 'commons-io' package
  
  // val fileContents = FileUtils.readLines(file) // JKava list of Strings
  // fileContents.forEach(println)

  // 3. Scala way
  // Different then ways above because it does not load whole file into memory
  val scalaFileContents: Iterator[String] = Source.fromFile(file).getLines
  // scalaFileContents.foreach(println)

  // 4. ---
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

}
