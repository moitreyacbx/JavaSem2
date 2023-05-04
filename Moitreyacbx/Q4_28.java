import java.util.Scanner;
public class Q4_28{
    public static void main(String[] args)
    {
        double radius;
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        radius=sc.nextDouble();
        double area=radius*radius*pi;
        System.out.println("The Area is:"+area);
        sc.close();
    }
}