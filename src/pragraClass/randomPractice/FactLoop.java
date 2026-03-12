package classPractice.randomPractice;
import java.util.Scanner;
public class FactLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to find the factorial of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = n;

        for (int i = n-1; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("The factorial of "+n+" is: "+fact);

    }
}
