public class Q2_28 {
    public static void main(String[] args)
    {
        System.out.println("Enter the command line arguments");
        int count=0,i;
        for(i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
            count++;
        }
        System.out.println("The number of arguments is "+count);
    }
}
