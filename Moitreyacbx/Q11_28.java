import java.util.Scanner;
class Instructor
{   
    String name;
    int phone;
    Instructor(String name,int phone) {
        this.name=name;
        this.phone=phone;        
    }
    Instructor(){}
    public void display()
    {
        System.out.println("The name of this Instructor is:"+name);
        System.out.println("The phone number of this Instructor is:"+phone);
    }
}
class TextBook
{
    String auth;
    String title,publisher;
    TextBook(){}
    TextBook(String auth,String title,String publisher) {
        this.auth=auth;
        this.title=title;  
        this.publisher=publisher;      
    }
    public void display()
    {
        System.out.println("The Author of this Textbook is:"+auth);
        System.out.println("The Title of this Textbook is:"+title);
        System.out.println("The Publisher of this Textbook is:"+publisher);
    } 
}
class Course
{
    Scanner sc=new Scanner(System.in);
    String c_name;
    TextBook text;
    Instructor inst;
    Course(String c_name) 
    {
        this.c_name=c_name;
        System.out.println("Enter the author of the required course book:");
        String auth=sc.nextLine();
        System.out.println("Enter the title of the required course book:");
        String title=sc.nextLine();
        System.out.println("Enter the publisher of the required course book:");
        String publisher=sc.nextLine();
        text = new TextBook(auth,title,publisher);
        System.out.println("Enter the name of the instructor:");
        String name = sc.nextLine();
        System.out.println("Enter the phone number of the instructor:");
        int phone = sc.nextInt();        
        inst = new Instructor(name,phone);
    }
    public void dispCourse() 
    {
        System.out.println("Enter the name of the course:"+c_name);
        text.display();
        inst.display();
    }
}
class Q11_28
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course name:");
        String c_name = sc.nextLine();
        Course obj_main= new Course(c_name);
        obj_main.dispCourse();
        sc.close();
    }
}