//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
//
//Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
//
//  Example
//
//There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
//
//  0.400000
//0.400000
//0.200000
//Function Description
//
//Complete the plusMinus function in the editor below.
//
//plusMinus has the following parameter(s):
//
//  int arr[n]: an array of integers
//  Print
//Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.
//
//Input Format
//
//The first line contains an integer, , the size of the array.
//  The second line contains  space-separated integers that describe .
//
//Constraints
//
//
//
//Output Format
//
//Print the following  lines, each to  decimals:
//
//  proportion of positive values
//    proportion of negative values
//    proportion of zeros
//Sample Input
//
//STDIN           Function
//  -----           --------
//    6               arr[] size n = 6
//-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
//Sample Output
//
//0.500000
//0.333333
//0.166667

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

  def plusMinus(arr: Array[Int]) {
    // Write your code here
    val length = arr.size.asInstanceOf[Double]
    val positive = arr.toList.filter(x=>x>0).size.asInstanceOf[Double]
    val zero = arr.toList.filter(x=>x==0).size.asInstanceOf[Double]
    val negative = arr.toList.filter(x=>x<0).size.asInstanceOf[Double]
    println(positive/length)
    println(negative/length)
    println(zero/length)

  }
val input = Array(-4,3 ,-9 ,0 ,4, 1)
plusMinus(input)






