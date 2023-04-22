package week5

import java.sql.*

class Product(
    var id: Int,
    var name: String,
    var description: String,
    var price: Double
)

class ProductDAO(
    private val connection: Connection
) {
    fun addProduct(product: Product) {
        val statement = connection.prepareStatement(
            "INSERT INTO products (name, description, price) VALUES (?, ?, ?);",
            Statement.RETURN_GENERATED_KEYS
        )
        statement.setString(1, product.name)
        statement.setString(2, product.description)
        statement.setDouble(3, product.price)
        statement.executeUpdate()
        val generatedKeys = statement.generatedKeys
        if (generatedKeys.next()) {
            product.id = generatedKeys.getInt(1)
        }
        statement.close()
    }

    fun getProduct(id: Int): Product? {
        val statement = connection.prepareStatement(
            "SELECT * FROM products WHERE id = ?;"
        )
        statement.setInt(1, id)
        val result = statement.executeQuery()
        return if (result.next()) {
            Product(
                result.getInt("id"),
                result.getString("name"),
                result.getString("description"),
                result.getDouble("price")
            )
        } else {
            null
        }
        statement.close()
    }

    fun updateProduct(product: Product) {
        val statement = connection.prepareStatement(
            "UPDATE products SET name = ?, description = ?, price = ? WHERE id = ?;"
        )
        statement.setString(1, product.name)
        statement.setString(2, product.description)
        statement.setDouble(3, product.price)
        statement.setInt(4, product.id)
        statement.executeUpdate()
        statement.close()
    }

    fun deleteProduct(id: Int) {
        val statement = connection.prepareStatement(
            "DELETE FROM products WHERE id = ?;"
        )
        statement.setInt(1, id)
        statement.executeUpdate()
        statement.close()
    }
}

fun main() {
    val url = "jdbc:mysql://localhost:3306/mydb"
    val username = "root"
    val password = "password"
    val connection = DriverManager.getConnection(url, username, password)
    val dao = ProductDAO(connection)

    // Add a product
    val product1 = Product(0, "Product 1", "Description for Product 1", 19.99)
    dao.addProduct(product1)
    println("Added product: $product1")

    // Get a product
    val product2 = dao.getProduct(product1.id)
    println("Retrieved product: $product2")

    // Update a product
    product2?.price = 24.99
    dao.updateProduct(product2!!)
    println("Updated product: $product2")

    // Delete a product
    dao.deleteProduct(product1.id)
    println("Deleted product with ID ${product1.id}")
}
