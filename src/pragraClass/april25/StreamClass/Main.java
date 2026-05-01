package pragraClass.april25.StreamClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Dish> dishes = DishSupplier.getDishes().get();
        double sum = dishes.stream().mapToDouble(d -> d.getCost()).sum();
        System.out.println(sum+"");

        int size = dishes.stream().collect(Collectors.toList()).size();
        long size2 = dishes.stream().count();

        System.out.println(size);

        long veg = dishes.stream()
                .filter(p -> p.getType().name().equalsIgnoreCase("veg"))
                .count();
        System.out.println(veg);

        Map<DishType, Long> collect = dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));
        System.out.println(collect);

        long count = dishes.stream().filter(dish -> dish.getCalries() < 500).count();
        System.out.println(count);

        Map<DishType, String> collect1 = dishes.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors
                        .mapping(Dish::getName, Collectors
                                .joining(","))));
        System.out.println(collect1);

        Set<String> collect2 = dishes.stream().flatMap(d -> d.getIngredients().stream()).collect(Collectors.toSet());

        System.out.println(collect2);
        List<String> num= List.of("aX","bb","x");
        num.stream().forEach(b-> b.contains("x"));




    }
}



