package com.grobocop.euler.problem4

object LargestPalindromeProduct extends App {
  def apply(range: Seq[Int]): Int = {
    range.flatMap(
      x => range
        .filter(y => y >= x)
        .map(y => (x, y)))
      .map(x => (x._1 * x._2))
      .filter(x => x.toString.equals(x.toString.reverse))
      .sortBy(x => x)(Ordering.Int.reverse)
      .head
  }
}
