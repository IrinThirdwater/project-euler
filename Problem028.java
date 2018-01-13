/**
 * This class prints out the solution to problem 28 of Project Euler:
 *  "Find the sum of the numbers on the diagonals in a 1001x1001 spiral formed starting with 1 and incrementing while moving to the right in a clockwise direction."
 *
 * https://projecteuler.net/problem=28
 */
public class Problem028 {

    // Prints 669171001, the solution to problem 28 of Project Euler.
    public static void main (String[] args) {
        int sum = 1;
        int size = 1001;

        // Draw out the n = 3 and n = 5 case to arrive at the summation.
        // Exercise: Simplify this summation so the whole calculation is just one polynomial.
        for (int i = 3; i <= size; i += 2) {
            sum += (4 * Math.pow(i, 2)) - (6 * i) + 6;
        }

        System.out.println(sum);
    }

}
