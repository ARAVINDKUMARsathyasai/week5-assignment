package week5.Basics

import java.util.Scanner

fun main(arg : Array<String>){
    val sc : Scanner = Scanner(System.`in`)
    println("Enter the length of all three sides of a triangle")
    println("Enter side 1 length")
    var side1 : Int =sc.nextInt()
    println("Enter side 2 length")
    var side2 : Int =sc.nextInt()
    println("Enter side 3 length")
    var side3 : Int =sc.nextInt()
    if(side1 == side2 && side1 == side3)
        println("It is Equilatrol triangle")
    else if (side1==side2 || side1 == side3 || side2 == side3)
        println("It is Isosceles triangle")
    else
        println("It is scalene triangle")
}