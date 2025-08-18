package OOPS.BANK_BALANCE_PROBLEM;

public class ACCOUNT {
    private int balance=0;
    private int amt=0;

    public ACCOUNT(){
        this.balance=0;
        this.amt=0;
    }
    public ACCOUNT(int amt){
        this.balance+=amt;
        this.amt=amt;
    }
    public int getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("Your balance is " + balance);
    }

    public void withdraw(int amt){
        if(amt > 0 && amt <= this.balance){
            this.balance -= amt;
            System.out.println("Your available balance is " + this.balance);
        } else if(amt <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void deposit(int amt){
        if(amt>0){
            this.balance+=amt;
            System.out.println("Your available balance is "+this.balance);
        }
    }

}
