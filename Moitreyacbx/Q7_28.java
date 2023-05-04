import java.util.Scanner;
class Student{
    int roll;
    String name;
    double score;
public void setter(int roll,String name,double score){

    this.roll=roll;
    this.name=name;
    this.score=score;
}
public void display()
{
    System.out.println("The Roll is:" + roll);
    System.out.println("The Name is:" + name);
    System.out.println("The Score is:" + score);        
}
public void copy(Student obj)
{
    roll=obj.roll;
    name=obj.name;
    score=obj.score;

}
}
public class Q7_28{
    public static void main(String[] args)
    {
    Student std=new Student();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name:");
    String name=sc.next();
    System.out.print("Enter the roll no:");
    int roll=sc.nextInt();
    System.out.println("Enter the score:");
    double score=sc.nextDouble();
    std.setter(roll,name,score);
    std.display();
    Student std2=new Student();
    std2.copy(std);
    std2.display();
    sc.close();
    }

}