public class Cart {

    Product product;
    int quantity;

    void addProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    void displayCart() {
        int total = product.price * quantity;

        System.out.println("\n===== CART =====");
        System.out.println("Product: " + product.name);
        System.out.println("Category: " + product.category);
       System.out.println("Available Stock: " + product.stock);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + total);
    }
}