// Implement a class "Book" that takes a list of sentences (strings) in its constructor
// and has a method "find" that takes a single word (string) and returns all sentences
// that contain that word.

class Book( sentences: List[String]) {
  // mutable map
  var wordDetails: Map[String, List[String]] = buildWordMap()
  // creating map of all the words and the stencence in which they appear
  private def buildWordMap(): Map[String, List[String]] = {
    println("Building wordDetails map...")
    val words = sentences.flatMap(_.split("\\W+")).map(_.toLowerCase).distinct
    words.map { word =>
      val matchedSentences = sentences.filter(isWordInSentence(word, _))
      word -> matchedSentences
    }.toMap
  }
  def find(word: String): List[String] = {
     wordDetails.getOrElse(word,List())
  }

  // Utility method for your convenience. You can pretend that it checks if a word is in a sentence correctly.

  def isWordInSentence(word: String, sentence: String): Boolean = sentence.contains(word)
}

// object used for running / testing the code

    val myMap:Map[String,Int] = Map("a"->123, "b"->345)
    val myMap2 = myMap.updated("c", 456)
    val anElement:Option[Int] = myMap2.get("c")


    val book = new Book(List(
      "The orange cat is lazy",
      "Hello world",
      "The orange cat is lazy",
      "The white cat is small"
    ))
    println(1)
    println(book.find("world"))

    println(2)
    println(book.find("cat"))

    println(3)
    println(book.find("garfield"))

    println(4)
    println(book.find("cat"))