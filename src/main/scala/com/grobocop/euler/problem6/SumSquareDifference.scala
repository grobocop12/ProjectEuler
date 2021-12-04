package com.grobocop.euler.problem6

object SumSquareDifference {
  private def square(n: Long): Long = n * n

  def apply(numbers: Seq[Long]): Long = {
    square(numbers.sum) - numbers.map(square).sum
  }

}
