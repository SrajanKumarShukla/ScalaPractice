//kth largest element
def findKthLargest(input:List[Int],k:Int):Int ={
  val a = input.sortBy(identity).reverse
  a(k-1)
}

val input = List(6,8,9,23,1,4)
val k = 5
println(findKthLargest(input,k))