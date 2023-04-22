package week5

abstract open class ICars {
    public abstract fun ridding();
    public abstract fun millage();

    public fun features(){
        System.out.println("Best engine");
        System.out.println("Should have regular services");
    }
}

class BMW : ICars(){

    public override fun ridding(){
        System.out.println("These cars can support long ride with comfort")
    }

    public override fun millage(){
        System.out.println("These dont have best millage comparitivlly");
    }
}

class Suziki : ICars(){
    public override fun ridding() {
      System.out.println("These cars can support long ride with some less comfort")
    }

    public override fun millage() {
        System.out.println("These have best millage comparitivly");
    }
}

fun main(args : Array<String>){
    var bw:BMW = BMW()
    var sk:Suziki = Suziki()

    bw.ridding()
    bw.millage()
    bw.features()

    sk.ridding()
    sk.millage()
    sk.features()
}