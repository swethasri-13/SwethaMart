import java.util.Scanner;

public class Checkout {

    void processCheckout(Product product, int quantity) {

        Scanner sc = new Scanner(System.in);

        int total = product.price * quantity;

        System.out.println("\n===== CHECKOUT =====");
        System.out.println("Product: " + product.name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: Rs." + total);

        sc.nextLine();

        System.out.print("Enter delivery address: ");
        String address = sc.nextLine();

        System.out.println("\nOrder Summary");
        System.out.println("Product: " + product.name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Address: " + address);
        System.out.println("Total: Rs." + total);

        System.out.println("\nCheckout completed successfully!");
    }
}