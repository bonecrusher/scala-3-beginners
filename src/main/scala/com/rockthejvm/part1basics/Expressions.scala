package com.rockthejvm.part1basics

object Expressions {

  val meaningOfLife: Int = 40 + 2

  // mathematical expressions: +, -, *, /, bitwise |, &, <<, >>, >>>
  val mathExpression: Int = 2 + 3 * 4

  // comparison expressions: <, <=, >, >= ==, !=
  val equalityTest: Boolean = 1 == 2

  // boolean expressions: !, ||, &&
  val nonEqualityTest: Boolean = !equalityTest

  // instructions vs expressions
  // expressions are evaluated, instructions are executed
  // we think in terms of expressions

  // ifs are expressions
  val aCondition = true
  val anIfExpression = if (aCondition) 45 else 99

  // code blocks
  val aCodeBlock = {
    // local values
    val localValue = 78
    localValue + 54
  }

  // everything in Scala is an expression
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  val yetAnotherValue = println("Scala")

  def main(args: Array[String]): Unit = {
    println(someValue)
    println(someOtherValue)
    println(yetAnotherValue)
  }
}
