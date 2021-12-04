package com.grobocop.euler.problem5

import scala.annotation.tailrec

object SmallestMultiple {
  def apply(orderedNumbers: Seq[Long]): Long = {
    val (primes, notPrimes) = orderedNumbers
      .filter(_ > 1)
      .partition(n => !orderedNumbers.exists(x => x > 1
        && n % x == 0
        && n != x))

    @tailrec
    def multiplyUntil(result: Long, numbersLeft: Seq[Long]): Long = {
      result match {
        case res if numbersLeft.isEmpty => res
        case res if numbersLeft.forall(x => res % x == 0) => res
        case _ =>
          val left = numbersLeft.filter(x => result % x != 0)
          val smallestPrime = primes.find(left.head % _ == 0).get
          multiplyUntil(result * smallestPrime, left.tail)
      }
    }

    multiplyUntil(primes.product, notPrimes)
  }
}
