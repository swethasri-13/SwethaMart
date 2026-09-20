public class Seller {

    void addProduct(String name, int price, String category, int stock) {

        Product product = new Product(
                name,
                price,
                category,
                stock
        );

        System.out.println("\n===== SELLER PRODUCT =====");
        System.out.println("Product added successfully!");
        System.out.println("Name: " + product.name);
        System.out.println("Category: " + product.category);
        System.out.println("Price: Rs." + product.price);
        System.out.println("Stock: " + product.stock);
    }
}