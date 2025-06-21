def pattern(input:Int):Unit={
  for(i <- 0 to input){
    for(j <- i to input/2){
      print(" ")
    }
    print("x")
  }
}
pattern(6)