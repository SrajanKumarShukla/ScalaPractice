val words1 = "abc"
val words2 = "pqr"
def mergeAlternately(word1: String, word2: String): String = {
  val zipped = word1.zip(word2).map { case (ch1, ch2) => s"$ch1$ch2" }.mkString
  val extra = if (word1.length > word2.length) word1.drop(word2.length) else word2.drop(word1.length)
  zipped + extra
}
println(mergeAlternately(words1,words2))