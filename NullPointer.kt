fun main(){
    var str : String? = null
    try{
        System.out.println(str!!.length)
    }
    catch(npe:NullPointerException){
        npe.printStackTrace()
    }
}
