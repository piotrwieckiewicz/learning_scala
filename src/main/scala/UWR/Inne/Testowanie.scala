// import scala.annotation.tailrec

// case class Task(name: String, duration: Int, requirements: List[Task])

// object Testowanie extends App {

//   @tailrec
//   def getTime(task: Task, acc: Int = 0): Int = {
//     // task.duration + getTime(tasks = task.requirements)
//     task.requirements match
//       case Nil => task.duration
//       case head :: tail => getTime(tasks=tail)
//   }

//   def getTime(tasks: List[Task]): Int = {
//     tasks match
//       case Nil          => 0
//       case head :: tail => getTime(head) + getTime(tail)
//   }

//   val task1: Task = Task("first1", 10, Nil)
//   val task2: Task = Task("first2", 10, Nil)
//   val task3: Task = Task("first3", 10, Nil)
//   val task4: Task = Task("second", 10, List(task1, task2, task3))
//   val task5: Task = Task("third", 10, List(task4))

//   val totalTime = getTime(task5)
//   println(totalTime)

// }
