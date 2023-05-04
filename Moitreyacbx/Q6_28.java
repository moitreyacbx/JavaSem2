public class Q6_28{
    void show(int s){
        System.out.println("The integer number is :" + s);
    }
    void show(double d)
    {
        System.out.println("The double number is :" + d);
    }
    public static void main(String[] args)
    {
        Q6_28 obj=new Q6_28();
        obj.show((short)69);
        obj.show(69.96);
    }
}