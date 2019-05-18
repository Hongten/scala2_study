package com.b510.scalastudy.demo

/**
  * the different between 'Var' and 'Val' in Scala
  * var a 定义变量 GC的时候，var变量不易被回收
  * val b 定义常量 推荐使用val，如果不使用常量了，GC的时候会回收该常量。val 是安全和增强代码可读性的
  *
  * https://www.java67.com/2017/05/difference-between-var-val-and-def-in-Scala.html
  *
  * @author Hongten
  * @date 18/05/2019
  */
object VarVal {

  def main(args: Array[String]): Unit = {
    var a = "abc"
    println(a)
    a = "bcd"
    println(a)

    val b = "abc"
    println(b)
    //b = "def"  // Can't compile
    //println(b)

    /**
      * output:
      * abc
      * bcd
      * abc
      */
  }
}
