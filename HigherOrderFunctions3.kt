package week5

// Higher-order function that takes a lambda as an argument
fun transaction(action: (Double) -> Double): Double {
    var balance = 0.0
    while (true) {
        print("Enter transaction amount (0 to quit): ")
        val amount = readLine()?.toDoubleOrNull() ?: 0.0
        if (amount == 0.0) {
            break
        }
        balance = action(amount)
        println("New balance: $balance")
    }
    return balance
}

// Main function that uses the higher-order function
fun main() {
    val deposit = { amount: Double -> amount }
    val withdrawal = { amount: Double -> -amount }

    println("Welcome to the Bank!")
    val finalBalance = transaction {
        if (it >= 0) {
            deposit(it)
        } else {
            withdrawal(it)
        }
    }
    println("Thank you for banking with us!")
    println("Final balance: $finalBalance")
}

