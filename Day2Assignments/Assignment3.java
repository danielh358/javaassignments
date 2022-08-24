import java.lang.Math;
import java.util.Random;

interface Shapes{
    public double calculateArea();
    public void display();
}

class Rectangle implements Shapes{
    double side1;
    double side2;
    public Rectangle(double length, double width){
        side1 = length;
        side2 = width;

    }

    public double calculateArea(){
        return (side1 * side2);
    }

    public void display(){
        double area = this.calculateArea();
        System.out.printf("This is a rectangle.\nSide 1 is %f \nSide 2 is %f\nThe area is %f\n", this.side1, this.side2, area);
    }

}

class Circle implements Shapes{
    double radius;
    public Circle(double radiusinput){
        radius = radiusinput;
    }
    public double calculateArea(){
        return (2 * Math.PI * this.radius);
    }
    public void display(){
        double area = this.calculateArea();
        System.out.printf("This is a circle.\nThe radius is %f \nThe area is %f\n", this.radius, area);

    }

}

class Triangle implements Shapes{
    double angle;
    double side1;
    double side2;

    public Triangle(double ang, double s1, double s2){
        angle = ang;
        side1=s1;
        side2=s2;

    }

    public double calculateArea(){
        return ((side1 * side2 * Math.abs(Math.sin(angle)))/2);
    }
    public void display(){
        double area = this.calculateArea();
        System.out.printf("This is a triangle.\nSide 1 is %f \nSide 2 is %f\nThe angle between these two sides is %f\nThe area is %f\n", this.side1, this.side2,this.angle, area);

    }

}

public class Assignment3 {
    public static void main(String[] args){
        Random dgen = new Random();

        double value1 =dgen.nextDouble(50);
        double value2 = dgen.nextDouble(50);
        double angle = dgen.nextDouble(180.0);

        Rectangle rec = new Rectangle(value1, value2);
        Circle cir = new Circle(value1);
        Triangle tri = new Triangle(angle, value1, value2);

        rec.display();
        cir.display();
        tri.display();



    

    
    }
}
