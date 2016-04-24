package demo
import math.abs
import scala.annotation.tailrec

/**
  * Created by damiengoblot on 2016-04-24.
  */
object fixedPoint {
  val tolerance = 0.0001

  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    @tailrec
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

  def sqrtNoConvergence(x: Double) =
    fixedPoint(y => x / y)(1)

  def sqrt(x: Double) =
    fixedPoint(averageDamp(y => x / y))(1)
}
