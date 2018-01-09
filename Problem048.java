/**
 * This class prints out the solution to problem 48 of Project Euler:
 *  "Find the last ten digits of the sum of each natural number from 1 to 1000 to the power of itself."
 *
 * https://projecteuler.net/problem=48
 */
public class Problem048 {

    // Prints 9110846700, the solution to problem 48 of Project Euler.
    public static void main (String[] args) {
        int power = 1000;
        long m = 10000000000 L;
        long digit = 0 L;
        long term = 1 L;

        // Using distributivity:
        for (int i = 1; i <= power; i++) {
            term = 1;
            for (int j = 1; j <= i; j++) {
                term *= i;
                term = term % m;
            }
            digit += term;
            digit = digit % m;
        }

        System.out.println(digit);
    }

}
