package week5

import java.util.ArrayList

fun main() {
    val networkProviders = ArrayList<String>()

    // Get user input
    print("Enter the number of network providers: ")
    val numProviders = readLine()?.toInt() ?: 0

    for (i in 1..numProviders) {
        print("Enter network provider $i: ")
        val provider = readLine()
        provider?.let { networkProviders.add(it) }
    }

    // Print the array list
    println("Network Providers:")
    networkProviders.forEach { println(it) }
}
