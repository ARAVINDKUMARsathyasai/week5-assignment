package DailyTask

fun main() {
    var hashSet = HashSet<Int>(5)
    hashSet.add(2)
    hashSet.add(3)
    hashSet.add(13)
    hashSet.add(6)
    hashSet.add(5)

    println("traversing hashSet")
    for (element in hashSet) {
        println(element)
    }
}