class Product { int proid; String proname; double price;

    public Product(int proid, String proname, double price) { this.proid = proid; this.proname = proname; this.price = price; }

    public void display() { System.out.println("Product ID: " + proid + ", Name: " + proname + ", Price: $" + price); } }

public class Ouestion1 { public static void main(String[] args) { // Create 5 products
    Product[] products = {
            new Product(1, "Laptop", 75000),
            new Product(2, "Smartphone", 30000),
            new Product(3, "Tablet", 15000),
            new Product(4, "Smartwatch", 5000),
            new Product(5, "Headphones", 2000) };

    // Display products
    for (Product p : products) {
        p.display();
    }
}
}