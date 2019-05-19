package com.b510.scalastudy.demo


// case class 里面自动实现里getter, setter, equals等方法
case class People3(name: String, age: Int)

class People2(name: String, age: Int){

}
/**
  * @author Hongten
  * @date 19/05/2019
  */
object CaseClass{

  def main(args: Array[String]): Unit = {
    val p1 = new People3("tom", 12)
    val p2 = new People3("tom", 12)

    println(p1.equals(p2))  // true


    println("---------")
    val p3 = new People2("tom", 12)
    val p4 = new People2("tom", 12)

    println(p3.equals(p4))  // false
  }
}
