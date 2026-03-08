package selfPtactice.array.TwoDarray;

import java.util.Scanner;

public class SaddlePointFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int column = sc.nextInt();

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter value at [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < row; i++) {

            // Step 1: Find minimum in current row
            int min = array[i][0];
            int colIndex = 0;

            for (int j = 1; j < column; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if it is largest in its column
            boolean isSaddle = true;

            for (int k = 0; k < row; k++) {
                if (array[k][colIndex] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("\nSaddle Point: " + min);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }
}