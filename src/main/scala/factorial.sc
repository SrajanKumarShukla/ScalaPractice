import scala.annotation.tailrec

def factorial(input:Int):Int={
  if(input == 0 ) 1
  else input*factorial(input-1)
}
println(factorial(5))
@tailrec
def factorialTailRec(input:Int,acc:Int=1):Int={
  if(input == 0 ) acc
  else factorialTailRec(input-1,acc*input)
}
println(factorialTailRec(5))
