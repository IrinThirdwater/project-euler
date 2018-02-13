/**
 * This class prints out the solution to problem 206 of Project Euler:
 *  "Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
 *   where each “_” is a single digit."
 *
 * https://projecteuler.net/problem=206
 */
public class Problem206 {

    // Prints 1389019170, the solution to problem 206 of Project Euler.
    public static void main (String[] args) {
        long i = (long) Math.sqrt(1020304050607080900L);
        while (!hasCorrectForm(i*i)) {
            i++;
        }
        System.out.println(i);
    }

    /**
     * Check if the long has the form 1_2_3_4_5_6_7_8_9_0.
     * Each underscore is a single digit.
     *
     * @param n long to check.
     * @return Boolean stating whether or not the long has the specified form.
     */
    public static boolean hasCorrectForm (long n) {
        long[] digits = {0,9,8,7,6,5,4,3,2,1};
        long nn = n;
        for (int i = 0; i < digits.length; i++) {
            if (nn%10 != digits[i]) {
                return false;
            } else {
                nn/= 100;
            }
        }
        return true;
    }

}
