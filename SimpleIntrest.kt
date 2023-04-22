package week5.Basics

import java.util.Scanner

fun main(){
    val sc :Scanner = Scanner(System.`in`)
    var principle : Int
    var rate :Float
    var time : Float
    println("Enter the principle ammount")
    principle= sc.nextInt()
    println("Enter the rate of intrest ")
    rate = sc.nextFloat()
    println("Enter the total time period ")
    time = sc.nextFloat()

    println("Total interst for the give data = ${(principle*time*rate)/100}")
}