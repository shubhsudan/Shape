import java.util.Scanner;
import java.math.*;

public class Sphere extends Shape implements Volume
{


    @Override
    public void calculateArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the radius");

        double R = sc.nextDouble();
        //double area = sc.nextDouble();

        double area = 4*Math.PI*R*R;
        System.out.println("Area of Sphere is "+area);
    }

    @Override
    public void calculateVolume()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the radius");

        double R = sc.nextDouble();
        //double area = sc.nextDouble();

        double area = (4 / 3) * Math.PI * Math.pow(R,3);
        System.out.println("Volume of Sphere is "+area);
    }
}
