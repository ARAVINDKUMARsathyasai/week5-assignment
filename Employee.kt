package week5
import java.util.Scanner;

class Employee {
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
        println("Details of the employee as per the records")
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
        println("Phone number = $phoneNumber")
        println("Address = $adress")
    }
}
fun main(args:Array<String>){
    var empl : Employee = Employee()
    empl.setInfo()
    empl.showDetails()
}