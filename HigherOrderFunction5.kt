package week5

data class Movie(val title: String, val genre: String, val rating: Double)

fun getMovies(): List<Movie> {
    // Mocking movie data
    val movie1 = Movie("Avengers: Endgame", "Action", 8.4)
    val movie2 = Movie("The Shawshank Redemption", "Drama", 9.3)
    val movie3 = Movie("Inception", "Sci-Fi", 8.8)
    val movie4 = Movie("Pulp Fiction", "Crime", 8.9)
    val movie5 = Movie("Forrest Gump", "Drama", 8.8)

    return listOf(movie1, movie2, movie3, movie4, movie5)
}

fun bookMovieTicket(movies: List<Movie>, filterFn: (Movie) -> Boolean) {
    println("Movies available for booking:")
    val filteredMovies = movies.filter { filterFn(it) }
    if (filteredMovies.isNotEmpty()) {
        filteredMovies.forEachIndexed { index, movie ->
            println("${index + 1}. ${movie.title} (${movie.genre}) - Rating: ${movie.rating}")
        }
        println("Enter the movie number to book a ticket:")
        val input = readLine()
        try {
            val selectedMovieIndex = input?.toIntOrNull()?.minus(1) ?: -1
            if (selectedMovieIndex in 0 until filteredMovies.size) {
                val selectedMovie = filteredMovies[selectedMovieIndex]
                println("You have booked a ticket for ${selectedMovie.title}.")
            } else {
                println("Invalid input. Please try again.")
            }
        } catch (e: NumberFormatException) {
            println("Invalid input. Please try again.")
        }
    } else {
        println("No movies matching the criteria.")
    }
}

fun main() {
    val movies = getMovies()

    // Higher-order function to filter movies by genre
    val filterByGenre: (String) -> (Movie) -> Boolean = { genre ->
        { movie -> movie.genre.equals(genre, ignoreCase = true) }
    }

    println("Enter the genre to filter movies (e.g., Action, Drama, Sci-Fi):")
    val genreInput = readLine()
    genreInput?.let {
        bookMovieTicket(movies, filterByGenre(it))
    } ?: println("Invalid input. Please try again.")
}
