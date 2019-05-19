package com.b510.scalastudy.demo

/**
  * @author Hongten
  * @date 19/05/2019
  */
object MapDemo {

  def main(args: Array[String]): Unit = {
    val map = Map(
        ("name", "tom"),
        ("age", 12),
        "gender" -> "M")

    println(map.get("name"))   // Some(tom)
    println(map.get("age"))    // Some(12)
    println(map.get("gender")) // Some(M)

    // 获取value值
    println(map.get("name").get)  // tom
    // 没有"abc"对应的key和value，那么在获取值的时候可以设置默认值
    println(map.get("abc").getOrElse("hongten")) // hongten

    /**
      * (name,tom)
      * (age,12)
      * (gender,M)
      */
    map.foreach(println(_))
  }
}
