package selfPtactice.Random;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if (a == 0) {
            System.out.println(a + " is zero");
        } else if (a>=0)  {
            System.out.println(a + " is positive ");
        } else {
            System.out.println(a + " is negative");
        }


    }
}
