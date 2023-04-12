import java.util.Scanner;
import java.math.*;
public class Rectangle extends Shape
{
    public void calculateArea()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        System.out.println("Enter the breadth");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("Area of Rectangle is "+area);

    }
}