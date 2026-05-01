package selfPtactice.functionalInterfaces.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainPracticeFunctionalInterface {
    public static void main(String[] args) {
        ProductSystem productSystem = new ProductSystem();

        Product p1 = new Product("Phone", 800);
        Product p2 = new Product("Mouse", 200);

        List<Product> products = Arrays.asList(
                new Product("Phone", 800),
                new Product("Pen", 50),
                new Product("Laptop", 1200),
                new Product("Paper", 10)
        );

        //Predicate----------
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.test(10));

        Predicate<Product> isExpensive = (p) -> p.getPrice() > 500;
        System.out.println(isExpensive.test(p1));
        System.out.println(isExpensive.test(p2));

        // System.out.println(productSystem.filterProduce(products, (product -> product.getPrice() > 100 && product.getPrice() < 1000)));

        //Create multiple reusable conditions and combine them.

        Predicate<Product> con1 = (p) -> p.getPrice() > 500;
        Predicate<Product> con2 = (p) -> p.getPrice() < 1000;
        Predicate<Product> con3 = (p) -> p.getName().startsWith("L");

        System.out.println(productSystem.filterProduce(products, con1.and(con3)));
        System.out.println(productSystem.filterProduce(products, con1.or(con3)));
     //   products.removeIf(con1);
        System.out.println("-------- " + products);

        // Function______________________

        Function<String, Integer> length = (s -> s.length());

        System.out.println(length.apply("Hello"));

        //Convert a Product into a formatted String

        Function<Product, String> lable = (product -> "Product: " + product.getName() + ", Price: " + product.getPrice());

        System.out.println(lable.apply(p1));


        // Consutmer______________________
        Consumer<Product> display = (p) -> {
            System.out.println("Product: " + p.getName() + "\nPrice: " + p.getPrice());
        };

        display.accept(p1);


        //Supplier
        Supplier<String> print = () -> "Hello";

        // All together


        Supplier<List<Product>> prodSupplied = () -> Arrays.asList(
                new Product("Phone", 800),
                new Product("Pen", 50),
                new Product("Laptop", 1200),
                new Product("Paper", 10)
        );

        Predicate<Product> filter = (product -> product.getPrice() < 500);
        Function<Product, String> formatter = (Product::getName);
        Consumer<String> Printer = System.out::println;

        List<Product> pro = prodSupplied.get();

        for (Product prod : pro) {
            if (filter.test(prod)) {
                Printer.accept(formatter.apply(prod));
            }
        }





        //stream

    }

}
