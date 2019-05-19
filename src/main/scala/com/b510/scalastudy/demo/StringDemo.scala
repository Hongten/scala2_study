package com.b510.scalastudy.demo

/**
  * 类似于java里面的String
  *
  * @author Hongten
  * @date 18/05/2019
  */
object StringDemo {

  def main(args: Array[String]): Unit = {
    val a = "abc"
    val b = "abc"

    println(a.equals(b)) // true

    val sb = new StringBuilder
    sb.append("a").append("b")
    println(sb.toString()) // ab

  }
}
