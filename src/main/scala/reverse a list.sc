def reverseList[A](list: List[A]): List[A] = list match {
  case Nil => Nil
  case head :: tail => reverseList(tail) :+ head
}

println(reverseList(List(1, 2, 3, 4, 5)))