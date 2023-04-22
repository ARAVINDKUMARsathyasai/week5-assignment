package DailyTask

fun main()
{
    val list = listOf(5,4,8,1,2,3,6,9,7)
    println("Sorting List in Ascending Order")
    val ascending = list.sorted()
    println(ascending)
    println("Sorting List in Descending Order")
    val descending = list.sortedDescending()
    println(descending)
    println("Done")
}