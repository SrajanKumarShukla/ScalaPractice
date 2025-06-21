import scala.annotation.tailrec
import scala.reflect.ClassManifestFactory.Null
//Question 1

//val n1 =  "Avenida cal ventor".toLowerCase()
//val n2 =  "Avenida cal ".toLowerCase()

//n1 : Avenida cal ventor
//n2 : Avenida cal ventor
//—> [0, False]

//n1 : Avenida cal ventor
//n2 : Avenida port alt
//—> [Null, False]

//n1 :  Calle port
//  n2 :  calle port plaza Alt
//—-> [2, True]
//
//val l1 = n1.split(" ").length
//val l2 = n2.split(" ").length
//val result = if(l1==l2 && n1!= n2){
//  (Null,n1.contains(n2))
//}
//else if(l1==l2 && n1==n2){
//  (l1-l2,false)
//}
//else if(l1>l2) {
//  (l1-l2,n1.contains(n2))
//}
//else{
//  (l2-l1,n2.contains(n1))
//}
//println(result)
//val nl1 =n1.split(" ")
//val nl2 = n2.split(" ")
//val l1 = nl1.length
//val l2 = nl2.length
//val result = if(l1==l2){
//  Null
//}
//else if(l1>l2) {
//    nl1.diff(nl2).mkString(" ")
//}
//else{
//    nl2.diff(nl1).mkString(" ")
//}
//println(result)

def fibonnaci(n:Int):List[Int]={
  @tailrec
  def helper(n:Int,acc:List[Int]):List[Int]={
    helper(n-1,acc :+ n*n-1)
  }
  helper(n,List())
}
println(fibonnaci(5))
