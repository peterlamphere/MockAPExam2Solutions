public class ProductReview {
  private String name;
  private String review;
  public ProductReview (String name, String review) {
    this.name = name;
    this.review = review;
  }
  public String getName() {
    return name;
  }

  public String getReview() {
    return review;
  }

  public String toString () {
    return "Product: " + name + "\nReview: " + review + "\n";
  }
}