package week5

import java.util.*

open class Human{
    private var name : String? = null
    private var address :String? = null
    private var age : Int = 0
    private var phoneNo : Long = 0

    public constructor(){}

    public constructor(name:String,address:String,age:Int,phoneNo:Long){
        this.name = name
        this.address = address
        this.age = age
        this.phoneNo = phoneNo
    }

    public fun display():Unit{
        System.out.println("========================== Persnol details ==================================");
        System.out.println("Name as per the records = "+name);
        System.out.println("Address as per the records = "+address);
        System.out.println("Age as per the records = "+age);
        System.out.println("Phone number as per the records = "+phoneNo);
    }
}

class Crickter : Human{
    private var team : String? = null
    private var totalMatchs : Int = 0
    private var totalRuns : Long = 0
    private var healthStatus : Boolean = true

    public constructor(){}

    public constructor(name: String,address: String,age: Int,phoneNo: Long,team:String,totalMatchs:Int,totalRuns:Long,healthStatus:Boolean):super(name, address, age, phoneNo){
        this.team = team
        this.totalMatchs = totalMatchs
        this.totalRuns = totalRuns
        this.healthStatus = healthStatus
    }

    public fun disp():Unit{
        super.display()
        System.out.println("");
        System.out.println("============================== Player track ==========================================");
        System.out.println("Team = "+team);
        System.out.println("Total matchs = "+totalMatchs);
        System.out.println("Total runs = "+totalRuns);
        if(healthStatus)
            System.out.println("Eligible for further games");
        else
            System.out.println("not eligible for next game")
    }
}

class Employe:Human{
    private var company :String? = null
    private var desicnation:String? = null
    private var role :String?=null
    private var salary : Long = 0

    public constructor(){}

    public constructor(name : String,address: String,age: Int,phoneNo: Long,company:String,desicnation:String,role:String,salary:Long):super(name, address, age, phoneNo){
        this.company = company
        this.desicnation = desicnation
        this.role = role
        this.salary = salary
    }

    public fun disp():Unit{
        super.display()
        System.out.println("");
        System.out.println("Working in "+company);
        System.out.println("Desicnation "+desicnation);
        System.out.println("Role "+role);
        System.out.println("Salary "+salary);
    }
}

fun main(args : Array<String>){
    System.out.println("Press 1 for the Cricketer data collection");
    System.out.println("Press 2 for the Employee data collection");
    System.out.println("Press 3 to exit the function");

    val sc :Scanner = Scanner(System.`in`)

    var choice : Int

    var name : String
    var address : String
    var age : Int
    var phoneNo : Long

    var team : String
    var totalMatchs:Int
    var totalRuns : Long
    var healthStatus : Boolean

    var company: String
    var desicnation: String
    var role: String
    var salary: Long

    choice = sc.nextInt()
    var totalCric = 0
    var totalEmp = 0

    if (choice == 1){
        println("Enter total number of Cricters")
        totalCric = sc.nextInt()
    }else{
        println("Enter total number of employees")
        totalEmp = sc.nextInt()
    }

    var ct  = Array<Crickter>(totalCric){Crickter()}
    var cmp = Array<Employe>(totalEmp){Employe()}

    while (true){
        when (choice){
            1->{
                for (i in 0 until totalCric){
                    System.out.println("Enter the name of the player"+(i+1));
                    name=sc.next();
                    System.out.println("Enter the address of the player "+(i+1));
                    address=sc.next();
                    System.out.println("Enter the age of the player "+(i+1));
                    age = sc.nextInt();
                    System.out.println("Enter the phone number of the player "+(i+1));
                    phoneNo = sc.nextLong();
                    System.out.println("Enter the team of the player "+(i+1));
                    team=sc.next();
                    System.out.println("Enter the total matches played by the player"+(i+1));
                    totalMatchs = sc.nextInt();
                    System.out.println("Enter the total runs scored by the player"+(i+1));
                    totalRuns=sc.nextLong();
                    var op: Int
                    println("Health status of the player \npress 1 for good \npress 2 for not good")
                    op = sc.nextInt()
                    if(op == 1)
                        healthStatus = true;
                    else
                        healthStatus = false;
                    ct[i] = Crickter(name, address, age, phoneNo, team, totalMatchs, totalRuns,healthStatus);
                }
            }
            2->{
                for(i in 0 until totalEmp){
                    System.out.println("Enter the name of the Employee"+(i+1));
                    name=sc.next();
                    System.out.println("Enter the address of the Employee "+(i+1));
                    address=sc.next();
                    System.out.println("Enter the age of the Employee "+(i+1));
                    age = sc.nextInt();
                    System.out.println("Enter the phone number of the Employee "+(i+1));
                    phoneNo = sc.nextLong();
                    System.out.println("Enter the company name of the Employee"+(i+1));
                    company=sc.next();
                    System.out.println("Enter the desicnation of the Employee"+(i+1));
                    desicnation=sc.next();
                    System.out.println("Enter the role of the Employee"+(i+1));
                    role=sc.next();
                    System.out.println("Enter the salary of the Employee"+(i+1));
                    salary=sc.nextLong();

                    cmp[i]= Employe(name, address, age, phoneNo, company, desicnation, role, salary)
                    System.out.println("Enter next choice ")
                }
            }
            3->{
                System.exit(0)
            }
            else->{
                System.out.println("Invalid input")
            }
        }
    }

    for (i in 0 until totalCric){
        System.out.println("==============================Details of Cricketer"+(i+1)+"====================================");
        ct[i].disp();
    }

    for (i in 0 until totalEmp){
        System.out.println("==============================Details of Employee"+(i+1)+"====================================");
        cmp[i].disp();
    }
}