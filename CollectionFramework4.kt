package week5

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val shoppingList = ArrayList<String>()

    println("Welcome to the shopping app!")
    while (true) {
        println("\nWhat would you like to do?")
        println("1. Add item to shopping list")
        println("2. Remove item from shopping list")
        println("3. View shopping list")
        println("4. Exit")
        print("Enter your choice: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Enter item to add: ")
                shoppingList.add(scanner.next())
                println("Item added to shopping list!")
            }
            2 -> {
                print("Enter item to remove: ")
                val itemToRemove = scanner.next()
                if (shoppingList.remove(itemToRemove)) {
                    println("Item removed from shopping list!")
                } else {
                    println("Item not found in shopping list.")
                }
            }
            3 -> {
                if (shoppingList.isEmpty()) {
                    println("Shopping list is empty.")
                } else {
                    println("Shopping list:")
                    shoppingList.forEach { println("- $it") }
                }
            }
            4 -> {
                println("Exiting shopping app. Goodbye!")
                return
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}