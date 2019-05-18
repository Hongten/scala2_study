package com.b510.scalastudy.demo

import java.util.Date


/**
  * scala 函数方法
  *
  * @author Hongten
  * @date 18/05/2019
  */
object Method {

  // 匿名函数
  val sayHello = () => {
    println("hello")
  }

  def main(args: Array[String]): Unit = {
    println(max(2, 3)) // 3
    println(min(1, 2)) //()
    println(fun(5)) // 120
    println(defaultValueFun()) // 6
    println(defaultValueFun(10, 5)) // 50
    println(defaultValueFun(10)) // 30

    multiParamFun("a")
    multiParamFun("a", "b", "c", "d")

    println(sayHello)

    val date = new Date()
    showLog(date, "User buy something.")

    // 偏应用
    // 多个日志在同一时间发生，我们只需要传入log信息，而时间信息不用传递
    val myShowLogMethod = showLog(date: Date, _: String)
    myShowLogMethod("Tom buy car")
    myShowLogMethod("John click 'Add' button")
    myShowLogMethod("Divide click 'Login' button")

    // 直接把函数名称作为参数传递
    println(method("tom", add)) // tom's age is 7

  }

  def max(a: Int, b: Int): Int = {
    if (a > b) {
      a
    } else {
      b
    }
  }

  // 如果没有定义返回类型
  // 则返回()
  def min(a: Int, b: Int) {
    if (a > b) {
      b
    } else {
      a
    }
  }

  // 递归函数
  // 需要显式声明返回值类型
  def fun(num: Int): Int = {
    if (num == 1) {
      1
    } else {
      num * fun(num - 1)
    }
  }

  // 参数默认值
  def defaultValueFun(a: Int = 2, b: Int = 3): Int = {
    a * b
  }

  // 可变长参数的函数
  def multiParamFun(args: String*): Unit = {
    //for(str <- args){
    //println(str)
    //}

    // or
    println("-----------")

    args.foreach(println(_))


    // or
    // 匿名函数
    args.foreach(str => {
      println(str)
    })
  }


  // 高阶函数
  // 偏应用函数
  def showLog(date: Date, log: String): Unit = {
    println(s"date is $date , $log")
  }

  // 函数的参数是函数
  def add(a: Int, b: Int): Int = {
    a + b
  }

  // 把函数逻辑作为参数传递
  // 方法的返回值由传递方法的逻辑决定
  def method(name: String, fun: (Int, Int) => Int): String = {
    def result = fun(2, 5)

    name + "'s age is " + result
  }


}
