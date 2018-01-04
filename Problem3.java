/**
 * This class prints out the solution to problem 3 of Project Euler:
 *  "Find the largest prime factor of 600851475143."
 *
 * https://projecteuler.net/problem=3
 */
public class Problem3 {
  
  // Prints 6857, the solution to problem 3 of Project Euler.
  // The algorithm is from this StackOverflow answer: https://stackoverflow.com/a/412942/9147640
  public static void main (String[] args) {
  	long n = 600851475143L;
    //long n = 1234567898766700L; // = 2 * 2 * 5 * 5 * 12345678987667
    
    long remaining = n;
    long largestPrimeFactor = 0;
    long divider = 2;
    
    // Seperate loop for even prime.
    while (remaining % divider == 0) {
    	remaining /= divider;
    }
    divider++;
    
    // The rest of the loop can increment by 2.
    while(remaining > 1) {
      // This inner loop ensures that any divider that divides remaining is not composite.
      while (remaining % divider == 0) {
      	remaining /= divider;
      }
      divider += 2;
      if (divider * divider > remaining) {
        largestPrimeFactor = (remaining > 1 ? remaining : divider - 2);
        break;
      }
    }
    
    System.out.println(largestPrimeFactor);
  }
  
}
