//shape->Cicle ,Rectangle,Triangle
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {


        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Sphere sphere = new Sphere();

        circle.stateShape("circle");
        circle.calculateArea();
        rectangle.calculateArea();
        square.calculateArea();
        triangle.calculateArea();
        sphere.calculateArea();
        sphere.calculateVolume();



    }

}
