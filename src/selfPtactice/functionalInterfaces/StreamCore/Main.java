package selfPtactice.functionalInterfaces.StreamCore;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Item> items = ItemSupplier.getItems().get();


        // get available items
        List<String> collect = items.stream()
                .filter(Item::isAvailable)
                .map(Item::getName).toList();
        System.out.println(collect);


        // get all the name sorted by ascending order

        List<String> sorted = items.stream()
                .sorted(Comparator.comparing(Item::getPrice))
                .map(Item::getName)
                .toList();
        System.out.println(sorted);

        // Total Quantity of all the items
        int sum = items.stream()
                .mapToInt(Item::getQuantity)
                .sum();

        System.out.println(sum);


        // Most expensive Item

        String first = items.stream()
                .sorted(Comparator.comparing(Item::getPrice).reversed())
                .toList()
                .getFirst()
                .getName();
        System.out.println(first);


        // Group them by catogery and how many items in that catogery

        Map<Category, Long> collect1 = items.stream()
                .collect(Collectors.groupingBy(Item::getCategory, Collectors.counting()));

        System.out.println(collect1);


        // Get name of the item whose price is greater than 100 and are available

        List<String> list = items.stream()
                .filter(Item::isAvailable)
                .filter(i -> (i.getPrice() > 100))
                .map(Item::getName)
                .toList();
        System.out.println(list);


        // Second most expensive Item

        String item = items.stream()
                .sorted(Comparator.comparing(Item::getPrice).reversed())
                .toList()
                .get(1)
                .getName();
        System.out.println(item);


        // Get average of all the available items


        OptionalDouble average = items.stream()
                .filter(Item::isAvailable)
                .mapToDouble(Item::getPrice)
                .average();
        System.out.println(average);


        // Get all item names as one single flat string list after duplicating each name once.
        List<String> list1 = items.stream()
                .flatMap(item1 -> Stream.of(item1.getName(), item1.getName()))
                .toList();
        System.out.println(list1);


        //From available items, get a Map<Category, List<String>> of item names where price > 50,
        // and sort each list by price ascending.

        Map<Category, List<String>> collect2 = items.stream()
                .filter(i -> i.getPrice() > 50)
                .collect(Collectors.groupingBy(Item::getCategory,
                        Collectors.collectingAndThen(Collectors.toList(), l ->
                                l.stream().sorted(Comparator.comparing(Item::getPrice))
                                        .map(Item::getName).toList())));

        System.out.println(collect2);


        //Top 2 most expensive items in each category (by price descending)

        Map<Category, List<String>> collect3 = items.stream()
                .collect(Collectors.groupingBy(Item::getCategory
                        , Collectors.collectingAndThen(Collectors.toList(),
                                l1 -> l1.stream()
                                        .sorted(Comparator.comparing(Item::getPrice).reversed())
                                        .limit(2)
                                        .map(Item::getName)
                                        .toList()
                        )
                ));
        System.out.println(collect3);



       /* Find the category with the highest total value.

        Rule:

        Total value of an item =
                price × quantity
        */

        Map<Category, Double> collect4 = items.stream().
                collect(Collectors.groupingBy(Item::getCategory,
                        Collectors.collectingAndThen(Collectors.toList(),
                                lis -> lis.stream()
                                        .mapToDouble(i -> i.getPrice() * i.getQuantity())
                                        .sum())
                ));




    }


}