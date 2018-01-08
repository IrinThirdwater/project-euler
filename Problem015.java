/**
 * This class prints out the solution to problem 15 of Project Euler:
 *	"Find the number of lattice paths from (0,0) to (20,20)."
 *
 * https://projecteuler.net/problem=15
 */
public class Problem015 {

    // Prints 137846528820, the solution to problem 15 of Project Euler.
    public static void main (String[] args) {
        int n = 20;
        long paths = 1;

        // 1. The number of lattice paths corresponds to 2n choose n.
        // 2. We can avoid computing factorial by spreading out the multiplications and divisions.
        for (int i = 1; i <= n; i++) {
            paths *= 2 * n - i + 1;
            paths /= i;
        }

        System.out.println(paths);
    }

}
