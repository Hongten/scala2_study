package com.b510.scalastudy.demo

/**
  * @author Hongten
  * @date 18/05/2019
  */
object ForLoop {

  def main(args: Array[String]): Unit = {

    // including 3
    for (i <- 1 to 3) {
      println(i)
    }

    // not including 3
    for (i <- 1 until 3) {
      println(i)
    }

    for (x <- 1 until 10; y <- 1 until 10) {
      if (x >= y) {
        print(x + " * " + y + " = " + x * y + "\t")
      }
      if (x == y) {
        println()
      }
    }


    println("--------------------------")

    for (i <- 1 to 9) {
      // println("-------"+i)
      for (j <- 1 to 10) {
        if (i >= j) {
          print(i + " * " + j + " = " + i * j + "\t")
        }
        if (i == j) {
          println()
        }
      }
    }

    println("--------------------------")

    val result = for (i <- 1 to 10 if (i % 10 != 0)) yield i
    result.foreach(println(_))

  }
}
