import java.util.*;
public class transfer extends registration
{
    static double amt1,amt2,b;
    static int acnor;
    public static void main()
    {
        withdraw wc=new withdraw();
        b=wc.bal;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the account number of the receiver = ");
        acnor=sc.nextInt();
        System.out.println("enter the amount to transfer = ");
        amt1=sc.nextDouble();
        b-=amt1;
        System.out.println("amount transferred successfully. ");
        System.out.println("remaining balance = "+b);
    }
}