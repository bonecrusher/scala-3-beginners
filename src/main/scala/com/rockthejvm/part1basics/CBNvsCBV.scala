package com.rockthejvm.part1basics

object CBNvsCBV {

  // CBV = Call By Value = arguments are evaluated before function invocation
  def aFunction(arg: Int): Int = arg + 1
  val aComputation: Int = aFunction((23 + 67))

  // CBN = Call By Name = arguments are passed literally
  def aByNameFunction(arg: => Int): Int = arg + 1
  val anotherComputation: Int = aByNameFunction(23 + 67)

  // The difference practically is that in CBV, 23 + 67 is calculated BEFORE it's passed to the function.
  // In CBN 23 + 67 is calculated after function call, while the function is running

  def printTwiceByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  def printTwiceByName(x: => Long): Unit = {
    // Basically what seems to be happening here is the function is being passed rather than a literal value
    // You'll see that each println produces a different value
    println("By name: " + x)
    println("By name: " + x)
  }

  def main(args: Array[String]): Unit = {
    printTwiceByValue(System.nanoTime())
    printTwiceByName(System.nanoTime())
  }
}
