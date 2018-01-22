/**
 * This class prints out the solution to problem 12 of Project Euler:
 *  "Find the value of the first trianglar number with over five hundred divisors."
 * 
 * https://projecteuler.net/problem=12
 */
public class Problem012 {

    // Prints 76576500, the solution to problem 11 of Project Euler.
    public static void main (String[] args) {
       int divisorGoal = 500;
       int tri = 1;
       int n = 1;
       int count = 0;

       while (count <= divisorGoal) {
           n++;
           tri+=n;
           count = 2;
           for (int i = 2; i <= tri/2; i++) {
               if (tri%i == 0) count++;
           }
       }

       System.out.println(tri);
    }

}

