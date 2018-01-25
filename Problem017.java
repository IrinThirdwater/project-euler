/**
 * This class prints out the solution to problem 17 of Project Euler:
 *      "Find the number of characters used if numbers 1 to 1000
 *       were wriiten out in words."
 *
 * https://projecteuler.net/problem=17
 */
public class Problem017 {
    
    // Prints 21124, the solution to problem 17 of Project Euler.
    public static void main (String[] args) {
        int count = 0;
        int limit = 1000;
        
        for (int i = 1; i <= limit; i++) {
            count += num2Word(i).length();
        }

        System.out.println(count);
    }

    /**
     * Returns the given number written out in words.
     */
    public static String num2Word (int n) {
        String[] digit = {"one","two","three","four",
            "five","six","seven","eight","nine"};
        String[] ten = {"ten","twenty","thirty","forty",
            "fifty","sixty","seventy","eighty","ninety"};
        String[] ten1 = {"eleven","twelve","thirteen","fourteen",
            "fifteen","sixteen","seventeen","eighteen","nineteen"};
        String and = "and";
        String hundred = "hundred";
        String thousand = "thousand";

        if (n < 1 || n > 9999) return "";
        if (n < 10) return digit[n-1];
        if (n < 100) {
            if (n%10 == 0) return ten[(n/10)-1];
            if (n < 20) return ten1[(n%10)-1];
            return ten[(n/10)-1] + digit[(n%10)-1];
        }
        if (n < 1000) {
            if (n%100 == 0) return digit[(n/100)-1] + hundred;
            return digit[(n/100)-1] + hundred + and + num2Word(n%100);
        }
        if (n%1000 == 0) return digit[(n/1000)-1] + thousand;
        return digit[(n/1000)-1] + thousand + num2Word(n%1000);
    }

}

