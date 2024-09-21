import scala.annotation.tailrec
import scala.util.Random

val a = List(1,2,3,4,5,6)
val emptyList = List()
println("using higher oreder function")
println(a.mkString(","))
println("using recursion")

@tailrec
def printListRec[T](list:List[T]):Unit = list match {
  case Nil => println("empty list")
  case head :: Nil => println(head)
  case head :: tail =>
    println(head)
    printListRec(tail)
}
printListRec(a)
printListRec(emptyList)
//Seq.fill(10000)(Random.nextInt)
