val arr:Array[Int] = Array(1,2,2,1,1,3)
val a = arr.groupBy(identity).view.mapValues(_.length).toMap
//  arr.groupMapReduce(identity)(_=>1)(_+_)
val b = a.keys.size
val c = a.values.toSet.size
println(b==c)