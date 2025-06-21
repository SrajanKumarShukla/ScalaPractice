import scala.annotation.tailrec
import scala.collection.mutable
val s = "leet**cod*e"
println("using stack")
var temp = mutable.Stack[Char]()
for(i <- s){
  if(i=='*'){
    temp.pop()
  }
  else{
    temp.push(i)
  }
}
println(temp.reverse.mkString(""))
println("using foldLeft")
val result = s.foldLeft(""){
  case (result,ch) => if(ch=='*') result.dropRight(1) else result :+ ch
}
println(result)
@tailrec
def removeStar(input:List[Char],result:List[Char]=List()):List[Char] = input match{
  case Nil => result
  case '*' :: tail => removeStar(tail,result.drop(1))
  case ch :: tail => removeStar(tail,ch :: result)
}
println("using tailrec")
println(removeStar(s.toList).reverse.mkString(""))
