package week5

import java.util.Scanner

fun main(){
    val sc:Scanner = Scanner(System.`in`)
    var num : Int
    var tem : Int = 1
    println("Enter the range")
    num = sc.nextInt()
    for(i in 0 .. (num-1)){
        tem = 1
        for(j in 1 .. num){
            if(j>=(num/2)-i && j<=(num/2)+i){
                print("$tem")
                tem++
            }
            else{
                print(" ")
            }
        }
        println()
        if(tem==num)
            System.exit(0)
    }
}