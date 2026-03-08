package selfPtactice.Random;
import java.util.Scanner;
public class PrintPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter a number ");
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        int num = 2;
        while (initial > 1) {
            if (initial % num == 0) {
                initial = initial / num;
                System.out.println(num);
            }
            else {
                num++;
            }
        }
    }
}




