//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
//
//  Example
//
//The minimum sum is  and the maximum sum is . The function prints
//
//16 24
//Function Description
//
//Complete the miniMaxSum function in the editor below.
//
//miniMaxSum has the following parameter(s):
//
//  arr: an array of  integers
//  Print
//
//Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.
//
//Input Format
//
//A single line of five space-separated integers.
//
//Constraints
//
//
//Output Format
//
//Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
//
//Sample Input
//
//1 2 3 4 5
//Sample Output
//
//10 14


import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

  def miniMaxSum(arr: Array[Int]) {
    // // Write your code here
    val lista = arr.map(_.toLong).sorted
    val minlist = lista.sum - lista(4)
    val maxlist = lista.sum - lista(0)
    println(minlist + " "+maxlist)
    // val a = arr.map(_.toLong)
    // .combinations(4)
    // .map(_.sum)
    // .foldLeft(Long.MaxValue,Long.MinValue){
    //     case ((mn,mx),i)=>(i min mn , i max mx)
    // }
    // .productIterator
    // .toList
    // .mkString(" ")
    // println(a)
  }
  val input = Array(1,2,3,4,5)
  miniMaxSum(input)


