package com.tallkeith

import scala.util.Random

package object Chapter3 {
  /** Documentation for chapter 3 example exercises
    */

// Exercise 1
  def randArr(Int): Int = {
    val a = new Array[Int](n)
    val temp = 0 to n

  }


  def randArr(n: Int) = {
    Array.fill(n) {Random.nextInt(n)}
  }
  val a = randArr(10)
  println(a.toList)


// Exercise 2
  def arrSwaps {


  val swaps = Array(1, 2, 3, 4, 5)

  swaps(0)
}

}
