package com.grobocop.euler.problem10

object SummationOfPrimes {
  def apply(limit: Long): Long = {
    lazy val primes: LazyList[Long] = 2 #:: LazyList.from(3)
      .map(_.toLong)
      .filter(p => primes
        .takeWhile { x => x * x <= p }
        .forall(p % _ > 0))
    primes.takeWhile(_ < limit).sum
  }
}
