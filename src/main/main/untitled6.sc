//val a =  List(1,3,2,5,4,6,7,null,9,10)
//8
//for ( i <- 1 until a.length+1)
//  {
//    if(!a.contains(i)){
//      println(i)
//    }
//  }

// Input: nums1 = [1,2,3,0,0,0], m = 3,
//        nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
var num1 = Array(1,2,3,0,0,0)
val m = 3
val nums2 = Array(2,5,6)
val n = 3
for(i <- 0 until n){
  num1(m+i)=nums2(i)
}
println(num1.sorted.mkString(","))
