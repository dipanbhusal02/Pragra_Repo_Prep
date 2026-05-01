package pragraClass.march14String;

public class CheckifEqual {
    public static void main(String[] args) {
        String a = "Pragra";
        String b = "PRAGRA";

        System.out.println("Same Length?       "+ (a.length()==b.length()));
        System.out.println("Ignore case?       "+ (a.equalsIgnoreCase(b)));
    }
}
