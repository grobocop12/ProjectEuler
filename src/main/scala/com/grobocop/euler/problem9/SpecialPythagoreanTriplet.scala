package com.grobocop.euler.problem9

object SpecialPythagoreanTriplet {
  val n = 1000

  def apply(): Int = {
    val numbers: Vector[Int] = (1 to n).toVector
    numbers.flatMap(
      a => numbers
        .filter(b => a < b)
        .filter(b => (a + b) < n)
        .map(b => (a, b)))
      .flatMap(
        ab => numbers
          .filter(c => c >= ab._2)
          .filter(c => (ab._1 + ab._2 + c) == n)
          .map(c => (ab._1, ab._2, c)))
      .filter(abc => (abc._1 * abc._1) + (abc._2 * abc._2) == (abc._3 * abc._3))
      .map(abc => abc._1 * abc._2 * abc._3)
      .head
  }
}