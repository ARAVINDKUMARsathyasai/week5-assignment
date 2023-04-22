fun main() {
    // create a function that takes two integers as arguments and returns their sum
    val sum: (Int, Int) -> Int = { a, b -> a + b }

    // ask the user for two integers
    print("Enter the first integer: ")
    val a = readLine()?.toInt() ?: 0

    print("Enter the second integer: ")
    val b = readLine()?.toInt() ?: 0

    // call the higher-order function with the user inputs
    val result = calculate(a, b, sum)

    // print the result
    println("The sum of $a and $b is $result")
}

// higher-order function that takes two integers and a function that takes two integers and returns an integer
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
