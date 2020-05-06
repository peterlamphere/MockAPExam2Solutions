class Main {
  public static void main(String[] args) {
    
    // Code to test the programs
    // Answers for Question 1 are in ReviewCollector.java
    // Answers for Question 2 are in Hailstone.java
    
    ReviewCollector reviews = new ReviewCollector();

    reviews.addReview (new ProductReview ("iPhone X", "What a waste of money"));
    reviews.addReview (new ProductReview ("Samsung Galaxy 12", "This is the best phone"));
    reviews.addReview (new ProductReview ("Samsung Galaxy 12", "Is this phone made out of asbestos?"));
    reviews.addReview (new ProductReview ("iPhone X", "The best phone ever!"));
    reviews.addReview (new ProductReview ("iPhone X", "The worst phone ever!"));
    

    System.out.println (reviews);
    System.out.println ("Samsung has " + reviews.getNumGoodReviews("Samsung Galaxy 12") + " good reviews");


    System.out.println ("iPhone best review: " + reviews.getBestReviewsByProduct("iPhone X"));

    Hailstone.test();

  }



}