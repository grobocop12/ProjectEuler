package com.grobocop.euler.problem7

object NthPrime {
  def apply(n: Long): Long = {
    lazy val primes: LazyList[Int] = 2 #:: LazyList.from(3)
      .filter(p => primes
        .takeWhile { x => x * x <= p }
        .forall(p % _ > 0))
    primes.take(n.toInt)
      .last
  }
}
