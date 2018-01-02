/**
 * This class prints out the solution to problem 1 of Project Euler:
 *  "Find the sum of all the multiples of 3 or 5 below 1000."
 *
 * https://projecteuler.net/problem=1
 */
public class Problem1 {
  
  // Prints 233168, the solution to problem 1 of Project Euler.
  public static void main (String[] args) {
    int upperBound = 1000;
    int sumOfMultiples = 0;
    for (int i = 1; i < upperBound; i++) {
      if (i%3==0 || i%5==0) {
        sumOfMultiples += i;
      }
    }
    System.out.println(sumOfMultiples);
  }
  
}
