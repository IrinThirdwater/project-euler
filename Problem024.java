import java.util.List;
import java.util.ArrayList;
/**
 * This class prints out the solution to problem 24 of Project Euler:
 *  "Find the millionth lexicographic permutation of the digits 0 to 9."
 *
 * https://projecteuler.net/problem=24
 */
public class Problem024 {

    // Prints 2783915460, the solution to problem 24 of Project Euler.
    public static void main (String[] args) {
        long perm = 0;
        int n = 1000000;
        int digits = 10;
        List<Integer> remainingDigits = new ArrayList<Integer>(digits);
        for (int i = 0; i < digits; i++) {
            remainingDigits.add(Integer.valueOf(i));
        }

        int x = n - 1; // We'll be working with this just to make the maths with modulo easier.
        String result = ""; // We'll also add each digits one-by-one using strings first.
        for (int i = 1; i < digits; i++) {
            result += remainingDigits.remove((x % factorial(digits - (i - 1))) / factorial(digits - i));
        }
        result += remainingDigits.remove(0);
        perm = Long.parseLong(result);

        System.out.println(perm);
    }

    /**
     * Compute the factorial of a given number.
     */
    public static int factorial (int x) {
        return (x == 0 ? 1 : x * factorial(x - 1));
    }

}
