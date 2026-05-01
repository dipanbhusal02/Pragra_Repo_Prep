package april4CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JoinTwoList {
    public static void main(String[] args) {
        List<String> country = new ArrayList<>();
        country.add("India");
        country.add("China");
        country.add("Korea");
        country.add("Japan");
        country.add("Indonasia");


        List<String> cities = new ArrayList<>();
        cities.add("Toronto");
        cities.add("New York");
        cities.add("Oshawa");

        Iterator<String> iterator = country.iterator();
            iterator.next();
        while (iterator.hasNext()){
            if(iterator.next().equals("China")){
                iterator.remove();
            }
            System.out.println(iterator.next());
        }

        country.removeIf(con -> con.startsWith("I"));

       /* for( int i= 0; i<country.size();i++){
            if(country.get(i).equals("Korea")){
                country.remove("Korea");
            }
        }*/

        /*country.addAll(1, cities);*/
        System.out.println(country);



    }
}
