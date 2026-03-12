package selfPtactice.array.TwoDarray;

import java.util.Scanner;

public class Rotate90DClockWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Please enter the nubmer of column:");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the value of " + i + j);
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]);
                System.out.print("  ");
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j > i) {
                    int initial = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = initial;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            int last = column - 1;
            int first = 0;
            while (last > first) {
                int ass = array[i][first];
                array[i][first] = array[i][last];
                array[i][last] = ass;
                last--;
                first++;
            }

        }


        System.out.println("\n\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]);
                System.out.print("    ");

            }
        }
    }
}
