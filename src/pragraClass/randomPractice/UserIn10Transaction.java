package pragraClass.randomPractice;

import java.util.Scanner;

public class UserIn10Transaction {
    public static void main(String[] args) {
        int totalTransaction = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the amount of transaction: " + i);
            Scanner input = new Scanner(System.in);

            int transactionAmount = input.nextInt();
            if (transactionAmount > 0) {
                totalTransaction = totalTransaction + transactionAmount;
            } else if (transactionAmount == 0) {
                System.out.println("Transaction amount is zero, skipping transaction");

                continue;

            } else {
                System.out.println("Invalid amount");

                break;
            }

        }
        System.out.println("Total transaction amount is: " + totalTransaction);

    }
}
