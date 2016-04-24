package demo

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2016-04-23.
  */
class HelloTest extends FunSuite {
  test("sayHello method works correctly"){
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
