package week5

import java.util.Scanner

open class Person {
    var name : String? = null
    var age :Int = 0
    var phoneNumber : Long = 0
    var aadharNumber : Long = 0
    var panCard : String? = null

    constructor(){

    }

    constructor(name:String,age:Int,phoneNumber:Long,aadharNumber:Long,panCard:String){
        this.name = name
        this.age = age
        this.phoneNumber = phoneNumber
        this.aadharNumber = aadharNumber
        this.panCard = panCard
    }

    open fun display(){
        println("Details as per the records")
        println("Name = $name")
        println("Age = $age")
        println("Phone number = $phoneNumber")
        println("Aadhar card = $aadharNumber")
        println("Pan card  = $panCard")
    }
}
class BankDetails : Person{
    var accNo : Long = 0
    var ifsc : String? = null
    var balance : Int = 0
    constructor():super(){

    }
    constructor(name:String,age:Int,phoneNumber:Long,aadharNumber:Long,panCard:String,accNo:Long,ifsc:String,balance:Int):super(name,age,phoneNumber,aadharNumber,panCard){
        this.accNo = accNo
        this.ifsc = ifsc
        this.balance = balance
    }

    fun showDisplay(){
        super.display()
        println("\n")
        println("Account number = $accNo")
        println("IFSC = $ifsc")
        println("Balance = $balance")
    }
}

fun main(args: Array<String>){
    val sc : Scanner = Scanner(System.`in`)
    var name : String
    var age :Int
    var phoneNumber : Long
    var aadharNumber : Long
    var panCard : String
    var accNo : Long
    var ifsc : String
    var balance : Int
    println("Enter the number of account holders")
    var total : Int = sc.nextInt()
    println("")
    var Bank = Array<BankDetails>(total){BankDetails()}
    for(i in 0 .. (total-1)){
        println("Enter  the details of ${i+1} bank ")
        println("Enter the name ")
        name= sc.next()
        println("Enter the age of the account holder")
        age = sc.nextInt()
        println("Enter the phone number")
        phoneNumber = sc.nextLong()
        println("Enter the Aadhar Number")
        aadharNumber = sc.nextLong()
        println("Enter the PAN number")
        panCard = sc.next()
        println("Enter the Account Number")
        accNo = sc.nextLong()
        println("Enter the IFSC code")
        ifsc = sc.next()
        println("Enter the opening balance of the holder")
        balance = sc.nextInt()
        Bank[i] = BankDetails(name, age, phoneNumber, aadharNumber, panCard, accNo, ifsc, balance)
    }
        println("\n")
    for (i in 0 .. (total-1)){
        println("Details of the ${i+1} holder")
        Bank[i].showDisplay()
    }
}