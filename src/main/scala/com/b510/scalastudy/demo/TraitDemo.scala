package com.b510.scalastudy.demo


trait Speak {

  def say()

  def speak(name: String): Unit = {
    println(name + " is speaking...")
  }
}

trait Listen {
  def listen(name: String): Unit = {
    println(name + " is listening...")
  }
}

class Tom(xName: String) extends Speak with Listen {
  val name = xName

  def say(): Unit = {
    println(s"i'm $name")
  }

}


/**
  * @author Hongten
  * @date 19/05/2019
  */
object TraitDemo {

  def main(args: Array[String]): Unit = {
    val tom = new Tom("Tom")
    tom.speak(tom.name) // Tom is speaking...
    tom.listen(tom.name) // Tom is listening...
    tom.say() // i'm Tom
  }
}
