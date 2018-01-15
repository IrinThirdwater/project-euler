/**
 * This class prints out the solution to problem 49 of Project Euler:
 *  "Find the 12-digit concatenated terms of the 4-digit arithmetic sequence where each of the terms are prime, permutations of one another, and does not start with 1487."
 *
 * https://projecteuler.net/problem=49
 */
public class Problem049 {

    // Prints 296962999629, the solution to problem 49 of Project Euler.
    public static void main (String[] args) {
        int n = 1001;
        long result = 0L;
        int count = 0;
        int[] initial = {0,0};
        int[] diff = {0,0};

        // Find the 2 sequences
        while (n < 10000 && count < 2) {
            if (isPrime(n)) {
                for (int i = 2; i < (10000 - n) / 2; i += 2) {
                    if (isPrime(n + i) && isPrime(n + (2 * i)) && isDigitPermutation(n, n + i) && isDigitPermutation(n, n + (2 * i))) {
                        initial[count] = n;
                        diff[count] = i;
                        count++;
                    }
                }
            }
            n += 2;
        }

        // Get the one we want
        int index = (initial[0] == 1487 ? 1 : 0);
        result = Long.valueOf("" + initial[index] + (initial[index] + diff[index]) + (initial[index] + (2 * diff[index])));

        System.out.println(result);
    }

    /**
     * Check if the number is prime.
     */
    public static boolean isPrime (int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        int upperBound = (int) Math.ceil(Math.sqrt(x));
        for (int i = 3; i <= upperBound; i++) {
            if (x % i == 0) break;
            if (i == upperBound) return true;
        }
        return false;
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
