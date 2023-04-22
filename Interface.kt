package week5.Basics

/*interface BankAccount {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
    fun getBalance(): Double
}

class SavingsAccount(var balance: Double) : BankAccount {
    override fun deposit(amount: Double) {
        balance += amount
    }

    override fun withdraw(amount: Double) {
        if (balance - amount >= 0) {
            balance -= amount
        } else {
            throw Exception("Insufficient funds")
        }
    }

    override fun getBalance(): Double {
        return balance
    }
}

interface CreditCard {
    fun charge(amount: Double)
    fun getBalance(): Double
}

class MasterCard(var balance: Double) : CreditCard {
    override fun charge(amount: Double) {
        balance += amount
    }

    override fun getBalance(): Double {
        return balance
    }
}

class CreditCardAdapter(private val savingsAccount: SavingsAccount) : CreditCard {
    override fun charge(amount: Double) {
        savingsAccount.withdraw(amount)
    }

    override fun getBalance(): Double {
        return savingsAccount.getBalance()
    }
}

fun main() {
    val savingsAccount = SavingsAccount(1000.0)
    val creditCard = CreditCardAdapter(savingsAccount)

    creditCard.charge(500.0)
    println("Savings account balance: ${savingsAccount.getBalance()}")
    println("Credit card balance: ${creditCard.getBalance()}")
}
*/