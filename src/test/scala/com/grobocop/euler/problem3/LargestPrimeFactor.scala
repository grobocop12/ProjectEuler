package com.grobocop.euler.problem3

import org.scalatest.flatspec.AnyFlatSpec

class LargestPrimeFactor extends AnyFlatSpec {
  behavior of "LargestPrimeFactor"

  it should "return 29 when n is 13195" in {
    val result = LargestPrimeFactor(100)

    assert(result === 29L)
  }

  it should "return 6857 when n is 600851475143" in {
    val result = LargestPrimeFactor(600851475143L)

    assert(result === 6857L)
  }
}
