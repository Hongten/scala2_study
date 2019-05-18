package com.b510.scalastudy.demo


class ObjectClass(xName: String, xAge: Int) {
  val age = xAge
  private val name = xName
}

class Cat(xName: String, xage: Int){
  val age = xage
  private val name = xName
}



/**
  * 当object的名称和class的名称一样时。
  * 我们称这个object是这个class的伴生对象
  * 这个class是这个object的伴生类
  *
  * 那么他们之间可以访问私有变量
  *
  * 伴生类和伴生对象
  * @author Hongten
  * @date 18/05/2019
  */
object ObjectClass {

  def main(args: Array[String]): Unit = {
    val test = new ObjectClass("tom", 18)
    println(s"the name is ${test.name}") // can access the private var

    val cat = new Cat("Tom", 2)
    //println(s"the name is ${cat.name}") // error, can not access the private var
  }
}
