public class Order {

    Product product;
    int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    void placeOrder() {
        System.out.println("\nOrder placed successfully!");
        System.out.println("Product: " + product.name);
        System.out.println("Category: " + product.category);
        System.out.println("Quantity: " + quantity);
    }
}