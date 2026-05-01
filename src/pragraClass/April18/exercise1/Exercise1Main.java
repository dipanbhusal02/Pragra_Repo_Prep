package pragraClass.April18.exercise1;

import java.util.*;
import java.util.function.*;

public class Exercise1Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        List<Employee> employees = List.of(
                new Employee("Alice Johnson", "SENIOR_DEV", "ENGINEERING", 85000),
                new Employee("Bob Martin", "HR_MANAGER", "HR", 60000),
                new Employee("David Lee", "LEAD_DEV", "ENGINEERING", 95000),
                new Employee("Sarah Kim", "PM", "PRODUCT", 75000),
                new Employee("Emma Davis", "RECRUITER", "HR", 52000)
        );

        // ─── TASK 1: Filter employees earning > 70,000 ───────────────────
        System.out.println("--- Task 1: High Earners ---");
        Predicate<Employee> condition = employee -> employee.getSalary() > 70000;
        List<Employee> highEarners = service.filterEmployees(employees, condition);

        highEarners.forEach(System.out::println);

        // ─── TASK 2: Print each as "[DEPT] Name - Role" ──────────────────
        System.out.println("\n--- Task 2: Print All Employees ---");
        Consumer<Employee> consumer = employee -> {
            System.out.println("[" + employee.getDepartment() + "] " + employee.getName() + "= " + employee.getRole());
        };
        service.processEach(employees, consumer);


        // ─── TASK 3: Transform Alice into a summary String ───────────────
        System.out.println("\n--- Task 3: Summary of Alice ---");
        Employee alice = employees.get(0);
        Function<Employee, String> mapper = employee ->
            employee.getName() + " ("+ employee.getDepartment()+") | Salary: " +employee.getSalary();

        String summary = service.transform(alice, mapper);

        System.out.println(summary);

        // ─── TASK 4: Create a default employee via Supplier ──────────────
        System.out.println("\n--- Task 4: Default Employee ---");

        Employee newHire = service.createDefault( () -> new Employee("New Hire", "Intern", "General",25000.0));
                /* YOUR SUPPLIER LAMBDA HERE */

        System.out.println("Name: " + newHire.getName()
                + " | Role: " + newHire.getRole()
                + " | Salary: " + newHire.getSalary());

        // ─── TASK 5: Calculate 15% bonus for David ───────────────────────
        System.out.println("\n--- Task 5: Bonus for David (15%) ---");
        Employee david = employees.get(2);
        double bonus = service.calculateBonus(david, 15.0, (e,p)-> e.getSalary()*p/100);

        System.out.println("Bonus = " + bonus);

        // ─── TASK 6: Is Alice within salary range 0-100000? ─────────────
        System.out.println("\n--- Task 6: Is Alice's salary within 100000? ---");
        boolean inRange = service.isInRange(alice, 100000.0, (e,s)->e.getSalary()<s && e.getSalary()>0);
                /* YOUR BIPREDICATE LAMBDA HERE */

        System.out.println(inRange);

        // ─── TASK 7 (BONUS): Chain Predicates ────────────────────────────
        System.out.println("\n--- Task 7 (BONUS): Engineering + 60k+ ---");
        Predicate<Employee> dep = e-> e.getDepartment().equalsIgnoreCase("Engineering");
        Predicate<Employee> sal = e-> e.getSalary()>60000;
       List<Employee> filteredEmployees =service.filterEmployees(employees, dep.and(sal));

        for( Employee employee: filteredEmployees){
            System.out.println(employee);
        }
        /* Create two separate Predicates, combine with .and(), pass to filterEmployees */
        System.out.println("Self Practice:  ");
        Predicate<Employee> con = employee -> employee.getSalary()>55000;
        System.out.println(service.filterEmployees(employees, con));

    }
}