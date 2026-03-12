package pragraClass.march3Array;

import java.util.Arrays;

public class MinorMax {
    public static void main(String[] args) {
        int [] array = {232,453,576,2,23,75};
        int sum = 0;
        int max= 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
            if(array[i]>max) {
                max = array[i];
            }
            if(array[i]%2 ==0){
                System.out.println(array[i] + " is even");
            }
            else{
                System.out.println(array[i] + " is odd");
            }
        }
        for(int i= 0; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }

        }
        System.out.println("\n\nThe max value is: "+max);
        System.out.println("The min value is: "+min);
        Arrays.sort(array);
        int start = 0;
        int last = array.length - 1;
        while (start < last) {
            int temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;
        }
        System.out.println();
        System.out.println("\n\nThe descinding order is: ");
        for (int eli : array) {
            System.out.print(eli+" ");
        }
        System.out.println("\n\nThe sum is: "+ sum);

    }

}
