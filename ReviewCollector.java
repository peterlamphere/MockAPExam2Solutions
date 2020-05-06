import java.util.ArrayList;

public class ReviewCollector {
  private ArrayList<ProductReview> reviewList;
  private ArrayList<String> productList;

  public ReviewCollector () {
    reviewList = new ArrayList<ProductReview>();
    productList = new ArrayList<String>();
  }

  // **** Question 1A ****
    public void addReview (ProductReview prodReview) {
    reviewList.add (prodReview);
    for (String element: productList)
        if (element.equals(prodReview.getName())) {
          return;
        }
    productList.add(prodReview.getName());
  }

   // **** Question 1B ****
    public int getNumGoodReviews(String prodName) {
    int count = 0;
    for (ProductReview element : reviewList) {
      if (element.getName().equals(prodName) && element.getReview().indexOf("best")!=-1)
        count++;
    }
    return count;
  } 

  // **** Question 1C ****
  public ArrayList<ProductReview> getBestReviewsByProduct(String prodName) {
     /*
    The programmer would have to create a new ArrayList<ProductReview> and add each review object to that list if it has the name prodName and contains the word "best".  The variable count would be  unnecessary */
    

    // You didn't need to write the code, but here it is: 
    ArrayList<ProductReview> bestReviews = new ArrayList<ProductReview>();
    for (ProductReview element : reviewList) {
      if (element.getName().equals(prodName) && element.getReview().indexOf("best")!=-1)
        bestReviews.add(element);
    }
    return bestReviews;
  }
  

  
    public String toString () {
      return "Products: " + productList + "\nReviews: " + reviewList;
    }
}