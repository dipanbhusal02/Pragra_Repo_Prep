package pragraClass.April8CollectionSet;

import java.util.Objects;

public class Employee {
    String name;
    String Dep;
    Double salary;

    public Employee(Double salary, String dep, String name) {
        this.salary = salary;
        Dep = dep;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Dep='" + Dep + '\'' +
                ", salary=" + salary +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(Dep, employee.Dep) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
