package selfPtactice.Random;

import java.util.Scanner;

public class MiniBank {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank of Canada");
        int balance = 1500;
        int exit;
        String name = "Dipan Bhusal";
        do {
            System.out.println("Please choose from the given options: \n 1. Check Balance \n 2. Deposit \n 3.Withdraw");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
//            switch (opt) {
//                case 1 -> {
//                    System.out.println("HI! " + name + " your current balance is " + balance);
//                }
//                case 2 -> {
//                    System.out.println("Please enter the deposit anount ");
//                    balance += sc.nextInt();
//                    System.out.println("Your new balance is: " + balance);
//                }
//                case 3 -> {
//                    System.out.println("Please Enter the amount you want to withdraw");
//                    balance -= sc.nextInt();
//                    System.out.println("The new balance is: " + balance);
//
//                }
//            }
            System.out.println("If you like to continue press 0 else press random number");
             exit = sc.nextInt();


        }while (exit == 0) ;

    }
}
