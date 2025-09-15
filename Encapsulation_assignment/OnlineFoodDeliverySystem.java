abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void getItemDetails() { System.out.println(itemName + " - " + price); }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.1; }

    @Override
    public String getDiscountDetails() { return "10% Discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return (getPrice() * getQuantity()) + 50; }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }

    @Override
    public String getDiscountDetails() { return "5% Discount"; }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer", 200, 2),
            new NonVegItem("Chicken", 300, 1)
        };

        for (FoodItem item : order) {
            double total = item.calculateTotalPrice();
            double discount = (item instanceof Discountable) ? ((Discountable)item).applyDiscount() : 0;
            System.out.println("Total Price after Discount: " + (total - discount));
        }
    }
}