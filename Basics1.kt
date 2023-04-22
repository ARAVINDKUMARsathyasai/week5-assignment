package week5.Basics
import java.util.Scanner
//Program to check weather the entered number is prime or not

fun main(){
    var sc : Scanner = Scanner(System.`in`)
    var num : Int
    println("Enter the number to be verified")
    num = sc.nextInt()
    for(i in 2..(num/2)){
        if(num%i==0) {
            println("Number is not prime")
            System.exit(0)
        }
    }
    System.out.print("$num is a prime number")
}
