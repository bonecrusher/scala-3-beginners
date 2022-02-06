package com.rockthejvm.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion {

  def sumUntil(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUntil(n - 1)
  }

  def sumUntil_v2(n: Int): Int = {
    @tailrec
    def sumUntilTailrec(x: Int, accumulator: Int): Int = {
      if (x <= 0) accumulator
      else sumUntilTailrec(x - 1, accumulator + x) // Tail recursion = recursive call occurs last in its code path
      // no further stack frames necessary = no more risk of SO
    }

    sumUntilTailrec(n, 0)
  }

  def sumNumbersBetween(a: Int, b: Int): Int = {
    if (a > b) 0
    else a + sumNumbersBetween(a + 1, b)
  }

  def sumNumbersBetween_v2(a: Int, b: Int): Int = {
    @tailrec
    def sumTailrec(currentNumber: Int, accumulator: Int ): Int = {
      if (currentNumber > b) accumulator
      else sumTailrec(currentNumber + 1, currentNumber + accumulator)
    }

    sumTailrec(a, 0)
  }

  def main(args: Array[String]): Unit = {
    println(sumNumbersBetween(0, 10000))
  }
}
