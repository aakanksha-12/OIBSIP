import java.util.Scanner;

class atmInterface
{
    public static void main(String[] args)
    {
        int balance=7000000;
        int withdraw,deposit;
        int atmpin=1234;

        Scanner sc = new Scanner(System.in);

            System.out.println("------ATM INTERFACE------");
            System.out.println("---------WELCOME--------");
            System.out.println("INSERT THE ATM CARD");
            System.out.println("Please cover the keypad while entering the pin");
            System.out.println("Enter ATM Number");
            int no = sc.nextInt();
            
            if (no==atmpin)
            while(true)
            {
            {
                System.out.println("Select option 1 to Check The Balance");
                System.out.println("Select option 2 to Withdraw");
                System.out.println("Select option 3 to Deposit The Cash ");
                System.out.println("Select option 4 to Transfer");
                System.out.println("Select option 5 to Quit");
                System.out.println("Select the option you want");

            int select=sc.nextInt();
            switch(select)
            {
                case 1:

                    System.out.println("Current Balance in your account is: "+balance);
                    break;
                case 2:
                
                System.out.println("Enter the amount to withdraw");
                 withdraw = sc.nextInt();

                if(balance>=withdraw)
                {
                    balance= balance - withdraw;

                    System.out.println("Please collect the cash");
                }
                else
                {
                    System.out.println("Sorry..Your account doesn't have sufficient amount to withdraw");

                }
                break;

                case 3:
                
                System.out.println("Enter the amount to be deposited in your account");

                deposit = sc.nextInt();

                balance= balance + deposit;
                System.out.println("Your account has been successfully deposited in your account");
                break;

                case 4:
                
                System.out.println("Please enter the amount you want to transfer: ");
                int amount = sc.nextInt();

                if(amount > balance)
                    System.out.println("Sorry. The Balance is insufficient in your account");
                else
                {
                    System.out.println("The amount has been transferred successfully");
                    balance = balance - amount;
                }
                break;

                case 5:
                
                System.out.println("Please collect the card");
                System.out.println("---------THANK YOU---------");
                System.out.println("-------VISIT AGAIN--------");
                break;

                default:
                {
                System.out.println("Please select the correct option... ");
                }
        }
            }
                }
        else 
        {
            System.out.println("Please enter the correct atm pin");
        }
    }

}