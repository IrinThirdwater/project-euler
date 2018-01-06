/**
 * This class prints out the solution to problem 7 of Project Euler:
 *  "Find the 10,001st prime number."
 *
 * https://projecteuler.net/problem=7
 */
public class Problem7 {

    // Prints 104743, the solution to problem 7 of Project Euler.
    public static void main (String[] args) {
        int n = 10001;
        int current = 2;
        int prime = 3;

        while (current < n) {
            prime += 2;
            int upperBound = (int) Math.ceil(Math.sqrt(prime));
            for (int i = 3; i <= upperBound; i++) {
                if (prime % i == 0) {
                    break;
                }
                if (i == upperBound) {
                    current++;
                }
            }
        }
        
        System.out.println(prime);
    }

}
