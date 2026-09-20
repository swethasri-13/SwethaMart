import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SWETHAMART =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        User user = new User(name, email, password);

        System.out.println("\nRegistration successful!");

        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter email: ");
        String loginEmail = sc.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = sc.nextLine();

        if (loginEmail.equals(user.email) &&
            loginPassword.equals(user.password)) {

            System.out.println("\nLogin successful!");

            Product laptop = new Product("Laptop", 50000,"Electronics",10);
            Product mobile = new Product("Mobile", 20000,"Electronics",15);
            Product headphone = new Product("Headphone", 2000,"Accessories",20);

            System.out.println("\n===== PRODUCTS =====");
            System.out.println("1. Laptop - Rs.50000 - Stock:"+laptop.stock);
            System.out.println("2. Mobile - Rs.20000- Stock:"+mobile.stock);
            System.out.println("3. Headphone - Rs.2000- Stock:"+headphone.stock);

            System.out.print("Choose product: ");
            int choice = sc.nextInt();

            Product selectedProduct = null;

            if (choice == 1)
                selectedProduct = laptop;
            else if (choice == 2)
                selectedProduct = mobile;
            else if (choice == 3)
                selectedProduct = headphone;

            if (selectedProduct != null) {

                System.out.print("Enter quantity: ");
int quantity = sc.nextInt();

if (quantity > 0) {
    if(quantity>selectedProduct.stock){
        System.out.println("Not enough stock available!!");
        return ;
    }

    Cart cart = new Cart();
    cart.addProduct(selectedProduct, quantity);
    cart.displayCart();

    Order order = new Order(selectedProduct, quantity);
    order.placeOrder();
    selectedProduct.stock -=quantity;

    int total = selectedProduct.price * quantity;

    Payment payment = new Payment(total);
    payment.makePayment();

} else {
    System.out.println("Invalid quantity!");
}

            } else {
                System.out.println("Invalid product!");
            }

        } else {
            System.out.println("Login failed! Please check your email or password!");
        }

        sc.close();
    }
}