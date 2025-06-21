background processing task
trait
case class
binary search in scala
scala best practices

import akka.actor.{Actor, ActorSystem, Props}

class GreeterActor extends Actor {
  override def receive: Receive = {
    case "Hello" => sender() ! "Hello there!"
    case _ => println("Unknown message")
  }
}

object Greeter extends App {
  val system = ActorSystem("MySystem")
  val greeter = system.actorOf(Props[GreeterActor], "greeter")
  greeter ! "Hello"
}

===========================================================
//val a =[g,4,c,1]
//chracter
//case class input(a:List[],)
//val a = List(1,1,1,1,1,2,2,2,2,3,3,3,4,4)
//val isInt = true
//[a,5]
//1->4
//2->3
//2
//val count = a.groupBy(identity).map(x=>(x._1,x._2.length))
//val max = count.values.max
//println(count)
//case class
//mirror
