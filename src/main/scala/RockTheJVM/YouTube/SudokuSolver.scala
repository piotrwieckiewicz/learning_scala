package RockTheJVM0YouTube

object SudokuSolver extends App {

  type Board = Array[Array[Int]]

  def printSudoku(sudoku: Board): String =
    sudoku
      .grouped(3).map { bigGroup =>
        bigGroup .map { row =>
            row.grouped(3).map { smallGroup =>
                smallGroup.mkString(" ", " ", " ")
              }.mkString("|", "|", "|")
          }.mkString("\n")
      }.mkString(
        "-------------------------\n",
        "\n-------------------------\n",
        "\n-------------------------"
      )

  def validate(sudoku: Board, x: Int, y: Int, value: Int): Boolean = {
    val row = sudoku(y).toList
    val column = sudoku.map(r => r.apply(x)).toList
    val boxX = x / 3
    val boxY = y / 3

    val box = for {
      yb <- (boxY * 3) until (boxY * 3 + 3)
      xb <- (boxX * 3) until (boxX * 3 + 3)
    } yield sudoku(yb)(xb)

    row.count(_ == value) == 0 &&
    column.count(_ == value) == 0 &&
    box.count(_ == value) == 0

  }

  def solve(sudoku: Board, x: Int = 0, y: Int = 0): Unit = {
    if (y >= 9) println(printSudoku(sudoku))
    else if (x >= 9) solve(sudoku, 0, y+1)
    else if (sudoku(y)(x) > 0) solve(sudoku, x + 1, y)
    else (1 to 9).filter(value => validate(sudoku, x, y, value)).foreach { value =>
      sudoku(y)(x) = value
      solve(sudoku, x + 1, y)
      sudoku(y)(x) = 0
    }
  }

  val board =
    Array(
      Array(5, 3, 0, 0, 7, 0, 0, 0, 0),
      Array(6, 0, 0, 1, 9, 5, 0, 0, 0),
      Array(0, 9, 8, 0, 0, 0, 0, 6, 0),
      Array(8, 0, 0, 0, 6, 0, 0, 0, 3),
      Array(4, 0, 0, 8, 0, 3, 0, 0, 1),
      Array(7, 0, 0, 0, 2, 0, 0, 0, 6),
      Array(0, 6, 0, 0, 0, 0, 2, 8, 0),
      Array(0, 0, 0, 4, 1, 9, 0, 0, 5),
      Array(0, 0, 0, 0, 8, 0, 0, 7, 9)
    )

  solve(board)

}
