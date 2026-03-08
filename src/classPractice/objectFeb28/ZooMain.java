package classPractice.objectFeb28;

public class ZooMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Panda";
        animal.colour = "Red";
        animal.legs = 4;

        animal.walk();
        animal.run();
        animal.canRunFast(4);
    }
}
