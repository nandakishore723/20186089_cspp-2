import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * It defines the main function that deals the.
     *
     * @param      base      its's the int value
     * @param      exponent  it's the exponent value
     * @return     it returns the value
     */
    public static long power(final int base, final int exponent) {
            if (exponent > 0) {
                return  base * power(base, exponent - 1);
            } else {
                return 1;
            }
        }
    /**.
     * It defines the main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    */
}


