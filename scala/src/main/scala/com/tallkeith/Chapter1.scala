package com.tallkeith

import scala.util.Random

/**
 * These are my comments!
 * When I press Enter, it automatically makes a star for me.
 *
 */
object Chapter1 {
  /**
   * Documentation for example 6 in the book.
   */
  def example6(): Unit = {
    val res = BigInt(2).pow(1024)
    println(res)
  }

  def example6_2: BigInt = {
    BigInt(2).pow(1024)
  }

  def example7(): Unit = {
    import scala.math.BigInt._
    import scala.util.Random
    probablePrime(100, Random)
  }

  def example8:String = {
    BigInt(64, Random).toString(36)
  }

  def example9(s: String) :(Char, Char) = {
    val first = s(0)
    val last = s.last
    (first, last)
  }

  def example10(): Unit = {
    println("Hello".take(3))
    println("Hello".take(1))
    println("Hello".take(7))
    println("Hello".take(10))
    println("Hello".drop(1))
    println("Hello".drop(2))
    println("Hello".takeRight(1))
    println("Hello".takeRight(2))
    println("Hello".substring(0, 2))
    println("Hello".substring(1, 3))
    println("Hello".drop(2).take(2))
    println("Hello".drop(1).take(2))

  }


}