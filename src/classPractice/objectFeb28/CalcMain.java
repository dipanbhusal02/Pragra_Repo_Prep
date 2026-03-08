package classPractice.objectFeb28;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        Calculator calculator = new Calculator();
        calculator.sum(a, b);
        calculator.sub(a, b);
    }
}
