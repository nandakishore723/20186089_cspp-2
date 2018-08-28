import java.util.Scanner;
/**.
 * This program is for printing quadratic equation.
 */
public final class Solution {
    /**
     * This class is for printing quadratic equation.
     */
    private Solution() {
        /**.
         * this is constuctor
         */
    }
    /**.
     * This is a function for printing quadratic equation
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        equation(a, b, c);
    }
    /**.
     * This is a function for printing quadratic equation
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void equation(final int a, final int b, final int c) {
        final int x = 4;
        long d = (b * b) - (x * a * c);
        double root1 = (-b + (Math.sqrt(Math.abs(d)))) / (2 * a);
        double root2 = (-b - (Math.sqrt(Math.abs(d)))) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
}
