package week5.Basics

import java.util.Scanner

fun main(){
    val sc :Scanner = Scanner(System.`in`)
    var num : Int
    println("Enter the number for computation")
    num=sc.nextInt()
    for (i in 1 .. 10){
        println("$num * $i = ${num*i}")
    }
}