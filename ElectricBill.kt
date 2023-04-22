package week5.Basics

import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    var units : Int
    println("Enter the total units consumed")
    units = sc.nextInt()
    println("Fixed charge is Rs.100/-")
    var charge : Int = if (units <100){
                        println("Charge per unit = Rs.5/- per unit")
                        (units*5)
                       }
                    else{
                        println("Charge per unit = Rs.6/- per unit")
                        (units*6)
                    }
    println("Total charges = Rs.$charge/-")
    println("Final Bill = Rs.${100+charge}/-")
}