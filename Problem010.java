/**
 * This class prints out the solution to problem 10 of Project Euler:
 *  "Find the sum of all the primes below two million."
 *
 * https://projecteuler.net/problem=10
 */
public class Problem010 {

    // Prints 142913828922, the solution to problem 10 of Project Euler.
    public static void main (String[] args) {
        int upperBound = 2000000;
        long sum = 5;

        for (int i = 3; i < upperBound; i += 2) {
            int sqrt = (int) Math.ceil(Math.sqrt(i));
            for (int j = 3; j <= sqrt; j++) {
                if (i % j == 0) break;
                if (j == sqrt) sum += i;
            }
        }

        System.out.println(sum);
    }
}
