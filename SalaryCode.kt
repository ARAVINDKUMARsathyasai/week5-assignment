package week5.Basics

import java.util.Scanner

fun  main(){
    val sc : Scanner = Scanner(System.`in`)
    println("Enter the total number of overtime hours")
    var ot : Int = sc.nextInt()
    println("Basic pay of the employee = Rs.15000/-")
    println("Total overtime pay = Rs.${ot*50}/-")
    println("Total pay = Rs.${15000+(ot*50)}/-")
}