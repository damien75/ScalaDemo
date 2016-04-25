package week4.expression

/**
  * Created by damiengoblot on 2016-04-25.
  */
trait Expr {

}
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr