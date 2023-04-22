package week5

/*
data class Movie(val name: String, val rating: String, val price: Double)

fun main() {
    val movies = listOf(
        Movie("RRR", "R", 1299.0),
        Movie("Bhaahubali", "R", 1099.0),
        Movie("Veerashimareddy", "G", 899.0),
        Movie("Avengers: Endgame", "PG-13", 1499.0),
        Movie("Jurassic Park", "PG-13", 999.0)
    )

    val bookTicket: (Movie, Int) -> Unit = { movie, quantity ->
        val total = movie.price * quantity
        println("You have booked $quantity ticket(s) for ${movie.name} (${movie.rating}) at a price of $${movie.price} each.")
        println("Total cost: $$total")
    }

    println("Welcome to the movie booking system!")
    println("Please choose a movie:")
    movies.forEachIndexed { index, movie ->
        println("${index + 1}. ${movie.name} (${movie.rating}) - RS.${movie.price}")
    }
    val movieIndex = readLine()?.toIntOrNull()?.minus(1) ?: error("Invalid input!")
    val selectedMovie = movies.getOrElse(movieIndex) { error("Invalid input!") }

    println("Please enter the number of tickets you want to book:")
    val ticketCount = readLine()?.toIntOrNull() ?: error("Invalid input!")

    bookTicket(selectedMovie, ticketCount)
}
*/