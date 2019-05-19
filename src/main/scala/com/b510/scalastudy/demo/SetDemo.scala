package com.b510.scalastudy.demo

/**
  *
  * @author Hongten
  * @date 19/05/2019
  */
object SetDemo {

  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3, 2, 1)

    println(set.size) // 3

    println("---------")
    // set 内部不能有重复元素
    set.foreach(println(_))
  }
}
