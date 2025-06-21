//Input: nums = [1,2,3,4], k = 5
//Output: 2
val nums = Array(1,2,3,4)
val k =5
def maxOperations(nums: Array[Int], k: Int): Int = {
  var count = 0
  var previous = 0
  for(i <- 0 until nums.length){
    nums.dropWhile(nums(i))
  }

}
println(maxOperations(nums,k))