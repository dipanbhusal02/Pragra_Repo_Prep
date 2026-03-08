package selfPtactice.array.OneDArray;

import java.util.Scanner;

public class FirstSecondandThirdLargest {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to check?");
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please Enter number " + (i + 1));
            numbers[i] = sc.nextInt();
        }
        for (int j = 0; j<numbers.length; j++){
            if (numbers[j]>largest){
                thirdLargest= secondLargest;
                secondLargest =  largest;
                largest = numbers[j];
            }else if (numbers[j]!=largest && numbers[j]>secondLargest){
                thirdLargest = secondLargest;
                secondLargest= numbers[j];
            }else if (numbers[j]!= secondLargest && numbers[j]>thirdLargest){
                thirdLargest = numbers[j];
            }
        }
        System.out.println("\nThe largest value in the array is; "+largest);
        System.out.println("\nThe second largest value in the array is:" +secondLargest);
        System.out.println("\nThe third largest value in the arrya is; "+thirdLargest);

    }
}
