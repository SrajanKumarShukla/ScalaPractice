// from input string replace the vowels with !
def replace1(s: String): String = {
  val vowels = List("a","e","i","o","u","A","E","I","O","U")
  val response = s.toList.map(x=>{
    //    println(x)
    //    println(vowels.contains(x))
    if(vowels.contains(x.toString)){
      "!"
    } else x
  }).mkString
  println(response)
  response
}

val a = replace1("Hi!")
println(a)