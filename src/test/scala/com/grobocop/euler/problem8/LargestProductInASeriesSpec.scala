package com.grobocop.euler.problem8

import org.scalatest.flatspec.AnyFlatSpec

class LargestProductInASeriesSpec extends AnyFlatSpec {
  behavior of "LargestProductInASeries"

  it should "return 5832 when length is 4" in {
    val result = LargestProductInASeries(4)

    assert(result === 5832L)
  }

  it should "return 23514624000 when length is 13" in {
    val result = LargestProductInASeries(13)

    assert(result === 23514624000L)
  }
}
