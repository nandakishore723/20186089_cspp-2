/**
* @author: nandakishore723
*/
// Given an String, Write a java method that returns the decimal
//value for the given binary string.
import java.util.Scanner;
/**
* Class for solution.
*/
final class  Solution {
/**
* It is the main class.
     *
**/
    private Solution() {
/**
 * It is the counstructor.
*/
}
/**
* @param      s    string.
*/
    public  static void binarytodecimal(final String s) {
/**
* It is method for binary to decimal.
*/
        long sub1 = Long.parseLong(s);
        final int xVAR = 10;
        final int yVAR = 2;
        long decimal = 0, i = 0;
        while (sub1 != 0) {
            decimal += ((sub1 % xVAR) * Math.pow(yVAR, i));
            sub1 = sub1 / xVAR;
            i++;
}
        System.out.println(decimal);
}
/**
* It converts the binary number to decimal.
*
* @param      args  The arguments
*/
    public static void main(final String[] args) {
/**
* It is the main class.
*/
        Scanner sc = new Scanner(System.in);
         int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            binarytodecimal(s);
    }
    }
}

