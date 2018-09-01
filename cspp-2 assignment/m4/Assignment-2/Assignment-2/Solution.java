import java.util.Scanner;
/**
 * Do not modify this main function.
 * @author     : nandakishore723
 */
public final class Solution {
    /**
    * Fill the main function to print resultant of addition of matrices.
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
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        for (int nr = 0; nr < r1; nr++) {
            for (int nc = 0; nc < c1; nc++) {
                arr1[nr][nc] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        for (int nr = 0; nr < r2; nr++) {
            for (int nc = 0; nc < c2; nc++) {
                arr2[nr][nc] = sc.nextInt();

            }

        }
        if (r1 == r2 && c1 == c2) {
            int[][] sum = new int[r1][c1];
            for (int nr = 0; nr < r1; nr++) {
                for (int nc = 0; nc < c1; nc++) {
                    sum[nr][nc] = arr1[nr][nc] + arr2[nr][nc];

                }

            }

            for (int nr = 0; nr < r1; nr++) {
                for (int nc = 0; nc < r1; nc++) {
                    if (nc == r1 - 1) {
                        System.out.print(sum[nr][nc]);
                    } else {
                        System.out.print(sum[nr][nc] + " ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("not possible");
        }
        }
    }

