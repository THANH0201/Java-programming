package Task1;

public class BankAccount {
    int accountNUmber;
    int balance;
    static int count = 0;

    public BankAccount(int balance) {
        this.balance = balance;
        this.accountNUmber = 0;
        count++;
    }
    public int getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNUmber;
    }
    public void setAccountNUmber(int accountNUmber) {
        this.accountNUmber = accountNUmber;
    }
    public int deposit(int amount) {
        return amount;
    }
    public int withdraw(int amount) {
        return amount;
    }
    public static int getTotalAccounts() {
        return count;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }
}
