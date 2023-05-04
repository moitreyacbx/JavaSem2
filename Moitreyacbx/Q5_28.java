import java.util.Scanner;
public class Q5_28{
    public static void main(String[] args)
    {
        String str1,str2;
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        str1=sc.nextLine();
        str2=str1;
        if(str1==str2)
        {
            System.out.println("Strings are Equal");
        }  
        else{
        System.out.println("Strings are not Equal");
        }
        if(str1.equals(str2))
        {
            System.out.println("Strings are Equal for equals");
        }  
        else{
        System.out.println("Strings are not Equal for equals");
        }
        System.out.println("Enter the new string");
        str1=sc.nextLine();
        System.out.println("Enter the second new string");
        str2=sc.nextLine();
        if(str1==str2)
        {
            System.out.println("Strings are Equal for method 2");
        }  
        else{
        System.out.println("Strings are not Equal for method 2");
        }
        if(str1.equals(str2))
        {
            System.out.println("Strings are Equal for equals method 2");
        }  
        else{
        System.out.println("Strings are not Equal for equals for method 2");
        }
        sc.close();
        
    }
}