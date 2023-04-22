package week5

data class Account(val name: String, var balance: Double)

fun main() {
    val accounts = mutableListOf(
        Account("Aravind Kumar", 1000.0),
        Account("Sunil kumar", 500.0),
        Account("Bharath", 250.0)
    )

    // Higher-order function to perform a transaction on an account
    fun transaction(account: Account, amount: Double, action: (Account, Double) -> Unit) {
        println("Performing transaction on account ${account.name}")
        action(account, amount)
        println("New balance: ${account.balance}")
    }

    // Withdraw function to be used in the transaction
    val withdraw: (Account, Double) -> Unit = { account, amount ->
        if (amount > account.balance) {
            throw Exception("Insufficient funds")
        }
        account.balance -= amount
    }

    // Deposit function to be used in the transaction
    val deposit: (Account, Double) -> Unit = { account, amount ->
        account.balance += amount
    }

    // Get user input for transaction
    println("Which account do you want to perform a transaction on?")
    accounts.forEachIndexed { index, account ->
        println("$index: ${account.name}")
    }
    val accountIndex = readLine()?.toInt() ?: 0
    val account = accounts[accountIndex]

    println("Do you want to deposit or withdraw?")
    val actionString = readLine() ?: ""
    val action = when (actionString.toLowerCase()) {
        "deposit" -> deposit
        "withdraw" -> withdraw
        else -> throw Exception("Invalid action")
    }

    println("How much do you want to ${actionString.toLowerCase()}?")
    val amount = readLine()?.toDouble() ?: 0.0

    // Perform the transaction using the higher-order function
    transaction(account, amount, action)
}
