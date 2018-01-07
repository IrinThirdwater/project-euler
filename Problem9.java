/**
 * This class prints out the solution to problem 9 of Project Euler:
 *  "Find the product of the pythagorean triplet whose sum equals 1000."
 *
 * https://projecteuler.net/problem=9
 */
public class Problem9 {

    // Prints 31875000, the solution to problem 9 of Project Euler.
    public static void main (String[] args) {
        int product = 1;
        // Since a < b < c < 1000
        for (int a = 1; a < 333; a++) {
            for (int b = a + 1; b < 500; b++) {
                int c = 1000 - b - a;
                if (a * a + b * b == c * c) {
                    product = a * b * c;
                }
            }
        }
        System.out.println(product);
    }
}
