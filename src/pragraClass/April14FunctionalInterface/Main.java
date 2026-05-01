package pragraClass.April14FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        ICalculator calc = (int a, int b) -> a+b;

        System.out.println(calc.add(15, 15));
    }
}
