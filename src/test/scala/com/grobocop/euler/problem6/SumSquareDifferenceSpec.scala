package com.grobocop.euler.problem6

import org.scalatest.flatspec.AnyFlatSpec

class SumSquareDifferenceSpec extends AnyFlatSpec {
  behavior of "SumSquareDifference"

  it should "return 2640 when passed numbers 1 to 10" in {
    val result = SumSquareDifference(1L to 10L)

    assert(result === 2640)
  }

  it should "return something numbers 1 to 20" in {
    val result = SumSquareDifference(1L to 100L)

    println(result)
  }
}
