package com.tallkeith

import scala.util.Random

object Chapter3 {
  /** Documentation for chapter 3 example exercises
    */
//
// Exercise 1
  def randArr(n:Int): Int = {
    val a = new Array[Int](n)
    val temp = 0 to n
    1
  }


  def randArr(n: Int) = {
    Array.fill(n) {Random.nextInt(n)}
  }
  val a = randArr(10)
  println(a.toList)


// Exercise 2
  def arrSwaps(input: Array[Int]) {
    //val input = Array(1, 2, 3, 4, 5)
    val blank = Array.ofDim[Int](input.size)

    for (index <- 0 until (input.length, 2)){
      if (index+1 >= input.size){
        blank(index) = input(index)
      }
      else {
        blank(index+1) = input(index)
        blank(index) = input(index+1)
      }
    }
    println(input.mkString(","))
    println(blank.mkString(","))
  }

  def arrSwaps2(input: Array[Int]) {
    val blank = input.grouped(2).toArray.flatMap(_.reverse)
    println(input.mkString(","))
    println(blank.mkString(","))
  }

  
}
