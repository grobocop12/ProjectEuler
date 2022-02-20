package com.grobocop.euler.problem10

import org.scalatest.flatspec.AnyFlatSpec

class SummationOfPrimesSpec extends AnyFlatSpec {
  behavior of "SummationOfPrimes"

  it should "return 17 when summing primes below 10" in {
    val result = SummationOfPrimes(10)

    assert(result === 17)
  }

  it should "return something when summing primes below 2_000_000" in {
    val result = SummationOfPrimes(2_000_000)

    assert(result === 142913828922L)
  }
}
