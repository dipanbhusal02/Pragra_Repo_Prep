package selfPtactice.Random;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        int reverse= 0;
        for (int i = 0; initial!=0; i++){
            reverse = reverse*10 + (initial%10);
            initial = initial/10;
        }
        System.out.println(reverse);

    }
}


