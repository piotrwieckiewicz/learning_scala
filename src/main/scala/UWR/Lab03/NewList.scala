// package Lab03

// abstract class LinkedList[+A] {
//   def head: A
//   def tail: LinkedList[A]
//   def isEmpty: Boolean
//   def add[B >: A](element: B): LinkedList[B]
//   def printElements: String
//   override def toString: String = s"LinkedList($printElements)"
//   def map[B](f: A => B): LinkedList[B]
//   def filter(p: A => Boolean): LinkedList[A]
// }

// case object Empty extends LinkedList[Nothing] {
//   def head: Nothing = throw new NoSuchElementException
//   def tail: LinkedList[Nothing] = throw new NoSuchElementException
//   def isEmpty: Boolean = true
//   def add[B >: Nothing](element: B): LinkedList[B] = Cons(element, Empty)
//   def printElements: String = ""
//   def map[B](f: Nothing => B): LinkedList[B] = Empty
//   def filter(p: Nothing => Boolean): LinkedList[Nothing] = Empty
// }

// case class Cons[+A](h: A, t: LinkedList[A]) extends LinkedList[A] {
//   def head: A = h
//   def tail: LinkedList[A] = t
//   def isEmpty: Boolean = false
//   def add[B >: A](element: B): LinkedList[B] = Cons(element, this)
//   def printElements: String =
//     if(t.isEmpty) "" + h
//     else s"$h ${t.printElements}"
//   def map[B](f: A => B): LinkedList[B] = Cons(f(h), t.map(f))
//   def filter(p: A => Boolean): LinkedList[A] = {
//     if p(h) then Cons(h, t.filter(p))
//     else t.filter(p)
//   }

// }

// object NewList extends App {

//   val list = Cons(1, Cons(2, Cons(3, Empty)))
//   println(list)

//   println(list.map(_ * 2))

//   val newList = list.filter(_ % 2 != 0)
//   println(newList)


// }

