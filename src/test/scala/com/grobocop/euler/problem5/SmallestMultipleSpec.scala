package com.grobocop.euler.problem5

import org.scalatest.flatspec.AnyFlatSpec

class SmallestMultipleSpec extends AnyFlatSpec {
  behavior of "SmallestMultiple"

  it should "return 2520 when passed numbers 1 to 10" in {
    val result = SmallestMultiple(1L to 10L)

    assert(result === 2520)
  }

  it should "return something numbers 1 to 20" in {
    val result = SmallestMultiple(1L to 20L)

    println(result)
  }
}
