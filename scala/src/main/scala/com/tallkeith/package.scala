package com.tallkeith

import scala.util.Random

package object Chapter2 {
  /** Documentation for chapter 2 example exercises
    */

  def signum (x: Int) = {
    if (x > 0) {
      1
    } else if (x == 0) {
      0
    } else {
      -1
    }
  }
  def example1(): Unit = {
    println(signum(-2))
    println(signum(0))
    println(signum(4))
  }
//
//  def example2: Unit ={
//    /** The value of an empty block expression {} is (). It is type Unit
//      *
//      */
//  }
//
//  def example3: Unit ={
//    val x = y = 1
//  }
//
//  def example4: Unit ={
//    for (i <- 10 to (0,-1))
//      println(i)
//  }
//
//  def example5: Unit ={
//    def countdown(n: Int) = {
//      for (n <- n to (0, -1)) println()
//
//    }
//  }
//
//  def example6: Unit = {
//    var product = 2
//    for (n <- "Goodbye") {product *= n}
//    println(product)
//  }
//
//  def example7: Unit ={
//    var product = 2
//    "Goodbye".foreach((n: Char) => product *= n)
//    println(product)
//  }
//
//  def example8: Unit = {
//    def product (s: String): Unit = {
//      var product = 2
//      s.foreach((n: Char) => product *= n)
//      product
//    }
//    println(product("Goodbye"))
//  }
//
//  def example9: Unit = {
//    def product (s: String): Int = {
//      val tail = s.tails.head * (if (tail.size == 0) 1 else product(s.tail))
//    }
//    println(product("Goodbye"))
//  }
//
//  def example10: Unit ={
//    def intPow(x: Double, n: Int): Double = {
//      if (n > 0 & n % 2 == 0) math.pow(intPow(x, n >> 1), 2)
//      else if (n > 0) x * intPow(x, n - 1)
//      else if (n == 0) 1
//      else (n < 0) 1 / intPow(x, -n)
//    }
//    println(math.pow(2, 2), intPow(2, 2))
//    println(math.pow(2, -2), intPow(2, -2))
//  }
//
}
