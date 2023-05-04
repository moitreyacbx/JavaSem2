import java.util.Scanner;
public class Q3_28 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cm;
        double feet,inch;
        System.out.println("Enter the height in cm");
        cm=sc.nextInt();
        feet=cm/30.5;
        inch=cm/2.54;
        System.out.println("The converted height is: "+feet+" feet and "+inch+" inches");
        sc.close();
    }
}
