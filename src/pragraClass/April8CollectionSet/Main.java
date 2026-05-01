package pragraClass.April8CollectionSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(20000.0, "p12", "Isha"));
        employees.add(new Employee(30000.0, "c12", "Dipan"));
        employees.add(new Employee(15000.0, "t12", "Sam"));
        employees.add(new Employee(15000.0, "t12", "Sam"));
        employees.add(new Employee(40000.0, "y12", "Did"));
        employees.add(new Employee(50000.0, "v12", "Dipan"));
        employees.add(new Employee(150000.0, "t12", "Sam"));


        Set<Employee> employeeSet = new HashSet<>(employees);
        System.out.println(employeeSet);

    }
}
