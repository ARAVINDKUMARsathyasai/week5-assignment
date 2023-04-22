import java.math.BigDecimal;

fun main(){
    var num1 : Double = 0.08
    var num2 : Double = 0.09
    var Dres : Double = num2-num1
    println("Result in cause of double $Dres")

    var n1 : BigDecimal = BigDecimal("0.08")
    var n2 : BigDecimal = BigDecimal("0.09")
    var res : BigDecimal = n2.subtract(n1)

    println("In case of BigDecimal = $res")
}