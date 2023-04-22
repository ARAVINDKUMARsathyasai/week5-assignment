package DailyTask

fun main() {
    val list = listOf(2,3,5,6)
    val res = list.contains(0)

    if (res) {
        println("The List Contains 0")
    }
    else {
        println("The List Dosen’t Contain 0")
    }

    val result = list.containsAll(listOf(7,9))

    if (result){
        println("The List Contains 7 and 9")
    }
    else {
        println("The List does not contain 7 and 9")
    }
}
