//Two Pointers Approach (Efficient O(N))
// Using zipWithIndex to compare the first half with the second half:

def isPalindromePointer[T](list: List[T]): Boolean = {
  val n = list.length
  list.zipWithIndex.forall { case (value, i) =>
    i >= n / 2 || value == list(n - i - 1) // Compare from both ends
  }
}
println("Two Pointers Approach (Efficient O(N))")
println("List(1, 2, 3, 2, 1) "+isPalindromePointer(List(1, 2, 3, 2, 1))) // true
println("List(1, 2, 3, 4, 5) "+isPalindromePointer(List(1, 2, 3, 4, 5))) // false
println("-----------------------------------------")
//✅ This approach avoids creating new lists and is O(N) time complexity.

//Using Iterators for Constant Space (Best Approach)
//For large datasets, using iterators minimizes memory usage:
def isPalindrome[T](list: List[T]): Boolean = {
  val front = list.iterator
  val back = list.reverseIterator
  list.indices.take(list.length / 2).forall(_ => front.next() == back.next())
}
println("Using Iterators for Constant Space (Best Approach)")
println("List(1, 2, 3, 2, 1) "+isPalindrome(List(1, 2, 3, 2, 1))) // true
println("List(1, 2, 3, 4, 5) "+isPalindrome(List(1, 2, 3, 4, 5))) // false
println("-----------------------------------------")
//✅ This approach uses O(1) space since it avoids creating new lists.

//Using Iterators (O(1) Space)
def isPalindromeString(s: String): Boolean = {
  val front = s.iterator
  val back = s.reverseIterator
  s.indices.take(s.length / 2).forall(_ => front.next() == back.next())
}
println("Using Iterators (O(1) Space)")
println("racecar"+isPalindromeString("racecar")) // true
println("hello"+isPalindromeString("hello"))   // false
println("----------------------------")