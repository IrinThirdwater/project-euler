/**
 * This class prints out the solution to problem 79 of Project Euler:
 *  "Find the shortest possible passcode given a list of randomly generated triplets of 3 digits of the passcode sampled in the left to right order."
 *
 * https://projecteuler.net/problem=79
 */
public class Problem079 {

    // Prints 73162890, the solution to problem 79 of Project Euler.
    public static void main (String[] args) {
        // Just draw a graph and put an arrow from digit A to B if A comes before B.
        // In this case, the (directed) graph is acyclic, hence there's no repeated digits. In addition, digit 4 and 5 can be removed entirely. This leaves us with a graph containing one hamiltonian path starting from 7.
        // Let us revisit this problem again at some point for an actual exercise in programming.
        System.out.println(73162890);
    }

}
