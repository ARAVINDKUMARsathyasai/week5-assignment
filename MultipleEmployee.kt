package week5

import java.util.Scanner;

class MultipleEmployee {
    val sc :Scanner = Scanner(System.`in`)
    var name : String? = null
    var adress:String? = null
    var phoneNumber :Long = 0
    var age : Int = 0
    var salary : Int = 0

    fun setInfo(){
        val sc : Scanner = Scanner(System.`in`)
        println("Enter the name of the employee")
        name = sc.nextLine()
        println("Enter the address of the employee")
        adress = sc.nextLine()
        println("Enter the mobile number ")
        phoneNumber=sc.nextLong()
        println("Enter the age ")
        age = sc.nextInt()
        println("Enter the salary ")
        salary=sc.nextInt()
    }

    fun showDetails(){
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
        println("Phone number = $phoneNumber")
        println("Address = $adress")
    }
}

fun main(args : Array<String>){
    val sc : Scanner = Scanner(System.`in`)
    var total : Int
    println("Enter total number of employees")
    total = sc.nextInt()
    var emp = Array<MultipleEmployee> (total){MultipleEmployee()}
    for (i in 0..(total-1)){
        emp[i]=MultipleEmployee();
    }
    for (i in 0 .. (total-1)){
        println("Enter the details of ${i+1} employee")
        emp[i].setInfo()
    }
    for (i in 0 .. (total-1)){
        println("Displayiing the details of ${i+1} employee")
        emp[i].showDetails()
        println("\n\n")
    }
}