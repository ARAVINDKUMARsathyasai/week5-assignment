package week5

import java.util.Scanner

abstract class Shape{
    public abstract fun area(radius:Double):Double;
}

class Circle:Shape(){
    private var area : Double = 0.0

    public override fun area(radius:Double): Double {
        area = Math.PI*radius*radius
        return area;
    }
}

class Sqaure:Shape(){
    private var area : Double = 0.0

    public override fun area(side: Double): Double {
        area = side*side
        return area
    }
}

fun main(args: Array<String>){
    val sc : Scanner = Scanner(System.`in`)

    System.out.println("Enter the radius of the circle");
    var radius : Double= sc.nextDouble();
    var c = Circle();
    System.out.printf("Area of the circle = %.2f",c.area(radius));
    System.out.println("");
    System.out.println("");
    System.out.println("Enter the side of the square");
    var side :Double = sc.nextDouble();
    var sq = Sqaure();
    System.out.printf("Area of the square = %.2f",sq.area(side))
}