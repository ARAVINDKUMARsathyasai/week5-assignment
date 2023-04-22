package week5

import java.util.Scanner
/*
fun main(){
    val sc = Scanner(System.`in`)
    var num : String = sc.next()
    var valu : Int
    try {
        valu = Integer.parseInt(num)
        println("$valu")
    }
    catch (ne:NumberFormatException){
        println("Error")
    }
}*/

fun main(){
    val sc:Scanner = Scanner(System.`in`)
    val input: String = sc.nextLine()
    sc.close()
    try{
        val number : Int = input.toInt()
        println("$number")
    }catch (e: NumberFormatException){
        println("Error")
    }
}