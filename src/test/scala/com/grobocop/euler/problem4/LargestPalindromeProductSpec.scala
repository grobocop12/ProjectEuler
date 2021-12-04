package com.grobocop.euler.problem4

import org.scalatest.flatspec.AnyFlatSpec

class LargestPalindromeProductSpec extends AnyFlatSpec {
  behavior of "LargestPalindromeProduct"

  it should "return 9009 when passed numbers 10 to 99" in {
    val result = LargestPalindromeProduct(10 to 99)

    assert(result === 9009)
  }

  it should "return 906609 numbers 100 to 999" in {
    val result = LargestPalindromeProduct(100 to 999)

    assert(result === 906609)
  }
}
