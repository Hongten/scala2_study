package com.b510.scalastudy.demo

/**
  * 最多支持Tuple22
  *
  *
  * @author Hongten
  * @date 19/05/2019
  */
object TupleDemo {

  def main(args: Array[String]): Unit = {
    val tuple = new Tuple1("hello")
    val tuple2 = new Tuple2(1, "hello")

    val tuple1 = (1)
    val tuple1New = Tuple1(1)

    // 遍历元组
    tuple2.productIterator.foreach(println(_))

    println("----------")
    // 交换位置
    tuple2.swap.productIterator.foreach(println(_))
  }
}
