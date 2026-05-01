package pragraClass.march21OOPs;

public class Manager extends Employee{
    int managerID;
     int totalHours;
    public void getManagerID(){
        this.totalHours= 30;
        System.out.println("This is the manager");
    }
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

}
