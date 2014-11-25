package com.tallkeith

import scala.util.Random

object Chapter2 {
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

  def example4: Unit ={
    for (i <- 10 to (0,-1))
      println(i)
  }

// Example 5
  def countdown(n: Int) = {
    for (i <- n to (0, -1)) println(i)

  }
  def example5: Unit ={
    countdown(6)
  }

  def example6: Unit = {
    var product = 2
    for (n <- "Hello") {product *= n}
    println(product)
  }

  def example7: Unit ={
    var product = 2
    "Goodbye".foreach((n: Char) => product *= n)
    println(product)
  }

// Example 8
  def product (s: String): Int = {
    var product = 2
    s.foreach((n: Char) => product *= n)
    product
  }
  def example8: Unit = {
    println(product("Goodbye"))
  }

  // Example 9
  def product2 (s: String): Int = {
    def loop(product: Int, current: String): Int ={
      println(s"$current $product")

     current match{
       case "" => product
       case x => loop(product * x.head, x.tail)
     }
    }
    loop(2, s)
  }

// Example 10

  def example10: Unit ={
    def intPow(x: Double, n: Int): Double = {
      if (n > 0 & n % 2 == 0) math.pow(intPow(x, n >> 1), 2)
      else if (n > 0) x * intPow(x, n - 1)
      else if (n == 0) 1
      else 1 / intPow(x, -n)
    }
    println(math.pow(2, 2), intPow(2, 2))
    println(math.pow(2, -2), intPow(2, -2))
  }

}
