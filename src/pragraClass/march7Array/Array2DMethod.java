package classPractice.march7Array;

import java.util.Scanner;

public class Array2DMethod {

    int[][] array;
    Scanner sc = new Scanner(System.in);

    public Array2DMethod() {

    }

    public void InitializeArray(int row, int column) {
        this.array = new int[row][column];
    }

    public void GetArrayFromUser() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Please enter the value at index " + i + " " + j);
                array[i][j] = sc.nextInt();
            }
        }
    }

    public void displayArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
    }

    public void checkSaddlePoint() {
        boolean found = false;

        for (int i = 0; i < array.length; i++) {

            // Step 1: Find minimum in current row
            int min = array[i][0];
            int colIndex = 0;

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if it is largest in its column
            boolean isSaddle = true;

            for (int k = 0; k < array.length; k++) {
                if (array[k][colIndex] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point: " + min);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }

    public void transpose() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j > i) {
                    int initial = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = initial;
                }
            }
        }
    }

    public void reverseRow() {
        for (int i = 0 ; i<array.length ; i++){
            for(int j=0; j<array[i].length; j++){
                int last = array[i].length-1;
                int first = 0;
                while(last>first){
                    int ass = array[i][first];
                    array[i][first]= array[i][last];
                    array[i][last]=ass;
                    last--;
                    first++;
                }
            }
        }
    }
}
