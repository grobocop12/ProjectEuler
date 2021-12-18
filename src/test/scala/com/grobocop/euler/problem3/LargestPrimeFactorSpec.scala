package com.grobocop.euler.problem3

import org.scalatest.flatspec.AnyFlatSpec

class LargestPrimeFactorSpec extends AnyFlatSpec {
  behavior of "LargestPrimeFactor"

  it should "return 13 when n is 13" in {
    val result = LargestPrimeFactor(13L)

    assert(result === 13L)
  }

  it should "return 29 when n is 13195" in {
    val result = LargestPrimeFactor(13195L)

    assert(result === 29L)
  }

  it should "return 6857 when n is 600851475143" in {
    val result = LargestPrimeFactor(600851475143L)

    assert(result === 6857L)
  }

  it should "fail when n is 1" in {
    assertThrows[IllegalArgumentException] {
      LargestPrimeFactor(1)
    }
  }
}
