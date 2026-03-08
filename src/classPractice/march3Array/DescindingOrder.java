package classPractice.march3Array;

public class DescindingOrder {
    public static void main(String[] args) {
        int [] array = {23,45,423,6745,4,88,};
        for( int i = 0 ; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){

                if(array[i]<array[j]){
                    int ex = array[i];
                    array[i]= array[j];
                    array[j]=ex;

                }
            }
        }
        for (int eli:array){
            System.out.println(eli);
        }
    }
}
