package selfPtactice.array.TwoDarray;

import java.util.Scanner;

public class SumOfRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSumOfRow = 0;
        int sofOfColumn = 0;
        System.out.println("Hi welcome! we will create array and display it.");
        System.out.println("Please Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Please Enter the number of column: ");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            int sumofRow = 0;
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Please enter value for position:" + "[" + i + "]" + "[" + j + "]");
                array[i][j] = sc.nextInt();
                sumofRow +=array[i][j];
            }
            System.out.println("The sum of row "+(i+1)+":  "+ sumofRow);
            totalSumOfRow += sumofRow;
        }
        System.out.println("\nThe total sum of rows is: " + totalSumOfRow);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();

        }
    }
}
