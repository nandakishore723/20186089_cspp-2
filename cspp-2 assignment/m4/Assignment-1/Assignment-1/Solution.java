import java.util.Scanner;
/**
 * Do not modify this main function.
 * @author     : nandakishore723
 */
public final class Solution {
    /**
    *Fill this main function to print maximum of given array.
    */
    private Solution() {
    //We are not using this constructor.
    }

    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}


