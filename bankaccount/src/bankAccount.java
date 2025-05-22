public class bankAccount {
   private int accountnumber;
   String accountHoldername;
   double balance;

   public bankAccount(int accountnumber, String accountHoldername, double balance){
       this.accountnumber=accountnumber;
       this.accountHoldername=accountHoldername;
       this.balance=balance;
   }

   public int getAccountnumber(){
       return accountnumber;
   }
   public void setAccountnumber(int accountnumber){
       this.accountnumber=accountnumber;
   }

   public void deposit(double amount){
       balance += amount;
       System.out.println("balance has been updated by "+ amount + " Rs");
   }

   public void withdraw(double amount){
       if(balance>amount){
           balance -= amount;
           System.out.println("balance of "+ amount + " Rs" + " has been withdrawn");
       }else{
           System.out.println("Insufficent funds in your account "+ accountHoldername);
       }
   }

   public void displayBalance(){
       System.out.println("Your balance is "+ balance+" Rs");
   }
}
