public class Product {

    String name;
    int price;
    String category;
    int stock;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.category = "General";
        this.stock = 0;
    }

    Product(String name, int price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
}