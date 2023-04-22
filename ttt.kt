package week5.Basics

import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    val input : String = sc.nextLine()
    sc.close()
    try{
        val number : Int = input.toInt()
        println("$number")
    }catch(e: NumberFormatException){
        println("Error")
    }
}