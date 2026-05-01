package april4CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();


        employees.add(new Employee(1111, "Ishan", 50000));
        employees.add(new Employee(2222, "Dipan", 60000));
        employees.add(new Employee(3333, "Sam", 75000));
        employees.add(new Employee(4444, "Pat", 60000));
        double highestSalary=employees.get(0).getEmpSalary();

        for(int i=0; i<employees.size(); i++){

            if(employees.get(i).getEmpSalary()>highestSalary){
                highestSalary = employees.get(i).getEmpSalary();
            }
        }

        System.out.println(highestSalary);

       /* Iterator<Employee> employeeIterator = employees.iterator();

        while (employeeIterator.hasNext() ){
            employees.get()
        }*/
    }
}
