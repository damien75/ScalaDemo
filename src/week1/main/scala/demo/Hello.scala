package demo

import scala.annotation.tailrec

/**
  * Created by damiengoblot on 2016-04-23.
  */
class Hello {
  def sayHello(name: String) = s"Hello, $name!"

  def abs(x: Double) = if (x > 0) x else -x

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }

  def factorial(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1, n)
  }

  @tailrec
  final def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  def cube(x: Int) = x * x * x

  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  def product(f:Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * product(f)(a + 1, b)

  def factorial2(n: Int) = product(x => x)(1, n)

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
}
