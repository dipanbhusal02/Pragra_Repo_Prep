package pragraClass.april25.StreamClass;

import java.util.List;
import java.util.function.Supplier;

public class DishSupplier {
    public static Supplier<List<Dish>> getDishes(){
        return () ->{
           return List.of(
                   new Dish("Pizza", 8.99, DishType.VEG, List.of("cheese", "tomatoes"), 200),
                   new Dish("Chicken Sandwich", 14.99, DishType.NON_VEG, List.of("cheese", "tomatoes","chicken"), 800),
                   new Dish("Samosa", 0.99, DishType.VEG, List.of("potato", "peas","flour"), 300),
                   new Dish("Momos", 10.99, DishType.VEG, List.of("cabbage", "flour"), 450),
                   new Dish("Chicken Pizza", 16.99, DishType.NON_VEG, List.of("cheese", "tomatoes","chicken"), 100),
                   new Dish("Butter Chicken", 22.99, DishType.NON_VEG, List.of("chicken", "tomatoes","butter"), 500),
                   new Dish("Dosa", 6.99, DishType.VEG, List.of("rice", "tomatoes"), 1000),
                   new Dish("Burritos", 11.99, DishType.VEG, List.of("cheese", "tomatoes","rice"), 380),
                   new Dish("Ramen", 12.99, DishType.NON_VEG, List.of("noodles", "tomatoes","chicken"), 280)

                   );
        };

    }
}
