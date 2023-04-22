package week5

import java.util.*

fun main() {
    val items = ArrayList<String>()
    var input: String?

    // Prompt user to add items to the cart
    do {
        print("Enter an item to add to your cart (or enter 'done' to finish): ")
        input = readLine()
        if (input != null && input != "done") {
            items.add(input)
        }
    } while (input != null && input != "done")

    // Display the items in the cart
    if (items.isNotEmpty()) {
        println("\nYour cart contains the following items:")
        for (item in items) {
            println("- $item")
        }
    } else {
        println("\nYour cart is empty.")
    }
}