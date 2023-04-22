fun main(){
    var num1 : Int = 10
    var num2 : Int = 0
    System.out.println("$num1 / $num2 = ")
    try {
        println("${num1/num2}")
    }
    catch (e:ArithmeticException){
        e.printStackTrace()
    }
}
