package ESEOOPS.Problem3;

public class BankAccount {
    static double  balance=25000;
    BankAccount(){
        this.balance=balance;
    }
    public void deposit(int amt){
        if(amt>0){
        balance+=amt;
        System.out.println("BALANCE INSERTED");}
        else{
            System.out.println("INVALID BALANCE");
        }
    }
    public void withdraw(int amt) throws InsuffientBalanceException{
      if(balance>=amt){
          balance-=amt;
          System.out.println("BALANCE WITHDRAWN");
      }
      else{
          throw new InsuffientBalanceException("INSUFFICIENT BALANCE");
      }
    }
    public void balance(){
        System.out.println("BALANCE INIT->"+balance);
    }
}
