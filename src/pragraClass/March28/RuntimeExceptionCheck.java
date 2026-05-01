package pragraClass.March28;

public class RuntimeExceptionCheck {
    public static void main(String[] args) {
        int i = 10;
        try {
            i = i / 0;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("continue ");

    }


}
