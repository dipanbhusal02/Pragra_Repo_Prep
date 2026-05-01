package pragraClass.april25.StreamClass;

import java.util.List;

enum DishType {
    VEG, NON_VEG, VEGAN
}


public class Dish {
    private String name;
    private double cost;
    private DishType type;
    private List<String> ingredients;
    private double calries;

    public Dish(String name, double cost, DishType type, List<String> ingredients, double calries) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.ingredients = ingredients;
        this.calries = calries;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public DishType getType() {
        return type;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public double getCalries() {
        return calries;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", type=" + type +
                ", ingredients=" + ingredients +
                ", calries=" + calries +
                '}';
    }
}
