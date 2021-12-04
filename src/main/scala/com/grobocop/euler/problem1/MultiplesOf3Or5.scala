package com.grobocop.euler.problem1

object MultiplesOf3Or5 {
  def apply(numbers: Seq[Long]): Long = numbers
    .filter(x => x % 3 == 0 || x % 5 == 0)
    .sum
}
