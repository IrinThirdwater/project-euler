/**
 * This class prints out the solution to problem 2 of Project Euler:
 *  "Find the sum even Fibonacci numbers below 4000000."
 *
 * https://projecteuler.net/problem=2
 */
public class Problem2 {

    // Prints 4613732, the solution to problem 2 of Project Euler.
    public static void main (String[] args) {
        int upperBound = 4000000;
        int sumOfEvenFib = 0;

        // Instead of writing a fibb function, we'll just keep track of the previous term as we go along.
        int n1 = 1;
        int tmp = 0;

        for (int fib = 2; fib < upperBound; fib += tmp) {
            if (fib % 2 == 0) {
                sumOfEvenFib += fib;
            }
            tmp = n1;
            n1 = fib;
        }

        System.out.println(sumOfEvenFib);
    }

}
