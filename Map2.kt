package DailyTask

fun main()
{
    val rollNumberToNames = mapOf("ARAVINDKUMAR" to 1,"SUNILKUMAR" to 2,"PRAVEEN" to 3,"VINAY" to 4,"KIRAN" to 5)
    val namesToid = mapOf("ARAVINDKUMAR" to 10,"SUNILKUMAR" to 11,"PRAVEEN" to 12,"VINAY" to 13,"KIRAN" to 14)

    println("STUDENT INFORMATION")
    println("The Entries of RollNumbers to Names are: "+ rollNumberToNames)
    println("Names Of the Students are: "+rollNumberToNames.keys)
    println("RollNumbers Of the Students are: "+rollNumberToNames.values)
    println("ID's pf the Students are: "+namesToid.values)
    println("End of The Program")
}