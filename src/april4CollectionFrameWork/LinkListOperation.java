package april4CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListOperation {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println(linkedList.hashCode());

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
