fun main(){
    var num : Int
    var str : String = "ten"
    try{
        num = str.toInt()
    }catch (ne: NumberFormatException){
        print(ne.message)
    }
}
