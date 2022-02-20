package com.grobocop.euler.problem9

import org.scalatest.flatspec.AnyFlatSpec

class SpecialPythagoreanTripletSpec extends AnyFlatSpec {
  behavior of "SpecialPythagoreanTriplet"

  it should "return 31875000" in {
    val result = SpecialPythagoreanTriplet()

    assert(result === 31875000)
  }
}

