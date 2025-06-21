def asteroidCollision(asteroids: Array[Int]): Array[Int] = {
    @scala.annotation.tailrec
    def go(index:Int=0,stack:List[Int]=List()):Array[Int]={
      if(index >= asteroids.length) stack.toArray.reverse
      else if(stack.isEmpty) go(index+1,asteroids(index)::stack)
      else if(asteroids(index)<0 && stack.head >0){
        if(Math.abs(asteroids(index))==stack.head) go(index+1,stack.tail)
        else if(Math.abs(asteroids(index)) > stack.head) go(index,stack.tail)
        else go(index+1,stack)
      }
      else {
        go(index+1,asteroids(index)::stack)
      }
    }
    go()
  }