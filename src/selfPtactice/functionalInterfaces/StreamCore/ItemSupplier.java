package selfPtactice.functionalInterfaces.StreamCore;

import java.util.List;
import java.util.function.Supplier;

public class ItemSupplier {
    public static Supplier<List<Item>> getItems() {
        return () ->  List.of(

                new Item("Laptop", 1200, 5, true, Category.ELECTRONICS),
                new Item("Headphones", 150, 12, false, Category.ELECTRONICS),
                new Item("Smartphone", 900, 10, true, Category.ELECTRONICS),
                new Item("Tablet", 600, 8, true, Category.ELECTRONICS),

                new Item("T-Shirt", 40, 20, true, Category.CLOTHING),
                new Item("Jacket", 90, 6, true, Category.CLOTHING),
                new Item("Jeans", 80, 15, true, Category.CLOTHING),
                new Item("Shoes", 120, 7, false, Category.CLOTHING),

                new Item("Rice Bag", 60, 15, false, Category.GROCERY),
                new Item("Wheat Flour", 55, 25, true, Category.GROCERY),
                new Item("Sugar", 45, 30, true, Category.GROCERY),
                new Item("Milk Pack", 25, 50, true, Category.GROCERY),

                new Item("Football", 30, 8, true, Category.SPORTS),
                new Item("Cricket Bat", 110, 4, true, Category.SPORTS),
                new Item("Tennis Racket", 140, 6, false, Category.SPORTS),
                new Item("Basketball", 50, 10, true, Category.SPORTS)


        );
    }
}
