package selfPtactice.array.OneDArray;
//

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        int[] number = new int[5];

        int gratest = Integer.MIN_VALUE;
        int secGratest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number" + (i + 1));
            number[i] = sc.nextInt();

            if (number[i] > gratest) {
                secGratest = gratest;
                gratest = number[i];
            } else if (number[i] != gratest && number[i] > secGratest) {
                secGratest = number[i];
            }
        }
        System.out.println("The gratest number is " + gratest);
        if (secGratest == Integer.MIN_VALUE) {
            System.out.println("\nThere is no second Largest value ");
        } else {

            System.out.println("\nThe second gratest number is " + secGratest);
        }
    }
}
