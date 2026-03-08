package selfPtactice.Random;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Please enter an number ");
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        int fib = 1;
        int j1 = 0;
        int j2 = 1;
        while (initial > fib) {
            fib = (j1 + j2);
            j1 = j2;
            j2 = fib;
        }
        if (fib == initial) {
            System.out.println("The number is Fabonacci");
        } else {
            System.out.println("The number is not Fabonacci");
        }

    }
}
