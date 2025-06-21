def compressString(s: String): String = {
  // Iterate through the string, counting consecutive characters
  s.foldLeft(("", s.head, 1)) { case ((result, prevChar, count), currentChar) =>
    if (currentChar == prevChar) {
      (result, prevChar, count + 1)
    } else {
      (result + prevChar + count, currentChar, 1)
    }
  } match {
    case (result, prevChar, count) => result + prevChar + count // Append last character count
  }
}

val input = "aaabbcddddeeeaag"
val compressed = compressString(input)
println(compressed) // Output: a3b2c1d4e3a2g1


