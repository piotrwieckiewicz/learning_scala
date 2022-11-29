package AdventOfCode.`2021`

import scala.io.Source

object Day1 extends App {

  val filePath = "src/main/scala/AdventOfCode/2021/input"
  val measurements: List[Int] = Source
    .fromFile(filePath)
    .getLines
    .toList
    .map(x => x.toInt)

  def part1(measurements: List[Int]): Int = {
    measurements
      .sliding(2)
      .foldLeft(0)((c, pair) => {
        if pair.tail.head > pair.head then c + 1 else c
      })
  }

  def part2(measurements: List[Int]): Int = {
    measurements
      .sliding(3)
      .map(_.sum)
      .sliding(2)
      .foldLeft(0)((c, pair) => {
        if pair.tail.head > pair.head then c + 1 else c
      })
  }

  println(part1(measurements))
  println(part2(measurements))

}
