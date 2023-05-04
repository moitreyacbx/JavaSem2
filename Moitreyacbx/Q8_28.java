import java.util.Scanner;

class Student {
    int roll;
    String name;
    double score;

    Student(int roll, String name, double score) {

        this.roll = roll;
        this.name = name;
        this.score = score;
    }

    Student(int roll) {

        this.roll = roll;
        this.name = "";
        this.score = 0;
    }

    Student(int roll, String name) {

        this.roll = roll;
        this.name = name;
        this.score = 0;
    }

    Student() {

        this.roll = 00;
        this.name = "Arijit";
        this.score = 100;
    }

    public void display() {
        System.out.println("The Roll is:" + roll);
        System.out.println("The Name is:" + name);
        System.out.println("The Score is:" + score);
    }

    Student(Student obj) {
        roll = obj.roll;
        name = obj.name;
        score = obj.score;

    }
}

public class Q8_28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.print("Enter the roll no:");
        int roll = sc.nextInt();
        System.out.println("Enter the score:");
        double score = sc.nextDouble();
        Student std = new Student(roll, name, score);
        std.display();
        Student std2 = new Student(std);
        std2.display();
        sc.close();
        Student std3 = new Student(roll, name);
        std3.display();
        Student std4 = new Student(roll);
        std4.display();
        Student std5 = new Student();
        std5.display();
        if((std==std2)){
        System.out.println("Shallow Copy:");
        }
        else{
            System.out.println("Deep Copy");      
        }

    }

}