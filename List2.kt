package DailyTask

fun main()
{
    val a = listOf("ARAVIND","SUNIL","PRAVEEN","HELLO","WORLD")
    println("The Size of the List is: "+a.size)
    println("The index of the element PRAVEEN is: "+a.indexOf("PRAVEEN"))
    for (i in a.indices)
    {
        print(" "+a[i])
    }
}
