package week5

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val transactions = ArrayList<Int>()

    while (true) {
        println("Enter a transaction amount (or 0 to exit): ")
        val amount = scanner.nextInt()

        if (amount == 0) {
            break
        }

        transactions.add(amount)
    }

    println("Your transactions: $transactions")

    val balance = transactions.sum()
    println("Your current balance is: $balance")
}
