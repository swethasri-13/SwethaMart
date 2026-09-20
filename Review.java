public class Review {

    Product product;
    String reviewText;
    int rating;

    Review(Product product, String reviewText, int rating) {
        this.product = product;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    void displayReview() {

        System.out.println("\n===== PRODUCT REVIEW =====");
        System.out.println("Product: " + product.name);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Review: " + reviewText);
    }
}