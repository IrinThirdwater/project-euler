/**
 * This class prints out the solution to problem 27 of Project Euler:
 *  "Find the product of a and b for n^2 + an + b (|a| and |b| < 1000) that produces the maximum number of primes for consecutive values of n starting from n = 0."
 *
 * https://projecteuler.net/problem=27
 */
public class Problem027 {

    // Prints -59231, the solution to problem 27 of Project Euler.
    public static void main (String[] args) {
        int product = 0;
        int current = 0;

        for (int a = -999; a < 1000; a++) {
            for (int b = -999; b < 1000; b++) {
                int n = 0;
                while (isPrime(n * n + a * n + b)) {
                    n++;
                    if (n > current) {
                        current = n;
                        product = a * b;
                    }
                }
            }
        }

        System.out.println(product);
    }

    /**
     * Check if the number is prime.
     */
    public static boolean isPrime (int x) {
        if (x < 2) {
            return false;
        }
        if (x == 2) return true;
        int upperBound = (int) Math.ceil(Math.sqrt(x));
        for (int i = 3; i <= upperBound; i++) {
            if (x % i == 0) {
                break;
            }
            if (i == upperBound) {
                return true;
            }
        }
        return false;
    }

}
