package com.grobocop.euler.problem3

import scala.annotation.tailrec

object LargestPrimeFactor {
  def apply(n: Long): Long = {
    if(n <= 1L) throw new IllegalArgumentException()

    lazy val primes: LazyList[Int] = 2 #:: LazyList.from(3)
      .filter(p => primes
        .takeWhile { x => x * x <= p }
        .forall(p % _ > 0))

    @tailrec
    def factorize(x: Long, nextFactor: Long): Long = x match {
      case x if x == nextFactor => x
      case _ => factorize(x / nextFactor, primes.find(x / nextFactor % _ == 0).get)
    }

    val firstFactor = primes.find(n % _ == 0).get
    factorize(n, firstFactor)
  }
}
