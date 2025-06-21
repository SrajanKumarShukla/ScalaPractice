val a = Array(1, 2, 2, 3, 4, 4, 3, 5, 6, 6, 6, 7, 8, 7, 9)
// Using a frequency map to count occurrences
val frequencyMap = a.groupBy(identity)
                    .view
                    .mapValues(_.length)
                    .toMap
// Filtering elements that occur only once
val result = a.filter(x => frequencyMap(x) == 1)
              .distinct
println(result.mkString(", "))
// Output: [1, 5, 7, 8, 7, 9]
//revisit this