package pragraClass.randomPractice;

import java.util.Scanner;

public class graterSmaller {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the gratest number");
        } else if (b > c) {
            System.out.println(b + " is the gratest number");
        } else {
            System.out.println(c + " is the gratest number");
        }
    }
}

