
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getname() { return name; }
    public int getproductId() { return productId; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.1; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.2; }

    @Override
    public double calculateTax() { return getPrice() * 0.05; }

    @Override
    public String getTaxDetails() { return "5% VAT"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 60000),
            new Clothing(2, "Shirt", 2000),
            new Groceries(3, "Rice", 1500)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Product: " + p.getname() + ", Price: " + p.getPrice());
            System.out.println("Final Price: " + finalPrice);
        }
    }
}