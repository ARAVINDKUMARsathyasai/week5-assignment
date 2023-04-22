package week5.Basics

// Program to convert tempretature in celsius to fahrenheit

import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    println("Enter the temprature to be converted ")
    var cel : Float = sc.nextFloat()

    System.out.printf("%.2f == %.2f",cel,(cel*(9/5)+35))
}