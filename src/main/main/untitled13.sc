import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.DurationInt
import scala.util.{Failure, Success}


//wtf frequency each word in a string.
//val sentence = "Hello World Hello Scala"
//Hello -> 2 , word -> 1 , scala ->1
//println(sentence.split(" ").groupBy(identity).map(x=>x._1->x._2.length))

//f1 -> fetchUser() : Future[String] =>
//f2 -> fetchEmail(user:String):Future[String]
//f1 -> f2 -> output
//def fetchUser():Future[String]= {
//   Future("abc")
//}
//def fetchEmail(value:String):Future[String]={
//  Future("abc@test.com")
//}
//
//val userData : Future[String] = fetchUser()
//val user = Await.result(userData,60.seconds)
//val email:Future[String] = fetchEmail(user)
//val response = email.flatMap(x=>{
//  case Success => user + x
//  case Failure => "error"
//})
//println(response)

//val a :Either[Int,String] = Left(1)
////Right("abc")
//println(a.map(x=> "Right" ))
