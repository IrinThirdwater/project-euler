/**
 * This class prints out the solution to problem 34 of Project Euler:
 *  "Find the sum of all numbers which are equal to the sum of the factorial of their digits."
 *
 * https://projecteuler.net/problem=34
 */
public class Problem034 {

    // Prints 40730, the solution to problem 34 of Project Euler.
    public static void main (String[] args) {
        int[] f = new int[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = factorial(i);
        }
        int sum = 0;
        int upperBound = 7 * f[9]; // Since 8 * 9! can't even get us to 8 digits.

        for (int i = 10; i < upperBound; i++) {
            int current = 0;
            for (int j = 1; j < i; j *= 10) {
                current += f[(i / j) % 10];
            }
            if (current == i) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    /**
     * Compute the factorial of a given number.
     */
    public static int factorial (int x) {
        return (x == 0 ? 1 : x * factorial(x - 1));
    }

}
