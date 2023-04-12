import java.util.Scanner;
public class Square extends Shape
{

    @Override
    public void calculateArea() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int l = sc.nextInt();
        int area = l*l;

        System.out.println("Area of Square is l**2 "+area);


    }
}
