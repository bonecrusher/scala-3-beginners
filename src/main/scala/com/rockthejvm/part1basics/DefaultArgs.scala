package com.rockthejvm.part1basics

import scala.annotation.tailrec

object DefaultArgs {

  @tailrec
  def sumUntilTailrec(x: Int, accumulator: Int = 0): Int = {
    if (x <= 0) accumulator
    else sumUntilTailrec(x - 1, accumulator + x) // Tail recursion = recursive call occurs last in its code path
    // no further stack frames necessary = no more risk of SO
  }

  val sumUntilTail100: Int = sumUntilTailrec(100)

  def savePicture(dirPath: String, name: String, format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = {
    println("Saving picture in format " + format + " in path " + dirPath)
  }

  def main(args: Array[String]): Unit = {
    savePicture("/users/name/photos", "myphoto")
    savePicture("/users/name/photos", "myphoto", "png")
    savePicture("/users/name/photos", "myphoto", width = 800, height = 600)
  }
}
