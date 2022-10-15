import lists.*

object Lists extends App {
  val list = List(1, 2, 3, 4, 5, 6)
  val duplicates = List("a", "a", "b", "c", "c", "a", "a", "d", "e", "e")

  // 1. Find the last element of a list
  // println(P01.last(list))

  // 2. Find the last but one element of a list
  // println(P02.penultimate(list))

  // 3. Find the Kth element of a list
  // println(P03.nth(1, list))

  // 4. Find the number of elements of a list
  // println(P04.length(list1))
  // println(P04.lengthFucntional(list))

  // 5. Reverse a list
  // println(P05.reverse(list))
  // println(P05.reverseFunctional(list))

  // 6. Find out whether a list is a palindrome
  // println(P06.isPalindrome(List(1, 2, 3, 2, 1)))
  // println(P06.isPalindrome(List(1, 2, 3, 2, 3)))

  // 7. Flatten a nested list structure
  // val l: List[Any] = List(0, List(1, List(2)), List(3, 4))
  // println(P07.flatten(l))
  // println(P07.flatten(List()))

  // 8. Eliminate consecutive duplicates of list elements
  // println(P08.compress(duplicates))
  // println(P08.compressFunctional(duplicates))

  // 9. Pack consecutive duplicates of list elements into sublists
  // println(P09.pack(duplicates))

}
