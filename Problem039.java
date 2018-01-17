/**
 * This class prints out the solution to problem 39 of Project Euler:
 *  "Find the perimeter <= 1000 with the maximum number of Pythagorean triplets."
 *
 * https://projecteuler.net/problem=39
 */
public class Problem039 {

    // Prints 840, the solution to problem 39 of Project Euler.
    public static void main (String[] args) {
        int maxSolutions = 0;
        int maxP = 0;
        int upperBound = 1000;
        int[] solutions = new int[upperBound];

        // Count and allocate all pythagorean triplets with perimeter <= upperBound
        for (int p = 3; p <= 1000; p++) {
            for (int a = 1; a <= p / 3; a++) {
                for (int b = a; b <= (p - a) / 2; b++) {
                    int c = p - a - b;
                    if (a * a + b * b == c * c) {
                        solutions[a + b + c - 1]++;
                    }
                }
            }
        }

        // Find the maximum
        for (int i = 0; i < upperBound; i++) {
            if (solutions[i] > maxSolutions) {
                maxSolutions = solutions[i];
                maxP = i + 1;
            }
        }

        System.out.println(maxP);
    }

}
