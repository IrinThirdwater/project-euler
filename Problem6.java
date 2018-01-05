/**
 * This class prints out the solution to problem 6 of Project Euler:
 *  "Find the difference between the sum of squares of first n positive numbers and the square of their sum."
 *
 * https://projecteuler.net/problem=6
 */
public class Problem6 {

    // Prints 25164150, the solution to problem 6 of Project Euler.
    public static void main (String[] args) {
        int n = 100;
        // Sum of squares is the pyramid number: https://en.wikipedia.org/wiki/Square_pyramidal_number
        // Square of sum is just the square of (n+1)n/2
        // The difference simplifies to:
        System.out.println((int)Math.abs(((3*Math.pow(n,4))+(2*Math.pow(n,3))-(3*Math.pow(n,2))-(2*n))/12));
    }
}
