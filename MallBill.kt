package week5.Basics
import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    println("Enter the total bill cost ")
    var bill : Int = sc.nextInt()
    var dis : Float = if(bill > 10000)
                        (0.05f*bill)
                      else
                          0f

    if (dis != 0f){
        println("Your actual bill = Rs.$bill/-")
        println("Your elisgible for discount of Rs.$dis/-")
        println("Bill after discount = Rs.${bill-dis}")
    }
    else
        println("Your bill = $bill")
}