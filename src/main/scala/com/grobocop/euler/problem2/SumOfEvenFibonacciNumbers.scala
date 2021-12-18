package com.grobocop.euler.problem2

object SumOfEvenFibonacciNumbers {
  def apply(limit: Long): Long = {
    lazy val fibs: LazyList[Long] = 1L #:: 2L #:: fibs
      .zip(fibs.tail)
      .map { n => n._1 + n._2 }
    fibs.takeWhile(_ <= limit)
      .filter(_ % 2 == 0)
      .sum
  }
}
