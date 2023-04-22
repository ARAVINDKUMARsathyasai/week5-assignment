package week5.Basics

import java.util.Scanner

fun main(){
    val sc :Scanner =Scanner(System.`in`)
    var vchl : Char
    var hour : Int
    println("Select type of vehicle car or bus or two wheeler")
    var type : String = sc.next().toLowerCase()
    vchl = type.get(0)
    println("Enter total parking hours")
    hour=sc.nextInt()
    var charge = when(vchl){
        'b' -> (hour*20)
        'c' -> (hour*15)
        't' -> (hour*10)
        else -> (hour*7)
    }
    println("Vehicle is = $type")
    when(vchl){
        'b' -> println("Charges per hour = Rs.20/-")
        'c' -> println("Charges per hour = Rs.15/-")
        't' -> println("Charges per hour = Rs.10/-")
        else -> println("Charges per hour = Rs.7/-")
    }
    println("Total charge = $charge")
}