package selfPtactice.Random;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Please enter the number to check Palindrome");
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        int in = initial;
        int reverse = 0;
        while (initial != 0) {
            reverse = reverse * 10 + initial % 10;
            initial = initial / 10;
        }
        if (reverse == in) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }

    }
}
