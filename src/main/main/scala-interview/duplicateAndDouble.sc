import scala.collection.mutable.ListBuffer

val list =  List(1, 2, 3, 4, 5)
//List[Int]
// List(1, 2, 2, 4, 3, 6, 4, 8, 5, 10)
//List(a0,b0,a0+1,b0+2,........)
val a = new ListBuffer[Int]
list.foreach(x=>{
  a.append(x)
  a.append(x+x)
})
println(a.toList)
//List[List[String]] => List[String]
val a = list.flatMap(x=>List(x,x+x))
println(a)