package com.grobocop.euler.problem11

import java.nio.file.Paths
import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.io.Source


object LargestProductInGrid {
  def apply(): Long = {
    val path = Paths.get("src/main/resources/grid.txt").toAbsolutePath

    val source = Source.fromURI(path.toUri)
    val lines = source.getLines.toList
    source.close
    val numbers = lines.map(_.split(" ")
      .map(_.toInt).toList)
    val horizontal = numbers.map(multiplyHorizontally).map(_.max).max
    val vertical = numbers.transpose.map(multiplyHorizontally).map(_.max).max
    val right = readRightDiagonals(numbers).map(multiplyHorizontally).map(_.max).max
    val left = readLeftDiagonals(numbers).map(multiplyHorizontally).map(_.max).max
    List(horizontal, vertical, right, left).max
  }

  def groupToFours(list: List[Int]): List[List[Int]] = groupToFours(List(), list)

  @tailrec
  def groupToFours(result: List[List[Int]], list: List[Int]): List[List[Int]] = {
    list.length match {
      case x if x <= 4 => result :+ list
      case _ => groupToFours(result :+ list.take(4), list.tail)
    }
  }

  def multiplyHorizontally(array: List[Int]): List[Long] = {
    groupToFours(array)
      .map(_.product)
  }

  def readRightDiagonals(list: List[List[Int]]): List[List[Int]] = {
    val lastIndex: Int = list.length - 1
    val diagonals = ListBuffer[List[Int]]()
    for (i <- 0 to lastIndex) {
      val diagonal1 = ListBuffer[Int]()
      val diagonal2 = ListBuffer[Int]()
      for (j <- 0 to lastIndex - i) {
        diagonal1 += list(i + j)(j)
        diagonal2 += list(j)(i + j)
      }
      diagonals += diagonal1.toList
      diagonals += diagonal2.toList
    }
    diagonals.toList
  }

  def readLeftDiagonals(list: List[List[Int]]): List[List[Int]] = {
    val lastIndex: Int = list.length - 1
    val diagonals = ListBuffer[List[Int]]()
    for (i <- 0 to lastIndex) {
      val diagonal1 = ListBuffer[Int]()
      val diagonal2 = ListBuffer[Int]()
      for (j <- 0 to i) {
        diagonal1 += list(i - j)(j)
        diagonal2 += list(lastIndex - j)(lastIndex - i + j)
      }
      diagonals += diagonal1.toList
      diagonals += diagonal2.toList
    }
    diagonals.toList
  }
}
