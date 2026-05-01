package pragraClass.April8CollectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        list.add(500);
        list.add(100);
        list.add(500);
        list.add(300);
        list.add(400);
        list.add(200);
        list.add(100);


        Set<Integer> num = new HashSet<>(list);

        System.out.println(num);
    }
}
