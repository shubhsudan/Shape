import java.math.*;
import java.util.Scanner;

public class Triangle extends Shape
{
    public void calculateArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the length");
        int l = sc.nextInt();
        System.out.println("Put the breadth");
        int b = sc.nextInt();

        //double area = sc.nextDouble();

        double area = 0.5*l*b;
        System.out.println("Area of Triangle is "+area);

    }
}