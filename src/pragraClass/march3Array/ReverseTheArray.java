package pragraClass.march3Array;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int last = array.length - 1;
        while (start < last) {
            int temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;
        }
        for (int eli : array) {
            System.out.print(eli+" ");
        }
    }
}
