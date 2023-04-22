package week5

abstract class SIM {
    public abstract fun datapack();
    public abstract fun calling();
}

class jio : SIM(){
    public override fun datapack() {
        System.out.println("Jio data packs can be activated through MyJio app or through UPI apps")
    }

    public override fun calling() {
        System.out.println("Will provide smooth caller experience")
    }
}

class Airtel:SIM(){
    public override fun datapack() {
        System.out.println("Airtel data pack can be activated through Airtel than UPI apps")
    }

    public override fun calling() {
        System.out.println("Will provide best caller experience")
    }
}

fun main(args: Array<String>){
    var jio = jio()
    var airtel = Airtel()

    jio.datapack()
    jio.calling()

    airtel.datapack()
    airtel.calling()
}