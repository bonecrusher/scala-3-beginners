package com.rockthejvm.part1basics

object ValuesAndTypes {
  // values
  val meaningOfLife: Int = 42

  // assigning is not allowed
  // meaningOfLife = 45

  // type inference
  val anInteger = 67 // : Int is optional

  // common types
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = 78 // 4 bytes
  val aShort: Short = 5200 // 2 bytes
  val aLong: Long = 49347593745L // 8 bytes
  val aFloat: Float = 2.4f // 4 bytes
  val aDouble: Double = 3.14 // 8 bytes

  // string
  val aString: String = "Scala"

  def main(args: Array[String]): Unit = {

  }
}
