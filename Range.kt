package week5

import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    val start : Int = sc.nextInt()
    val end : Int = sc.nextInt()
    if(start <= end){
        val output = StringBuilder()
        for(i in start until end){
            output.append("$i, ")
        }
        output.append(end)
        println(output.toString())
    }else{
        println("Invalid input: start value must be less than or equal to end value ")
    }
}