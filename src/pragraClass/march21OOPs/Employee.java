package pragraClass.march21OOPs;

public class Employee extends Person{
    int empId;
    int totalHours=40;
    double salary;
    String field;

    public void canWorkFullTime(){
        System.out.println("Can work full time");
    }
    public void workHours(){
        System.out.println("Can work "+ totalHours+ " hours in total");
    }

}
