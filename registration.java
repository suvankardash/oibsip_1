import java.util.*;
public class registration
{
    static String name,user_name,pw;
    static int acno; static double balance;
    public static void main(String[]args)
    {
        withdraw w=new withdraw();
        transfer t=new transfer();
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO DBS BANK ATM SERVICE.");
        System.out.println("Please register your account ! ");
        System.out.print("Enter your good name = ");
        name=sc.nextLine().toUpperCase();
        System.out.print("Enter the user name you want = ");
        user_name=sc.nextLine();
        System.out.print("Enter a strong password = ");
        pw=sc.nextLine();
        System.out.print("Enter your account number = ");
        acno=sc.nextInt();
        System.out.print("Enter the initial balance payment to be made into the account = ");
        balance=sc.nextDouble();
        if(balance<=500)
        {
            System.out.println("Invalid Amount as the minimum value need in your account is Rs. 500.");
            System.out.println("Please try again from start.");
        }
        else
        {
            System.out.println("\nRegistration Successful. Congratulations ! \n");
            System.out.println("The account details are as mentioned below.");
            System.out.println("Account Holder Name = " + name);
            System.out.println("Account Number = " + acno);
            System.out.println("Account Balance = " + balance);
            withdraw.main();
            transfer.main();
        }
    }
}