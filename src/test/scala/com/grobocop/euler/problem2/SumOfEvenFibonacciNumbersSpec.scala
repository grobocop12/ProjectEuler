package com.grobocop.euler.problem2

import org.scalatest.flatspec.AnyFlatSpec

class SumOfEvenFibonacciNumbersSpec extends AnyFlatSpec {
  behavior of "SumOfEvenFibonacciNumbers"

  it should "return 10 when limit is 100" in {
    val result = SumOfEvenFibonacciNumbers(100)

    assert(result === 44)
  }

  it should "return 4613732 when limit is 4_000_000" in {
    val result = SumOfEvenFibonacciNumbers(4_000_000L)

    assert(result === 4613732)
  }
}
