/**
 * This class prints out the solution to problem 14 of Project Euler:
 *	"Find the starting number less than 1 million that produces the longest Collatz sequence."
 *
 * https://projecteuler.net/problem=14
 */
public class Problem014 {

    // Prints 837799, the solution to problem 14 of Project Euler.
    public static void main (String[] args) {
        int chain = 0;
        int highest = 1;
        int limit = 1000000;
        int[] lengths = new int[limit]; // trade some time into space
        lengths[0] = 1;
        for (int n = 2; n < limit; n++) {
            long i = n;
            int currentLength = 1;
            while (i > 1) {
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = 3 * i + 1;
                }
                if (i < limit && i > 0 && lengths[(int) i - 1] > 0) {
                    // Just continue the loop if we have int overflow.
                    // Otherwise, use the array to reduce some time.
                    currentLength += lengths[(int) i - 1];
                    break;
                } else {
                    currentLength++;
                }
            }
            lengths[n - 1] = currentLength;
            if (currentLength > chain) {
                chain = currentLength;
                highest = n;
            }
        }

        System.out.println(highest);
    }

}
