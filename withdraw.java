import java.util.*;
public class withdraw extends registration
{
    static double wd,remainder,x,bal,dep,a,b;
    public static void main()
    {
        registration r = new registration();
        bal=balance;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the amount of money that you want to withdraw = Rs.");
        wd=sc.nextDouble();
        bal-=wd;
        System.out.println("withdrawn successfully.");
        System.out.println("new balance = "+bal);
        System.out.print("\nEnter the amount of money that you want to deposit = Rs.");
        dep=sc.nextDouble();
        bal+=dep;
        System.out.println("Amount deposited successfully. ");
        System.out.println("net balance is = Rs.\n"+bal);
        System.out.println("enter the amount to withdraw = ");
    }
}