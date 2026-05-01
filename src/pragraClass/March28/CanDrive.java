package pragraClass.March28;

public class CanDrive {
    int age;

    public CanDrive(int age) {
        this.age = age;
    }

    void canDrive(){
        if(age<18){
            throw new NotOfLegalAge("You are under 18!! Stop!");
        }
        System.out.println("You can Drive");
    }
}
