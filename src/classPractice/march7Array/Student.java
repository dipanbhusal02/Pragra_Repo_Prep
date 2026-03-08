package classPractice.march7Array;

public class Student {
String name;
int age;
int rollnum;
String sub;
Student(){

}
    Student(String name, int age, int rollNum, String sub){
        this.name = name;
        this.age = age;
        this.rollnum = rollNum;
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollnum=" + rollnum +
                ", sub='" + sub + '\'' +
                '}';
    }
}

