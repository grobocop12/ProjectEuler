package com.grobocop.euler.problem12

object HighlyDivisibleTriangularNumber {
  def apply(): Int = {
    lazy val primes: LazyList[Int] = 2 #:: LazyList.from(3)
      .filter(p => primes
        .takeWhile { x => x * x <= p }
        .forall(p % _ > 0L))

    val triangularNumbers = {
      def loop(last: Int, n: Int): LazyList[Int] = (last + n) #:: loop(last + n, n + 1)

      loop(0, 1)
    }
    triangularNumbers.find(howManyDivisors(_, primes) > 500).get
  }

  def howManyDivisors(n: Int, primes: LazyList[Int]): Int = {
    def primeFactors(number: Int, primes: LazyList[Int]): List[Int] = number match {
      case x if x == 1 => List()
      case x if x > 1 =>
        val divisor = primes.find(number % _ == 0).get
        List(divisor) ++ primeFactors(number / divisor, primes)
    }

    primeFactors(n, primes)
      .groupBy(identity)
      .map(_._2.size + 1)
      .product
  }

}
