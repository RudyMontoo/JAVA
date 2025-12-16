package ESEOOPS.Problem3;

import java.util.Scanner;

import static java.lang.System.exit;

public class ATM {
    public static void main(String[] args) throws InsuffientBalanceException {
        Scanner sc=new Scanner(System.in);
        BankAccount p1=new BankAccount();
        System.out.println("Enter Your Task");
        System.out.println("1->deposit::2->withdrawl::3->Balance");
        while(true){
        int n=sc.nextInt();
        switch(n){
            case 1:System.out.println("Enter amt you want to deposit");
            int amt=sc.nextInt();
            p1.deposit(amt);

            break;
            case 2:System.out.println("Enter amt you want to withdrawl");
            int amt2=sc.nextInt();
            p1.withdraw(amt2);
            break;
            case 3:System.out.println("Balance"+"::");
            p1.balance();
            break;

            case 4:exit(0);
        }}
    }
}
