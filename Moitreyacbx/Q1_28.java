import java.util.Scanner;
public class Q1_28
{
    public static void main(String[] args) {
       short x,y;
       int s=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 1st number:");
       x=sc.nextShort();
       System.out.println("Enter 2nd number");
       y=sc.nextShort();
       s=x+y;
       System.out.println("The sum is:"+ s);
       sc.close();
    }
}