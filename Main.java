import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Order History
        ArrayList<Order> orderHistory = new ArrayList<>();

        System.out.println("===== SWETHAMART =====");

        // REGISTRATION
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        User user = new User(name, email, password);

        System.out.println("\nRegistration successful!");

        // LOGIN
        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter email: ");
        String loginEmail = sc.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = sc.nextLine();

        if (loginEmail.equals(user.email) &&
            loginPassword.equals(user.password)) {

            System.out.println("\nLogin successful!");

            // AI CHATBOT
            Chatbot chatbot = new Chatbot();
            chatbot.startChat();

            // PRODUCTS
            Product laptop = new Product(
                    "Laptop", 50000, "Electronics", 10);

            Product mobile = new Product(
                    "Mobile", 20000, "Electronics", 15);

            Product headphone = new Product(
                    "Headphone", 2000, "Accessories", 20);

            // SELLER PRODUCT MANAGEMENT
            Seller seller = new Seller();

            seller.addProduct(
                    "Keyboard",
                    1500,
                    "Accessories",
                    25
            );

            System.out.println("\n===== PRODUCTS =====");
            System.out.println("1. Laptop - Rs.50000 - Stock:" + laptop.stock);
            System.out.println("2. Mobile - Rs.20000 - Stock:" + mobile.stock);
            System.out.println("3. Headphone - Rs.2000 - Stock:" + headphone.stock);
            System.out.println("4. Keyboard - Rs.1500 - Stock:25");

            System.out.print("Choose product: ");
            int choice = sc.nextInt();

            Product selectedProduct = null;

            if (choice == 1) {
                selectedProduct = laptop;
            }
            else if (choice == 2) {
                selectedProduct = mobile;
            }
            else if (choice == 3) {
                selectedProduct = headphone;
            }
            else if (choice == 4) {
                selectedProduct = new Product(
                        "Keyboard",
                        1500,
                        "Accessories",
                        25
                );
            }

            if (selectedProduct != null) {

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                if (quantity > 0) {

                    if (quantity > selectedProduct.stock) {
                        System.out.println("Not enough stock available!");
                        return;
                    }

                    // CART
                    Cart cart = new Cart();

                    cart.addProduct(selectedProduct, quantity);

                    cart.displayCart();

                    // CHECKOUT
                    sc.nextLine();

                    Checkout checkout = new Checkout();

                    checkout.processCheckout(
                            selectedProduct, quantity);

                    // ORDER
                    Order order = new Order(
                            selectedProduct, quantity);

                    order.placeOrder();

                    // Add order to history
                    orderHistory.add(order);

                    // Update stock
                    selectedProduct.stock -= quantity;

                    // PAYMENT
                    int total = selectedProduct.price * quantity;

                    Payment payment = new Payment(total);

                    payment.makePayment();

                    // PRODUCT REVIEW
                    System.out.println("\n===== PRODUCT REVIEW =====");

                    System.out.print("Enter rating (1-5): ");
                    int rating = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter your review: ");
                    String reviewText = sc.nextLine();

                    if (rating >= 1 && rating <= 5) {

                        Review review = new Review(
                                selectedProduct,
                                reviewText,
                                rating
                        );

                        review.displayReview();

                    }
                    else {
                        System.out.println("Invalid rating!");
                    }

                    // ADMIN PANEL
                    Admin admin = new Admin();

                    admin.displayProduct(selectedProduct);

                    System.out.print("\nEnter new stock: ");
                    int newStock = sc.nextInt();

                    admin.updateStock(
                            selectedProduct,
                            newStock
                    );

                    // ORDER HISTORY
                    System.out.println("\n===== ORDER HISTORY =====");

                    for (Order previousOrder : orderHistory) {

                        System.out.println(
                                "Product: " +
                                previousOrder.product.name);

                        System.out.println(
                                "Category: " +
                                previousOrder.product.category);

                        System.out.println(
                                "Quantity: " +
                                previousOrder.quantity);

                        System.out.println(
                                "Total: Rs." +
                                (previousOrder.product.price *
                                previousOrder.quantity));

                        System.out.println("------------------------");
                    }

                }
                else {
                    System.out.println("Invalid quantity!");
                }

            }
            else {
                System.out.println("Invalid product!");
            }

        }
        else {
            System.out.println(
                    "Login failed! Please check your email or password!");
        }

        sc.close();
    }
}