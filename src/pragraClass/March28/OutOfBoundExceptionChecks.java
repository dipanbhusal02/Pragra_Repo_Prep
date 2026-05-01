package pragraClass.March28;

public class OutOfBoundExceptionChecks {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};

        for(int i=0; i<array.length+1;i++ ) {
           try{ System.out.println(array[i]);}
           catch (ArrayIndexOutOfBoundsException out){
               System.out.println("Out of Bound");
           }
        }


    }


}
