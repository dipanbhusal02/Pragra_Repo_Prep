package pragraClass.objectFeb28;

public class Animal {
    String name;
    String colour;
    int legs;

    void walk() {
        System.out.println("This animal can walk" + " and the colour of the animal is: " + colour);
    }

    void run() {
        System.out.println("This animal can run" + " and it has " + legs + " legs");
    }

    void sleep() {
        System.out.println("This animal can sleep");
    }

    void canRunFast(int leg){
        if(leg>=4){
            System.out.println("This animal is fast");
        }
        else {
            System.out.println("This animal is slow");
        }

    }
}
