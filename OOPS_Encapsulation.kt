package week5

import java.util.Scanner

class Info{
    private var name : String? = null
    private var address : String? = null
    private var age : Int = 0
    private var phoneNo : Long = 0

    public fun getName(): String? {
        return name
    }
    public fun getAddress(): String?{
        return address
    }
    public fun getPhoneNo():Long{
        return phoneNo
    }
    public fun getAge():Int{
        return age
    }
    public fun setName(name:String){
        this.name = name
    }
    public fun setAge(age:Int){
        this.age = age
    }
    public fun setAddress(address:String){
        this.address=address
    }
    public fun setPhoneNo(phoneNo:Long){
        this.phoneNo = phoneNo
    }
}
fun main(args: Array<String>){
    val sc : Scanner = Scanner(System.`in`)
    var name : String
    var address : String
    var age : Int
    var phoneNo : Long

    val det : Info = Info()

    println("Enter the name of the employee")
    name = sc.nextLine()
    println("Enter the address ")
    address = sc.nextLine()
    println("Enter the age of the employee")
    age= sc.nextInt()
    println("Enter the phone number of the employee")
    phoneNo = sc.nextLong()

    det.setName(name)
    det.setAddress(address)
    det.setAge(age)
    det.setPhoneNo(phoneNo)

    System.out.println("Name as per the records = "+det.getName());
    System.out.println("Address as per the records = "+det.getAddress());
    System.out.println("Age as per the records = "+det.getAge());
    System.out.println("Phone number as per the records = "+det.getPhoneNo())

}