package com.b510.scalastudy.demo

/**
  * 跟java里面处理差不多
  *
  * @author Hongten
  * @date 18/05/2019
  */
object IfElse {

  def main(args: Array[String]): Unit = {
    val a = 15
    checkNum(a)
  }

  def checkNum(a: Int) = {
    if (a < 10) {
      println("a < 10")
    } else if (a < 20 && a >= 10) {
      println("a < 20 && a >= 10")
    } else {
      println("a >= 20")
    }
  }
}
