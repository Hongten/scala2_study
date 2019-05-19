package com.b510.scalastudy.demo

/**
  * 集合
  *
  * @author Hongten
  * @date 18/05/2019
  */
object ArrayDemo {

  def main(args: Array[String]): Unit = {

    // 混合类型
    val arr = Array(1, 2, 3, 4, "a", "b", 'c')
    // 指定类型
    val list = Array[String]("a", "b", "c")

    // 遍历Array
    for (ele <- arr) {
      println(ele)
    }

    println("---------------")

    // 遍历Array
    list.foreach(println(_))

    println("---------------")
    // 获取元素
    println(list(2)) // c

    val newArray = new Array[String](3)
    newArray(0) = "tom"
    newArray(1) = "is"
    newArray(2) = "boy"

    println("---------------")
    newArray.foreach(println(_))


    val listMap = List("hello hongten", "hello tom", "hello divide")

    println("---------------")
    listMap.flatMap(s => {
      s.split(" ")
    }).foreach(println(_))

    println("---------------")
    listMap.map(s => {
      s.split(" ")
    }).foreach(s => {
      s.foreach(println(_))
    })

  }
}
