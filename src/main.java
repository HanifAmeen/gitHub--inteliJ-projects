import java.util.ArrayList;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        ArrayList<bankAccount> accounts = new ArrayList<>();

        bankAccount b1 = new bankAccount(332233,"Quaid", 10000);
        bankAccount b2 = new bankAccount(4322323,"Lenny", 9000);
        bankAccount b3 = new bankAccount(652213,"Arthur", 100000);

        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);

        Scanner sc = new Scanner(System.in);
        boolean running = true;


        while (running){
            System.out.println("Welcome to Commercial Bank");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit to an account");
            System.out.println("3. withdraw from an account");
            System.out.println("4. Display Balance");
            System.out.println("5. display all accounts");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice ==1){
                System.out.println("Enter your account number");
                int accNum = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your name");
                String namee = sc.nextLine();
                System.out.println("Enter your current balance ");
                int newBalance = sc.nextInt();
                sc.nextLine();

                bankAccount newAccount = new bankAccount(accNum, namee,newBalance);
                accounts.add(newAccount);

            }

        if(choice==2){
            boolean found = false;
            System.out.println("Choose which account to use");
            String accountChoice = sc.nextLine();
            for(bankAccount a:accounts){
                if(a.accountHoldername.equalsIgnoreCase(accountChoice)){
                    System.out.println("Enter an amount to deposit: ");
                    double amount = sc.nextInt();
                    sc.nextLine();
                    a.deposit(amount);
                    found=true;
                    System.out.println("Press Enter to continue");
                    String enter = sc.nextLine();
                    break;
                }


            }
            if(!found){
                System.out.println("try again");
            }




        }
            if(choice==3){
                boolean found = false;
                System.out.println("Choose an account to withdraw from: ");
                String accountName = sc.nextLine();
                for(bankAccount a: accounts){
                    if(a.accountHoldername.equalsIgnoreCase(accountName)){
                        System.out.println("Enter the amount to withdraw: ");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        a.withdraw(amount);
                        found = true;
                        System.out.println("Press Enter to continue");
                        String enter = sc.nextLine();
                        break;

                    }
                }
                if(!found){
                    System.out.println("try again");
                }
            }
            if(choice ==4){
                boolean found = false;
                System.out.println("Enter who's balance you want to see: ");
                String accountName = sc.nextLine();
                for(bankAccount a:accounts){
                    if (a.accountHoldername.equalsIgnoreCase(accountName)) {
                        System.out.println("The balance is "+ a.balance);
                        found=true;
                        System.out.println("Press Enter to continue");
                        String enter = sc.nextLine();
                        break;
                    }
                }
                if(!found){
                    System.out.println("Account not found try again");
                }

            }
            if(choice ==5){
                for(bankAccount a: accounts){
                    System.out.println("Name: "+ a.accountHoldername + " Balance "+ a.balance);

                }
                System.out.println("Press Enter to continue");
                String enter = sc.nextLine();
            }

            if(choice ==6){
                System.out.println("Than you have a nice day'");
                running=false;
                break;
            }
        }


    }
}





