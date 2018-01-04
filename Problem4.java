/**
 * This class prints out the solution to problem 4 of Project Euler:
 *  "Find the largest palindrome made from the product of two 3-digit numbers."
 *
 * https://projecteuler.net/problem=4
 */
public class Problem4 {

    // Prints 906609, the solution to problem 4 of Project Euler.
    public static void main(String[] args) {
        int a = 999;
        int b = 999;
        int largestProduct = 1;
        while (a > 99) {
            while (b > 99) {
                if (a * b > largestProduct && isPalindrome(a * b)) {
                    largestProduct = a * b;
                    break;
                }
                b--;
            }
            a--;
            b = a;
        }
        System.out.println(largestProduct);
    }

    /**
     * Check if the number is a palindrome.
     */
    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return s.equals(new StringBuffer(s).reverse().toString());
    }

}
