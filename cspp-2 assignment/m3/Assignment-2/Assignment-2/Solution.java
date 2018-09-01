/**
 *@author : nandakishore723.
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Do not modify this main function.
 */
public final class Solution {
    /**
     * { global variable }.
     */
    public static final int N_VALUE = 10;
    /**
     * { global variable }.
     */
    public static final int N_VALUE1 = 7;
    /**
     * Constructs the object.
     */
    private Solution() {
    //we are not using this constructor.
    }
/**
 * Fill the main function to.
 * print the number of 7's between 1 to n.
 * @param      args  The arguments.
 */
    public static void main(final String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            count += numbers(i);
        }
        System.out.println(count);
    }
    /**
     * { function_description }.
     *
     * @param      n     { parameter_description }.
     *
     * @return     { description_of_the_return_value }.
     */
    public static int numbers(final int n) {
        int count = 0;
        int va = n;
        while (va > 0) {
            if (va % N_VALUE == N_VALUE1) {
                count = count + 1;
            }
            va = va / N_VALUE;
        }
        return count;
    }
}



