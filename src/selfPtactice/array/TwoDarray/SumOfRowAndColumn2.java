package selfPtactice.array.TwoDarray;

import java.util.Scanner;

public class SumOfRowAndColumn2 {
    public static void main(String[] args) {
        int totalsumOfRow = 0;
        int totalSumOfColumn = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Please enter the number of column: ");
        int column = sc.nextInt();
        int [][]array = new int[row][column];
        for (int i = 0 ; i< array.length; i++){
            int sumRow = 0;
            for (int j= 0; j< column; j++){
                System.out.println("Enter the value at " + "["+ i+"]"+"["+ j+"]");
                array[i][j]= sc.nextInt();
                sumRow += array[i][j];
            }
            System.out.println("\nThe sum of row "+ (i+1) +" is: "+ sumRow);
            totalsumOfRow +=sumRow;
        }
        for(int j = 0; j<column; j++){
            int sumRow = 0;
            int sumColumn = 0;
            for (int i = 0; i<row; i++ ){
                sumColumn += array[i][j];
            }
            System.out.println("\n\nThe sum of column"+ (j+1) +" is: "+ sumColumn);
            totalSumOfColumn += sumColumn;
        }
        System.out.println("\nThe total sum of all the rows is: " + totalsumOfRow);
        System.out.println("\nThe total sum of all the columns is: " + totalSumOfColumn);

    }
}
