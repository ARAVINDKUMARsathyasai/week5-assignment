open class S {
    companion object {
       @JvmStatic
        val x = 10/0
    }
}
fun main(args: Array<String>) {
    var n : S = S()
}