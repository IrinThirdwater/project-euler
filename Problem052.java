/**
 * This class prints out the solution to problem 52 of Project Euler:
 *  "Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits."
 *
 * https://projecteuler.net/problem=52
 */
public class Problem052 {

    // Prints 142857, the solution to problem 52 of Project Euler.
    public static void main (String[] args) {
        int x = 10;

        while (!isDigitPermutation(x, 2 * x) ||
            !isDigitPermutation(x, 3 * x) ||
            !isDigitPermutation(x, 4 * x) ||
            !isDigitPermutation(x, 5 * x) ||
            !isDigitPermutation(x, 6 * x)) {
            x++;
        }

        System.out.println(x);
    }

    /**
     * Check if each of the two numbers are permutations of another.
     */
    public static boolean isDigitPermutation (int a, int b) {
        int[] count = {0,0,0,0,0,0,0,0,0,0};
        int x = a;
        while (x > 0) {
            count[x % 10]++;
            x /= 10;
        }
        x = b;
        while (x > 0) {
            count[x % 10]--;
            x /= 10;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }

}
