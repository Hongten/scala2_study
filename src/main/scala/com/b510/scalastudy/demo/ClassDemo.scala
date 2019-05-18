package com.b510.scalastudy.demo

/**
  * 定义Person类
  */
class Person(xname: String, xage: Int) {

  // 变量或常量定义
  val name = xname
  val age = xage
  var gender = "M"

  /**
    * 构造方法， 需要掉用this()
    */
  def this(yname: String, yage: Int, ygender: String) {
    this(yname, yage)
    this.gender = ygender
  }

  // 方法定义
  def sayHello() = {
    println(this.name + " say 'Hello' to you.")
  }

  // 我们可以直接在方法外调用println()方法
  // 当我们new一个类的时候，除了方法不执行，其他都会执行
  println("*****************************")

}


/**
  *
  * 1.scala中定义在object中的变量，方法都是静态的
  * 2. scala中以后代码可以以';'结尾，也可以不写
  * 3. 定义变量使用var，定义常量使用val
  *
  * @author Hongten
  * @date 18/05/2019
  */
object ClassDemo {

  def main(args: Array[String]): Unit = {
    var a = 100
    println(a)

    a = 200
    println(a)

    val person = new Person("hongten", 18)
    println(s"person name is ${person.name}")
    println(f"person age is ${person.age}")

    val tom = new Person("Tom", 20, "M")
    println(s"tom's gender is ${tom.gender}")
    tom.sayHello()
  }
}
