/**
 * This class prints out the solution to problem 45 of Project Euler:
 *  "Find the next triangle number after 40755 that is also pentagonal and hexagonal."
 *
 * https://projecteuler.net/problem=45
 */
public class Problem045 {

    // Prints 1533776805, the solution to problem 45 of Project Euler.
    public static void main (String[] args) {
        long n = 0;
        long t = 286;
        double p = 0;
        double h = 0;

        for (int count = 0; count < 1;) {
            // Using quadratic formula and simplify:
            p = (1 + Math.sqrt((12 * t * t) + (12 * t) + 1)) / 6.0;
            h = (t + 1) / 2.0;
            if (p == (int) p && h == (int) h) count++;
            t++;
        }
        t--;
        n = t * (t + 1) / 2;

        System.out.println(n);
    }

}
