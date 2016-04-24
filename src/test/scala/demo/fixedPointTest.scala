package demo
import math.sqrt

import org.scalatest.FunSuite

/**
  * Created by damiengoblot on 2016-04-24.
  */
class fixedPointTest extends FunSuite {
  test("testFixedPoint") {
    assert(fixedPoint.isCloseEnough(fixedPoint.fixedPoint(x => 1 + x / 2)(1), 2))
  }

  test("testSqrt") {
    assert(fixedPoint.isCloseEnough(sqrt(2), fixedPoint.sqrt(2)))
  }

  test("averageDamp is necessary") {
    assert(!fixedPoint.isCloseEnough(fixedPoint.sqrtNoConvergence(2), sqrt(2)))
  }

}
