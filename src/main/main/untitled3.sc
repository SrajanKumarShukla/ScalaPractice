//import scala.collection.immutable.IntMap.Nil.--

//val a = List("a","b","c","d","e","b","c","d")
////val b = a.distinct
////val c = a.groupBy(x=>x).filter(x=>x._2.size>1).map(_._1)
////val d = a :: b
////println(d)
////println(b)
////println(c)
//def value(a:List[String])(index:Int) : String ={
//  a(index)
//}
//val b = value(a)_
//val c = b(4)
//println(c)
val a = List(List(1,2,3),List(6,8,9),List(6,7,8))
val b = a.foldLeft(List[Int]())((acc,x) => acc :+ x.max)
val c = a.foldLeft(List[Int]())((acc,x) => acc :+ x.min).max
println(b)

// List(3,9,8)
// 6
//val b = a.map(x=>x.max)
//val c = a.map(x=>x.min).max
//println(b)
//println(c)
//var min = Int.MaxValue
//val b = a.map(x=>{
//  var max= Int.MinValue
//  x.foreach(y=>{
//    if(max<y){
//      max=y
//    }
//  })
//  max
//})
//println(b)
