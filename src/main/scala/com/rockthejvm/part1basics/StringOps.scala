package com.rockthejvm.part1basics

object StringOps {

  val aString: String = "Hello, I am learning Scala"

  // string methods
  val secondChar: Char = aString.charAt(1)
  val firstWord: String = aString.substring(0, 5)
  val words: Array[String] = aString.split(" ")
  val startsWithHello: Boolean = aString.startsWith("Hello")
  val allDashes: String = aString.replace(" ", "-").replace(",", "")
  val allUppercase: String = aString.toUpperCase()
  val allLowercase: String = aString.toLowerCase()
  val nChars: Int = aString.length

  // other methods more specific to Scala
  val reversed: String = aString.reverse
  val aBunchOfChars: String = aString.take(10)

  // parse to numeric
  val numberAsString = "2"
  val number: Int = numberAsString.toInt

  // interpolation
  val name = "Alice"
  val age = 12
  val greeting: String = "Hello, I'm " + name + " and I am " + age + "."
  val greeting_v2: String = s"Hello, I'm $name and I'm $age years old."
  val greeting_v3: String = s"Hello, I'm $name and I will be turning ${age + 1} years old."

  // f-interpolation
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.5f burgers per minute."

  // raw-interpolation
  val escapes = raw"This is a \n newline."

  def main(args: Array[String]): Unit = {
    println(escapes)
  }
}
