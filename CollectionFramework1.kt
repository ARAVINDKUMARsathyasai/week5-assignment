package week5

import java.util.*

data class BankAccount(val accountNumber: String, var balance: Double = 0.0)

fun main() {
    val scanner = Scanner(System.`in`)
    val accounts = mutableListOf<BankAccount>()

    // Create new account
    fun createAccount() {
        print("Enter account number: ")
        val accountNumber = scanner.next()
        val account = BankAccount(accountNumber)
        accounts.add(account)
        println("Account created successfully!")
    }

    // Deposit money to an account
    fun depositMoney() {
        print("Enter account number: ")
        val accountNumber = scanner.next()
        val account = accounts.find { it.accountNumber == accountNumber }
        if (account == null) {
            println("Account not found")
        } else {
            print("Enter amount to deposit: ")
            val amount = scanner.nextDouble()
            account.balance += amount
            println("Deposit successful. New balance: ${account.balance}")
        }
    }

    // Withdraw money from an account
    fun withdrawMoney() {
        print("Enter account number: ")
        val accountNumber = scanner.next()
        val account = accounts.find { it.accountNumber == accountNumber }
        if (account == null) {
            println("Account not found")
        } else {
            print("Enter amount to withdraw: ")
            val amount = scanner.nextDouble()
            if (amount > account.balance) {
                println("Insufficient funds")
            } else {
                account.balance -= amount
                println("Withdrawal successful. New balance: ${account.balance}")
            }
        }
    }

    // Display account details
    fun displayAccountDetails() {
        print("Enter account number: ")
        val accountNumber = scanner.next()
        val account = accounts.find { it.accountNumber == accountNumber }
        if (account == null) {
            println("Account not found")
        } else {
            println("Account Number: ${account.accountNumber}")
            println("Balance: ${account.balance}")
        }
    }

    // Main menu loop
    while (true) {
        println()
        println("1. Create account")
        println("2. Deposit money")
        println("3. Withdraw money")
        println("4. Display account details")
        println("5. Exit")
        print("Enter your choice: ")
        when (scanner.nextInt()) {
            1 -> createAccount()
            2 -> depositMoney()
            3 -> withdrawMoney()
            4 -> displayAccountDetails()
            5 -> return
            else -> println("Invalid choice")
        }
    }
}