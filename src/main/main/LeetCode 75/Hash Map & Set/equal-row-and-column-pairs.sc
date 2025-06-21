val grid = Array(Array(3,2,1),Array(1,7,6),Array(2,7,7))
val rowList = grid.map(_.mkString("#"))
val columnList = grid.transpose.map(_.mkString("#"))
val result = for{
  i <- rowList
  j <- columnList
  if i == j
}yield i
println(result.length)
