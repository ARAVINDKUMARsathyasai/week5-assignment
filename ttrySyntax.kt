package week5

fun main(args: Array<String>){
    var num1 : Int = 10
    var num2 : Int = 0

    try {
        System.out.println(num1/num2)
    }
    catch (ae : ArithmeticException){
        System.out.println("Exception is handeled")
    }
    catch(rt:RuntimeException){
        System.out.println("Runtime Exceptions is handeled")
    }
    catch (ex:Exception){
        println("All exceptions are handled here")
    }
    finally {
        System.out.println("Try with only finally is a valid syntax i am not intreseted in handling the exception for me preventing the resouce lekage is important \n\n")
    }
}