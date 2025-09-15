// Sample Program 4: Shopping Cart System
// Create a Product class to manage shopping cart items with the following features:
// Static:
// ○       A static variable discount shared by all products.
// ○       A static method updateDiscount() to modify the discount percentage.
// This:
// ○       Use this to initialize productName, price, and quantity in the constructor.
// Final:
// ○       Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
// Instanceof:
// ○       Validate whether an object is an instance of the Product class before processing its details.

package static_sample_problem;

public class Product {
    static double discount = 0.1;
    public final String productID;
    String productName;
    double price;
    int quantity;
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + (discount * 100) + "%");
    }

}
class Main3 {
    public static void main(String[] args) {
        Product prod1 = new Product("P001", "Laptop", 1000.0, 2);
        if(prod1 instanceof Product) {
            prod1.displayDetails();
        }
    }
}
