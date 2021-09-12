import java.util.Random;




public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    public static int numberOf;
    public static double accountsTotal;

    public BankAccount (){
        numberOf ++;
        this.accountNumber = random();
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
        
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void deposit(String type, double amt){
        if (type.equals("Checking")){
            this.checkingBalance += amt;
            System.out.println("You deposited: " + amt + " into your checking, your new balance is: " + getCheckingBalance());
            accountsTotal += amt;
        }else if (type.equals("Savings")){
            this.savingsBalance += amt;
            accountsTotal += amt;
            System.out.println("You deposited: " + amt + " into your savings, your new balance is: " + getSavingsBalance());

        }else{
            System.out.println("Please enter Checking or Savings");
            return;
        }
    }

    public void withdraw(String type, double amt){
        if (type.equals("Checking")){
            if (this.checkingBalance >= amt){
                this.checkingBalance -= amt;
                accountsTotal -= amt;
                System.out.println("You took out " + amt + " from your checking account, your new balance is: " + getCheckingBalance());
            }else{
                System.out.println("not enough funds");
                return;
            }
        }else if(type.equals("Savings")){
            if (this.savingsBalance >= amt){
                this.savingsBalance -= amt;
                accountsTotal -= amt;
                System.out.println("You took out " + amt + " from your savings account, your new balance is: " + getSavingsBalance());
            }else{
                System.out.println("not enough funds");
                return;
            }
        }else{
            System.out.println("Please enter Checking or Savings");
            return;
        }
    }

    public double checkingPlusSavings(){
        return this.checkingBalance + this.savingsBalance;
    }

    private String random(){
        Random random = new Random();
        
            String accountNumber= "";
            for (int i = 0; i <10; i++){
                accountNumber = accountNumber + random.nextInt(9);
            }
            return accountNumber; 
    }
}