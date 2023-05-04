import java.util.Scanner;
class Vank
{
    static float ir;
    int acc_num;
    double balance;
    int time;
    Vank(int acc_num,double balance)
    {
        this.acc_num=acc_num;
        this.balance=balance;
    }
    public static void  display()
    {
        System.out.println("The interest is:" + ir);
    }
    public static void changeIR(float rate)
    {
        ir=rate;
    }
    public double calc(int time)
    {
        return (ir*time*balance)/100 + balance;
    }
    public void displaybal()
    {
        System.out.println("The initial balance is:" + balance);
    }
}
public class Q9_28
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bank Account Number:");
        int acc = sc.nextInt();
        System.out.println("Enter the balance:");
        double bal = sc.nextDouble();
        System.out.println("Enter Interest Rate:");
        float ir = sc.nextFloat();
        System.out.println("Enter the Time you want to store money(in years):");
        int time = sc.nextInt();
        Vank obj = new Vank(acc,bal);
        Vank.changeIR(ir);
        Vank.display();
        double finalbal = obj.calc(time);
        obj.displaybal();
        System.out.println("Account number:"+acc+"\nThe final balance is:"+ finalbal);
        sc.close();
    }
}