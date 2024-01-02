import java.util.*;
class Task3 
{
     public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            double a;
            ATM obj=new ATM();
            System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.CHECK BALANCE\n4.EXIT");
            int option=sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter the amount to Deposit : ");
                    a=sc.nextDouble();
                    obj.Deposit(a);
                    break;

                case 2:
                    System.out.println("Enter the amount to Withdraw : ");
                    a=sc.nextDouble();
                    obj.Withdraw(a);
                    break;

                case 3:
                    obj.CheckBalance();
                    break;


            }
        }
}

 class ATM
{
    Scanner sc=new Scanner(System.in);
    double bal=100000;
    int account;
    double amount;
    String name;
    public void Deposit(double amount)
    {
            System.out.println("Enter Your Name : ");
            name=sc.next();
            System.out.println("Enter Your A/c No : ");
            account=sc.nextInt();
            bal=bal+amount;
            System.out.println("======AMOUNT DEPOSITED SUCCESSFULLY======");
            System.out.println("Your account balance is :"+bal);

    }
    public void Withdraw(double amount)
    {
            System.out.println("Enter Your Name : ");
            name=sc.next();
            System.out.println("Enter Your A/c No : ");
            account=sc.nextInt();
            System.out.println("Enter the amount to Deposit : ");
            if(amount>bal)
            {
                System.out.println("====Cannot withdraw amount greater than balance====");
            }
            else
            {
                bal=bal-amount;
                System.out.println("======AMOUNT WITHDRAWN SUCCESSFULLY======");
                System.out.println("Your account balance is:"+bal);
            }
    }
    public void CheckBalance()
    {
            System.out.println("Enter Your Name : ");
            name=sc.next();
            System.out.println("Enter Your A/c No : ");
            account=sc.nextInt();
            System.out.println("Your account balance is:"+bal);

            
    }
}
