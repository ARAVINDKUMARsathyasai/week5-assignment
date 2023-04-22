package DailyTask

fun main(args: Array<String>){
    val intSet = setOf(2,6,4,29,4,5)
    val mySet: Set<Any> = setOf(2,6,4,29,4,5,"ARAVIND","SUNIL")
    println(".......print Int set.........")
    for(element in intSet){
        println(element)
    }
    println(".......print Any set.........")
    for(element in mySet){
        println(element)
    }
}

