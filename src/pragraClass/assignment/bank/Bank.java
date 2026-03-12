package pragraClass.assignment.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int check;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let me know how many account you would like to create: ");
        int num = sc.nextInt();
        sc.nextLine();
        BankAccount[] accounts = new BankAccount[num];

        for (int i = 0; i < num; i++) {
            System.out.println("We are creating your account: " + (i + 1));
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Balance: ");
            int balance = sc.nextInt();
            sc.nextLine();
            accounts[i] = new BankAccount(name, balance);
        }
        System.out.println("You have successfully created these accounts:\n ");
        for (int i = 0; i < num; i++) {
            System.out.print(" Account " + (i + 1));
            accounts[i].display();
        }
        do {
            System.out.println("Choose the account to perform task: ");
            int account = sc.nextInt();
            System.out.println("1 for Withdraw \n2 for Deposit \n3 for Account Details");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the amount you want to withdraw: ");
                    int amount = sc.nextInt();
                    accounts[account - 1].withdraw(amount);
                    break;
                }
                case 2: {
                    System.out.println("Enter the amount you want to deposit: ");
                    int amount = sc.nextInt();
                    accounts[account - 1].deposit(amount);
                    break;
                }
                case 3: {
                    accounts[account - 1].display();
                    break;
                }
                default: {
                    System.out.println("Invalid Entry");
                }

            }
            System.out.println("Enter 0 if you want to continue else press any other number");
            check = sc.nextInt();
        }

        while (check == 0) ;

    }

}
