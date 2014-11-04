package com.tallkeith

import scala.util.Random

package object Chapter3 {
  /** Documentation for chapter 3 example exercises
    */

// Exercise 1
  def randArr(len: Int) = {
    (for (i <- 1 to len) yield util.Random.nextInt(11) - 5).toArray // Range [-5, 5]  ( [] mean inclusive )
  }
  val a = randArr(10)
  println(a.toList)

  // Exercise 2
  def swapPairsInPlace(arr: Array[Int]) = {
    for (i <- 0 until (if (arr.length % 2 == 0) arr.length else arr.length - 1, 2)) {
      val t = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = t
    }
    arr
  }
  println(swapPairsInPlace(a.clone).toList)
  // odd one test
  println(swapPairsInPlace(Array.concat(a, Array(2))).toList)

  // Exercise 3
  def swapPairs(arr: Array[Int]) = {
    (for (i <- 0 until arr.length)
    // first conditional takes care of the odd-length case
    yield if (i == arr.length - 1 & i % 2 == 0) arr(i) else if (i % 2 == 0) arr(i + 1) else arr(i - 1)).toArray
  }
  val q2 = swapPairs(a)
  println(q2.toList)
  // odd one test
  println(swapPairs(Array.concat(a, Array(3))).toList);


}
