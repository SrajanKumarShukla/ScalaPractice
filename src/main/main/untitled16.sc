//val opp : Option[Int] = Some(10)
////map-> o/p : Some(15)
//val result = opp.map(_+5)
//val result1 = opp.flatMap(x=>{
//  Some(x+5)
//})
//println(result)
//println(result1)
// imperitive vs functional

case class Transaction(
                        customerId: String,
                        amount: Double,
                        category: String
                      )
//List[Triansaction] => map[String,double]
def totalCategorySpending(
                           transactions:List[Transaction]
                          ,category:String):Map[String,Double] = {
         transactions
           .filter(_.category.equals(category))
           .groupBy(_.customerId)
           .view
           .mapValues(_.map(_.amount).sum)
           .toMap
}
