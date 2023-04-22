package week5.Basics

import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    var year : Int
    println("Entered the year that to be verified ")
    year = sc.nextInt()
    if (year%4==0 && year%100!=0)
        println("$year is a leap year")
    else
        println("$year is not a leap year")
}