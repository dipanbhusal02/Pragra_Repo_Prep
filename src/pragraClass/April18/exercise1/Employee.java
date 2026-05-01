package pragraClass.April18.exercise1;

public class Employee {
        private String name;
        private String role;
        private String department;
        private double salary;

        public Employee(String name, String role, String department, double salary) {
            this.name       = name;
            this.role       = role;
            this.department = department;
            this.salary     = salary;
        }

        public String getName()       { return name; }
        public String getRole()       { return role; }
        public String getDepartment() { return department; }
        public double getSalary()     { return salary; }

        @Override
        public String toString() {
            return name + " | " + department + " | " + salary;
        }
    }
