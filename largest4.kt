package week5.Basics

import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    println("Enter four numbers")
    var num1 : Int = sc.nextInt()
    var num2 : Int = sc.nextInt()
    var num3 : Int = sc.nextInt()
    var num4 : Int = sc.nextInt()

    var max : Int
    max = if (num1 > num2 && num1 > num3)
             num1
          else if (num2 > num1 && num2 > num3)
              num2
          else
              num3

    max = if (max < num4)
           num4
          else
              max

    println("$max is greatest number")
}