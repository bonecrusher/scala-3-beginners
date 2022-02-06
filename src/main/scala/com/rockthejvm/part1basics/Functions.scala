package com.rockthejvm.part1basics

object Functions {

  def aFunction(a: String, b: Int): String = {
    a + " " + b // functions always hav ONE expression (?)
  }

  val aFunctionInvocation = aFunction("Scala", 999999999)

  def aNoArgFunction(): Int = 45
  def aParameterlessFunction: Int = 45

  // functions can be recursive
  def stringConcatenation(str: String, n: Int): String = {
    if (n == 0) ""
    else if (n == 1) str
    else str + stringConcatenation(str, n - 1)
  }

  val scalax3 = stringConcatenation("Scala", 3)

  // when you need loops, use recursion

  // "void" functions
  def aVoidFunction(aString: String): Unit = println(aString)

  def computeDoubleStringWithSideEffect(aString: String): String = {
    aVoidFunction(aString) // Unit
    aString + aString // meaningful value
    // side effects are generally bad practice
  }

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n + 1)
  }

  def greeting(name: String, age: Int): String = {
    "Hi my name is " + name + " and I am " + age + " years old."
  }

  def factorial(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else {
      n * factorial(n - 1)
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  def main(args: Array[String]): Unit = {
    println(fibonacci(10))
    println(isPrime(7))
  }
}
