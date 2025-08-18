package OOPS.BANK_BALANCE_PROBLEM;

public class main {
    public static void main(String[] args) {
        ACCOUNT user1 = new ACCOUNT(123);
        System.out.println("Initial balance: " + user1.getBalance());
        user1.withdraw(123);
        System.out.println("Balance after withdrawal: " + user1.getBalance());
        user1.displayBalance();

        user1.deposit(5000);
        user1.deposit(500);
        user1.displayBalance();
        System.out.println("Final balance: " + user1.getBalance());
    }
}