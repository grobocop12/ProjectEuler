package com.grobocop.euler.problem11

import org.scalatest.flatspec.AnyFlatSpec

class LargestProductInGridSpec extends AnyFlatSpec {
  behavior of "LargestProductInGrid"

  it should "return 70600674" in {
    val result = LargestProductInGrid()

    assert(result == 70600674)
  }
}

