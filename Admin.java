public class Admin {

    void displayProduct(Product product) {

        System.out.println("\n===== ADMIN PANEL =====");
        System.out.println("Product: " + product.name);
        System.out.println("Category: " + product.category);
        System.out.println("Price: Rs." + product.price);
        System.out.println("Stock: " + product.stock);
    }

    void updateStock(Product product, int newStock) {

        product.stock = newStock;

        System.out.println(
                "\nStock updated successfully!");

        System.out.println(
                "Product: " + product.name);

        System.out.println(
                "New Stock: " + product.stock);
    }
}