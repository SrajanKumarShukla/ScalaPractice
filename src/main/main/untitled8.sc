val a = List("a","b","c")
  .toArray
val b = List("c","d","e")
  .toArray
val c = for {
  i <- 0 to a.length-1
  j <- 0 to b.length-1
  if a(i) == b(j)
} yield a(i)
//val c = a.intersect(b)
println(c.toList)