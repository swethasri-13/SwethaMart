import java.util.Scanner;

public class Chatbot {

    void startChat() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== SWETHAMART AI CHATBOT =====");
        System.out.println("Hi! I'm SwethaMart Assistant.");
        System.out.println("Ask me about products, cart, payment or delivery.");
        System.out.println("Type 'exit' to close the chatbot.");

        while (true) {

            System.out.print("\nYou: ");
            String message = sc.nextLine().toLowerCase();

            if (message.equals("exit")) {
                System.out.println("Bot: Thank you for using SwethaMart!");
                break;
            }

            if (message.contains("product")) {
                System.out.println(
                    "Bot: We have Laptop, Mobile, Headphone and Keyboard."
                );
            }
            else if (message.contains("price")) {
                System.out.println(
                    "Bot: Laptop Rs.50000, Mobile Rs.20000, " +
                    "Headphone Rs.2000, Keyboard Rs.1500."
                );
            }
            else if (message.contains("cart")) {
                System.out.println(
                    "Bot: You can add products to your cart and check the total amount."
                );
            }
            else if (message.contains("payment")) {
                System.out.println(
                    "Bot: SwethaMart supports payment after checkout."
                );
            }
            else if (message.contains("delivery")) {
                System.out.println(
                    "Bot: Enter your delivery address during checkout."
                );
            }
            else {
                System.out.println(
                    "Bot: Sorry, I didn't understand. " +
                    "Try asking about products, price, cart, payment or delivery."
                );
            }
        }
    }
}