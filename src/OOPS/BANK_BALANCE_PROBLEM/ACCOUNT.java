package OOPS.BANK_BALANCE_PROBLEM;

public class data_hiding {
    int balance=0;
    int amt=0;

    public data_hiding(){
        this.balance=0;
        this.amt=0;
    }
    public data_hiding(int amt){
        this.balance+=amt;
        this.amt=amt;
    }
    void displaybalance(){
        System.out.println("Your balance is "+balance);
    }
    void withdraw(int amt){
        if(amt>0 && amt<this.balance){
            this.balance-=amt;
            System.out.println("Your available balance is "+this.balance);
        }
    }
    void deposit(int amt){
        if(amt>0){
            this.balance+=amt;
            System.out.println("Your available balance is "+this.balance);
        }
    }

}
