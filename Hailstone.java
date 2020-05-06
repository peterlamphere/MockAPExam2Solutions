public class Hailstone {
  // **** Question 2A ****

  public static int hailstoneLength (int n) {
    // The sequence has at least 1 number
    int count = 1;

    // if n = 1, we stop
    while(n > 1) {
      // if n is even, then n % 2 =0
      if (n%2==0) { 
        n /= 2; // divide by 2
      } else { // if n is odd
        n = 3*n+1; // multiply by three and add one
      }
      count++;
    }
    return count; // How many times did we go through the loop? 
  }


  // **** Question 2B ****
  public static double propLong (int n) {
    // This method would need to use the isLongSeq method, by creating a for loop from 1 to n, and counting all the value for which isLongSeq returns true, and then dividing the count by n.

    // You don't need to write this 
    int count =0;
    for (int i=1; i<=n; i++)
      if (isLongSeq(i)) // if (isLongSeq(i)==true)
        count++;
    return count/(double) n;


  public static boolean isLongSeq (int n) {
    // if the length of the sequence is bigger than n, it is "long".  You don't need to write this code for the exam, but its pretty simple
    return hailstoneLength(n) > n;

    // You could also do this if you like typing a lot: 
    if (hailstoneLength(n) > n)
      return true;
    else
      return false;

  
  }

 

  // Some code to test it out.
  public static void test() {
    System.out.println("Testing Hailstone:");

    System.out.println("The hailstone sequence for 10 has length:" + hailstoneLength (10));

    for (int i=2; i < 10; i++) {
      System.out.print (i + ": " + isLongSeq(i));
    }

    System.out.println ("Proportion: " + propLong(10));
  }

}