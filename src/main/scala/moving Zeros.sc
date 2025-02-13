import scala.collection.mutable.ArrayBuffer

//var a = List(1,0,2,5,0,0,3)
////b=[1,2,5,3,0,0,0]
//a = a.filter(x=>x!=0)++a.filter(x=>x==0)
//println(a)

val a = ArrayBuffer(1, 0, 2, 5, 0, 0, 3)

var insertPos = 0
// Move non-zero elements forward
for (i <- a.indices) {
  if (a(i) != 0) {
    a(insertPos) = a(i)
    println(a)
    insertPos += 1
    println(insertPos)
  }
}
println(a)
// Fill the rest with zeros
for (i <- insertPos until a.length) {
  a(i) = 0
}

println(a)
