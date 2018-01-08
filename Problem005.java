/**
 * This class prints out the solution to problem 5 of Project Euler:
 *  "Find the smallest positive number that is evenly divisible by 1, 2, ... 20."
 *
 * https://projecteuler.net/problem=5
 */
public class Problem005 {

    // Prints 232792560, the solution to problem 5 of Project Euler.
    public static void main (String[] args) {
        int largestFactor = 20;
        int dividee = largestFactor;
        boolean found = false;

        while (!found) {  // Let us assume such a number exists.
            for (int i = 2; i < largestFactor; i++) {
                if (dividee % i != 0) {
                    dividee += largestFactor;
                    break;
                }
                if (i == largestFactor - 1) {
                    found = true;
                }
            }
        }

        System.out.println(dividee);
    }

}
