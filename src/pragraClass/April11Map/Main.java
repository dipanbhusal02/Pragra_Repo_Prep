package pragraClass.April11Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(333, "Ishan");
        students.put(444, "Dipan");
        students.put(666, "Pradeep");
        students.put(777, "Ram");
        students.put(999, "Hari");

        System.out.println(students);

        Set<Integer> integers = students.keySet();
        System.out.println(integers);

        Collection<String> values = students.values();
        System.out.println(values);

        students.remove(777);

        System.out.println(values);
        System.out.println(integers);




    }
}
