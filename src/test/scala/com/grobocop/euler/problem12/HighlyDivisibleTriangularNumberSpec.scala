package com.grobocop.euler.problem12

import org.scalatest.flatspec.AnyFlatSpec

class HighlyDivisibleTriangularNumberSpec extends AnyFlatSpec {
  behavior of "HighlyDivisibleTriangularNumber"

  it should "return 76576500" in {
    val result = HighlyDivisibleTriangularNumber()

    assert(result === 76576500)
  }
}

