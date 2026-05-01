package pragraClass;

import pragraClass.march31.Student;

import java.util.ArrayList;
import java.util.List;

public class april4CollectionFrameWork {
    public static void main(String[] args) {
        Student student = new Student(999,"dipan");
        Student student1 = new Student(555, "Ishan");
        List<String> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//
//        list.addFirst(5);
//        list.add(4, 35);

        list.add("Canada");
        list.add("Japan");
        list.add("USA");
        list.add("India");
        list.add("Korea");


     /*   list.add(student);
        list.add(student1);*/
        System.out.println(list.size());
        System.out.println(list);




    }
}
