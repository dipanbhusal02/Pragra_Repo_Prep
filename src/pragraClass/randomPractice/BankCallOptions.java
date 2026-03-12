package pragraClass.randomPractice;

import java.util.Scanner;

public class BankCallOptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont;

        int num;
        do {
            System.out.println("Welcome to Pragra");
            System.out.println("Please enter 1 for English\nPlease enter 2 for French");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Enter 1 for Savings\nEnter 2 for Current\nEnter 3 for Credit\nEnter 4 for Queries");
                    int opt1 = sc.nextInt();

                    switch (opt1) {
                        case 1:
                            System.out.println("You have selected Savings");
                            break;
                        case 2:
                            System.out.println("You have selected Current");
                            break;
                        case 3:
                            System.out.println("You have selected Credit");
                            break;
                        case 4:
                            System.out.println("You have selected Queries");
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                    break;

                case 2:
                    System.out.println("No service for French atm");
                    break;

                default:
                    System.out.println("Invalid option");
            }

            System.out.println("Enter 0 to continue or any other key to exit");
            num = sc.nextInt();

        }
        while (num == 0);

        System.out.println("Thank you!");
    }
}