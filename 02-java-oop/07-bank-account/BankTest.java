public class BankTest {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        BankAccount acct2 = new BankAccount();
        bank.deposit("Checking", 100);
        bank.deposit("Savings", 200);
        acct2.deposit("Savings", 200);
        acct2.deposit("gggg", 20);
        acct2.withdraw("Savings", 10);
        System.out.println("Bank total: " + BankAccount.accountsTotal);
        System.out.println("Number of accounts at bank: " + BankAccount.numberOf);
        System.out.println("Total in all your accounts is equal to : " + bank.checkingPlusSavings());
        System.out.println(bank.getAccountNumber());
    }
}
