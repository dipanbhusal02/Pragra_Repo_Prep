package selfPtactice.functionalInterfaces.StreamCore;

enum Category {
    ELECTRONICS,
    GROCERY,
    CLOTHING,
    SPORTS
}

class Item {

    private String name;
    private double price;
    private int quantity;
    private boolean available;
    private Category category;

    public Item(String name, double price, int quantity, boolean available, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.available = available;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " | " + price + " | " + quantity + " | " + available + " | " + category;
    }
}