@annotation.tailrec
def fibonacciTailRec(n: Int, a: Int = 0, b: Int = 1): Int = {
  if (n == 0) a
  else fibonacciTailRec(n - 1, b, a + b)
}

// Print first 10 Fibonacci numbers
(0 until 10).foreach(i => println(fibonacciTailRec(i)))

//Explanation of Execution:
//  1) The function fibonacci(n, a, b) starts with a = 0 and b = 1.
//  2) It recursively calls itself, shifting b to a and updating b as a + b.
//  3) When n == 0, it returns a, ensuring tail recursion optimization.
//  4) The foreach loop calls fibonacci(i) for i = 0 to 9, printing each result.