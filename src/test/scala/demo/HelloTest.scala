package demo

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2016-04-23.
  */
class HelloTest extends FunSuite {
  val hello = new Hello
  test("sayHello method works correctly"){
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }

  test("Product function returns the expected result"){
    assert(hello.product(x => x * x)(3, 4) == 144)
  }

  test("Both implementations of Factorial should return the same value"){
    assert(hello.factorial2(10) == hello.factorial(10))
  }

  test("Both implementations of product using mapreduce or not should return the same value"){
    assert(hello.mapReduce(hello.cube, (x, y) => x * y, 1)(2, 6) == hello.product(hello.cube)(2, 6))
  }
}
