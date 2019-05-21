package com.b510.scalastudy.demo


import java.util.Date

import org.apache.commons.cli._

/**
  *
  * need to add below library dependency into the build.sbt file
  *
  * libraryDependencies += "commons-cli" % "commons-cli" % "1.5-SNAPSHOT"
  *
  *
  * How to use commons-cli?
  * https://commons.apache.org/proper/commons-cli/usage.html
  *
  * @author Hongten
  * @date 21/05/2019
  */
object CommonsCliDemo {

  def main(args: Array[String]): Unit = {
    // create an options object
    val options = new Options

    options.addOption("t", true, "display current time")
    options.addOption("f", true, "read file")
    options.addOption("D", true, "use value for given property")
    options.addOption("a", "all", false, "do not hide entries starting with .")


    val helpFormatter = new HelpFormatter
    helpFormatter.printHelp("hongten", options)

    val parser = new DefaultParser
    val cmd = parser.parse(options, args)

    if (cmd.hasOption("t")) {
      val v = cmd.getOptionValue("t")
      if (scala.Option(v) != null) {
        println(s"$v is ${new Date()}")
      } else {
        println("the value is empty.")
      }
    } else if (cmd.hasOption("f")) {
      println("reading file begin...")
    }


  }
}
