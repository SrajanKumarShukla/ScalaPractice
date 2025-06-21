import scala.collection.mutable
//var x = immutable.Set[Int]()
//val y = mutable.Set[Int]()
//find first non repeating character in giver array
//  arr  = [a, b, b , a , e , c, d, c]
// list2 = (a->2,b->2,e->1,c->2,d->1)

//def nonRepeating(input:List[Char]):Char = {
////  val result = input.groupBy(identity).filter(x=>x._2.length == 1).head
//  val result = mutable.Map[Char,Int]()
//  input.foreach(x=>{
//    result.update(x,(result.getOrElse(x,0)+1))
//  })
//  val a = input.filter(x=>result.getOrElse(x, 0) == 1)
//  a.head
//}
//val arr = List('f','a', 'b', 'b' , 'a' ,'a', 'e' , 'c', 'd', 'c')
//println(nonRepeating(arr))

//Q 2. Find a given element in the list if not present then return -1.
//arr = [1, 3, 5, 6, 9, 10, 15, 30]
