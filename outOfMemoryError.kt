fun main(){
    try {
        var arr = Array<Int>(Integer.MAX_VALUE) { 0 }
    }
    catch(e:OutOfMemoryError){
        e.printStackTrace();
    }
}