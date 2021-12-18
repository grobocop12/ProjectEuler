package com.grobocop.euler.problem7

import org.scalatest.flatspec.AnyFlatSpec

class NthPrimeSpec extends AnyFlatSpec {
  behavior of "NthPrime"

  it should "return 13 when searching for 6th prime" in {
    val result = NthPrime(6)

    assert(result === 13)
  }

  it should "return 104743 searching for 10001st prime" in {
    val result = NthPrime(10001)

    assert(result === 104743)
  }
}
