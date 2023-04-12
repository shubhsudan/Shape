import java.math.*;
import java.util.Scanner;

public class Circle extends Shape
{
    public void calculateArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the radius");

        double R = sc.nextDouble();
        //double area = sc.nextDouble();

        double area = 2*Math.PI*R*R;
        System.out.println("Area of circle is "+area);

    }
}