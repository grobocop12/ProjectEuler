package com.grobocop.euler.problem1

import org.scalatest.flatspec.AnyFlatSpec

class MultiplesOf3Or5Spec extends AnyFlatSpec {
  behavior of "MultiplesOf3Or5"

  it should "return 23 when passed numbers 1 to 9" in {
    val result = MultiplesOf3Or5(1L to 9)

    assert(result === 23)
  }

  it should "return 233168 when passed numbers 1 to 999" in {
    val result = MultiplesOf3Or5(1L to 999)

    assert(result === 233168)
  }
}
