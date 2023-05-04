import java.util.Scanner;

class Metric {
    float km, mile;

    public float getkm(float mile) {
        return mile * (float)1.5;
    }

    public float getmile(float km) {
        return km / (float)1.5;
    }
}

public class Q10_28
{
    public static void main(String args[])
    {
    float mile,km,con_mile,con_km;
    Metric obj=new Metric();
    int choice;
    Scanner sc = new Scanner(System.in); 
    do{
        System.out.println("Enter your choice\n");
        System.out.println("1->MILE TO KILOMETER Converter\n");
        System.out.println("2->KILOMETER To MILE Converter\n");
        System.out.println("3->Exit\n");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the distance in miles:");
                mile=sc.nextFloat();
                con_km=obj.getkm(mile);
                System.out.println("The converted distance in kilometres is:"+con_km+"km");
                break;
            case 2:
                System.out.println("Enter the distance in kilometers:");
                km=sc.nextFloat();
                con_mile=obj.getmile(km);
                System.out.println("The converted distance in kilometres is:"+con_mile+"km");
                break;
            case 3:
                System.out.println("Exited Succesfully!");
                break;
            default:
                System.out.println("Enter valid choice!!!");
                break;
        }
    } while(choice!=3);
sc.close();
    }
}