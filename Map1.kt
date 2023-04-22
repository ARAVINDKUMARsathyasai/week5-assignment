package DailyTask

fun main() {
    val ranks = mapOf(1 to "ARAVIND", 2 to "SUNIL",3 to "PRAVVEN", 4 to "VINAY")
    //method1
    println("Rank #1 is: "+ranks[1])
    //method2
    println("Rank #3 is: "+ranks.getValue(3))
    //method3
    println("Rank #4 is: "+ranks.getOrDefault(4, 0))
    //method 4
    val team = ranks.getOrElse(2,{ 0 })
    println(team)
}
