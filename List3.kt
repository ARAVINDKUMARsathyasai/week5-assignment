package DailyTask

//Program for list iteration method
fun main() {
    val names = listOf("ARAVIND","SUNIL","PRAVEEN","HELLO","WORLD")

    //method1
    for (name in names) {
        print("$name, ")
    }
    println()

    //method 2
    for (i in 0 until names.size){
        print("$names[i]")
    }
    //method 3
    names.forEachIndexed({i,j -> println("names[$i] = $j") })

    //method4

    val it: ListIterator<String> = names.listIterator()
    while (it.hasNext()){
        val i = it.next()
        print("$i")
    }
    println()
}