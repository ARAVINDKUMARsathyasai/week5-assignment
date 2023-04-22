package week5

import java.util.Scanner

open class Details{
   var name : String? = null
   var accNo : Long = 0
   var panNo : String? = null

    constructor(){}

    constructor(name:String, accNo:Long, panNo:String){
        this.name = name
        this.accNo = accNo
        this.panNo = panNo
    }

    fun display(){
        println("Details of the acccount holder")
        println("Name = $name")
        println("Account Number = $accNo")
        println("PAN id = $panNo")
        println("Baranch = Marlanahalli")
        println("IFSC = PKGB0001245")
    }
}

class BankingFunctions : Details {
    var deposit = ArrayList<Float>()
    var withDraw = ArrayList<Float>()
    var balance = ArrayList<Float>()

    var dep : Float = 0f
    var wit : Float = 0f
    var bal: Float = 1000f

    constructor(){}

    constructor(name: String,accNo: Long,panNo: String,dep:Float,wit:Float):super(name, accNo, panNo){
        this.dep = dep
        this.wit = wit
    }

    fun dataUpdate(){
        if(dep!=0f){
            deposit.add(dep)
            bal = bal+dep
            balance.add(bal)
            withDraw.add(0.0f)
        }
        else if(wit != 0f && wit <= bal ){
            bal = bal-wit
            balance.add(bal)
            withDraw.add(wit)
            deposit.add(0.0f)
        }
    }

    fun disp(){
        super.display()
        println("\n")
        println("Deposit \tWithdraw \tBalance")
        for(i in balance.size-1 downTo 0 ){
            println("${deposit.get(i)} \t${withDraw.get(i)} \t${balance.get(i)}")
        }
    }
 }

fun main(args: Array<String>){
    val sc : Scanner = Scanner(System.`in`)
    var name : String
    var accNo : Long
    var panNo : String

    var dep : Float
    var with : Float

    println("Enter your name")
    name = sc.nextLine()
    println("Enter the Account number")
    accNo = sc.nextLong()
    println("Enter your PAN details")
    panNo = sc.next()
    var bnk : BankingFunctions = BankingFunctions()
    while(true){
        println("Press 1 : Deposit\nPress 2 : Withdraw \nPress 3 : Show statement \nPress 4 to close ")
        var op : Int = sc.nextInt()
        when (op){
            1 ->{
                println("Enter the amount to deposit")
                dep = sc.nextFloat()
                BankingFunctions(name,accNo,panNo,dep,0f)
                bnk.dataUpdate()
            }
            2->{
                continue
            }
            3->{
                bnk.disp()
            }
        }
    }
}