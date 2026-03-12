package pragraClass.randomPractice;
import java.util.Scanner;
public class LicensedOrNot {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >=18) {
            System.out.println("You are eligible to drive  to drive");
        } else {
            System.out.println("You are not eligible to drive");
        }
    }
}
