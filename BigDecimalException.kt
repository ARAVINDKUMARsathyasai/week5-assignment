import java.math.BigDecimal;

fun main(){
    var num1 : BigDecimal = BigDecimal("10")
    var num2 : BigDecimal = BigDecimal("3")

    try {
        var res : BigDecimal= num1.divide(num2)
        print(res)
    }
    catch (ai:ArithmeticException){
        println("Recursive divisions cannot be handeled by the BigDecimal class")
    }
}