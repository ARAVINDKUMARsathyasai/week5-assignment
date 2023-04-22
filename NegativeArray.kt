fun main(){
    try {
        var arr = Array<Int>(-10){0}
    }
    catch (ne:NegativeArraySizeException){
        println("NegativeArraySizeException")
        println("Array cannot have negative size declaration")
    }
}