package week5

import java.sql.*

fun main() {
    // Establish a database connection
    val url = "jdbc:mysql://localhost:3306/banking_app"
    val username = "root"
    val password = "password"

    var conn: Connection? = null
    try {
        conn = DriverManager.getConnection(url, username, password)

        // Create a new account
        val account = Account(123456789, "John Doe", 5000.0)
        createAccount(conn, account)

        // Update the account balance
        val newBalance = 7500.0
        updateBalance(conn, account.accNum, newBalance)

        // Retrieve the account information
        val retrievedAccount = retrieveAccount(conn, account.accNum)
        println("Account information: $retrievedAccount")

        // Delete the account
        deleteAccount(conn, account.accNum)
    } catch (e: SQLException) {
        e.printStackTrace()
    } finally {
        conn?.close()
    }
}

data class Account(val accNum: Int, val name: String, var balance: Double)

fun createAccount(conn: Connection, account: Account) {
    val sql = "INSERT INTO accounts(acc_num, name, balance) VALUES(?, ?, ?)"
    val stmt = conn.prepareStatement(sql)
    stmt.setInt(1, account.accNum)
    stmt.setString(2, account.name)
    stmt.setDouble(3, account.balance)
    stmt.executeUpdate()
    println("Account created: $account")
}

fun updateBalance(conn: Connection, accNum: Int, newBalance: Double) {
    val sql = "UPDATE accounts SET balance=? WHERE acc_num=?"
    val stmt = conn.prepareStatement(sql)
    stmt.setDouble(1, newBalance)
    stmt.setInt(2, accNum)
    stmt.executeUpdate()
    println("Account balance updated to $newBalance for account $accNum")
}

fun retrieveAccount(conn: Connection, accNum: Int): Account? {
    val sql = "SELECT * FROM accounts WHERE acc_num=?"
    val stmt = conn.prepareStatement(sql)
    stmt.setInt(1, accNum)
    val rs = stmt.executeQuery()
    if (rs.next()) {
        val accNum = rs.getInt("acc_num")
        val name = rs.getString("name")
        val balance = rs.getDouble("balance")
        return Account(accNum, name, balance)
    }
    return null
}

fun deleteAccount(conn: Connection, accNum: Int) {
    val sql = "DELETE FROM accounts WHERE acc_num=?"
    val stmt = conn.prepareStatement(sql)
    stmt.setInt(1, accNum)
    stmt.executeUpdate()
    println("Account $accNum deleted")
}
