import scala.annotation.tailrec
//import scala.collection.mutable.ListBuffer
//
////Question: Merge list where there is common elements
////List(List(1, 2), List(3, 2), List(4, 6), List(3, 5))
////output: List(List(4, 6), List(1, 2, 3, 5))
//val input  = List(List(1, 2), List(3, 2), List(4, 6), List(3, 5))
//val result = new ListBuffer[List[Int]]
//input.foreach(x=>{ //List(1,2)
//  if(result.nonEmpty){
//    result.foreach(y=>{
//      x.foreach(z=>{
//        if(y.contains(z)){
//          result.append(x)
//        }
//      })
//    })
//  }
//  else{
//    result.append(x)
//  }
//})
//println(result.toList)

//Find the missing number in an unsorted list of first n-1 numbers.
//Input: list = [3,6,2,5,4] n=6
//output = 1
//val input = List(3,6,2,5,4)
//for( i <- 1 until input.length+1){
//  if(input(i)>input.length-1){
//    println(i)
//  }
//}

//0 1 1 2 3
@tailrec
def fibb(input:Int,a:Int=0,b:Int=1):Int={
    if(input==0)  a
    else fibb(input-1,b,a+b)
  }
println(fibb(5))

