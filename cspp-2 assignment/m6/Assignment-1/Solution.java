import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : nandakishore723
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * { global variable }.
     */
    public static final int S_INITIAL = 3;
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
        int cnt = 0;
        int temp = 0;
        for (int i = S_INITIAL; i < n; i++) {
            if (i % 2 != 0) {
                temp = prime(i);
                if (temp > 1) {
                    System.out.println(i);
                }
            }
        }

    }

    /**
     * { prime}.
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int prime(final int n) {
        int i = 2;
        int cnt = 0;
        while (i <= n) {
            if (n % i == 0) {
                cnt = cnt + 1;
            }
            i = i + 1;
        }
        return cnt;
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}






