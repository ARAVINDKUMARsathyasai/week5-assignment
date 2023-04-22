package week5.Basics

import java.lang.IllegalArgumentException

fun checkAge(age:Int){
    if(age>0 && age <=100){
        if(age>=18 && age<=65){
            println("Eligible for DL application")
        }else if (age<18){
            throw IllegalArgumentException("Too young you cant proceed")
        }else{
            throw IllegalArgumentException("Too old you can't apply")
        }
    }else{
        throw IllegalArgumentException("Invalid age data")
    }
}

fun main(){
    try{
        checkAge(50)
    }catch (e:IllegalArgumentException){
        println(e)
    }
}