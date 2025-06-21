val input = "{}{{}}[({})]"
def validate(input:List[Char],stack:List[Char]):Boolean={
  input match {
      case Nil => stack.isEmpty
      case '(' :: rest  => validate(rest,'(' :: stack)
      case '{' :: rest  => validate(rest,'{' :: stack)
      case '[' :: rest  => validate(rest,'[' :: stack)
      case ')' :: rest  => stack match{
        case '(' :: st => validate(rest,st)
        case _ => false
      }
      case '}' :: rest   => stack match{
        case '{' :: st => validate(rest,st)
        case _ => false
      }
      case ']' :: rest   => stack match{
        case '[' :: st => validate(rest,st)
        case _ => false
      }
      case _ => false
  }
}
println(validate(input.toList,List()))