//Given an array of end of the day stock prices for ICICI Bank – [ 23, 7, 8, 6, 9, 7, 22, 5, 12 ]
//Write a method maxProfit which will take this array and print when to buy (buyIndex), when to sell (sellIndex)
//and maxProfit obtained. Note than you have to buy first before you can sell.
// For example, in the above array,
//you have to buy at 6 and sell 22 to get the maxProfit of 16.
val a = List(23, 7, 8, 6, 9, 7, 22, 1, 12,21,4)
def maxProfit(input:List[Int]):Unit={
  var maxProfit = 0
  var minPrice = Int.MaxValue
  var maxPrice = Int.MinValue
  input.foreach(x=>{
    if(x>maxPrice) {
      maxPrice = x
      maxProfit = math.max(maxPrice - minPrice,maxProfit)
    } else if(x<minPrice) {
      minPrice = x
      maxPrice = 0
    }
  })
  println(minPrice)
  println(maxPrice)
  println(maxProfit)
}
maxProfit(a)
