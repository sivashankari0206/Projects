package Projects.Day3;

import java.util.Scanner;

public class ATMSimulator {
    double balance=5000;
    void checkBalance(){
        System.out.println("Current Balance : "+balance);
    }
    void deposit(double amount){
        if (amount<=0){
            System.out.println("Invalid Deposit Amount");
        }else {
            balance+=amount;
            System.out.println("Deposit Successful");
        }

    }
     void withdraw (double amount){
        if (amount<=0 ){
            System.out.println("Invalid Withdrawal Amount");

        }else if(amount>balance){
            System.out.println("Insufficient Balance");
        }else {
            balance-=amount;
            System.out.println("Withdrawal Successful");

        }

     }

     void showMenu(int choice){
        switch (choice){
            case 1->checkBalance();
            case 2->deposit(1000);
            case 3->withdraw(500);
            default -> System.out.println("Invalid Choice");
        }
     }
     void runATM(){
         Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter choice : ");

            byte choice=sc.nextByte();
            if (choice==1){
                checkBalance();
            } else if (choice==2) {
                System.out.print("Enter the deposit amount: ");
                double amount=sc.nextDouble();
                deposit(amount);
            } else if (choice==3) {
                System.out.print("Enter the withdraw amount : ");
                double amount=sc.nextDouble();
                withdraw(amount);
            }
            else if (choice==4){
                System.out.println("Thank you for using ATM");
                break;
            }else {
                System.out.println("Invalid Choice");
            }

        }
     }
    public static void main(String[] args) {
        ATMSimulator a=new ATMSimulator();


        a.runATM();
    }
}
