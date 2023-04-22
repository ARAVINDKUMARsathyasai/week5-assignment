fun main(){
    var array1 = arrayOf(1,2,3,5,6)
    array1.set(6,10)
    try {
        System.out.println(array1.get(7))
    }
    catch(ae:ArrayIndexOutOfBoundsException){
        println("Array out of the range object doesn't exiscts")
        println(ae.message)
    }
}
