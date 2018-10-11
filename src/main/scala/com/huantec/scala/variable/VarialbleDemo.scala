package com.huantec.scala.variable

import org.relaxng.datatype.Datatype

/**
  * @author liuhuan 2018-10-12
  */
object VarialbleDemo {
  def main(args: Array[String]): Unit = {
    val myVal = "hello scala"
    val myVar: String = "hello java"
    val isOk = myVar.isInstanceOf[String]
    println(isOk)
  }
}
