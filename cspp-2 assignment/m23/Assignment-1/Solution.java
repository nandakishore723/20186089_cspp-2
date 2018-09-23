/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
import java.io.File;
/**.
 * { item_description }
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private static final int HUN = 100;

    /**
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Plagiarism pl = new Plagiarism();
        Scanner ip = new Scanner(System.in);
        try {
            String line = ip.next();
            File file = new File(line);
            File[] listFiles = file.listFiles();
            int k = listFiles.length;
            int[][] matrix = new int[k][k];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    if (i == j) {
                        matrix[i][j] = HUN;
                    }
                    if (i < j) {
                        matrix[i][j] = pl.bagOfWords(pl.toString(
                            listFiles[i]), pl.toString(listFiles[j]));
                    } else {
                        matrix[i][j] = matrix[j][i];
                    }
                }
            }
            pl.print(matrix, listFiles);
        } catch (Exception e) {
            System.out.println("empty directory");
        }
    }
}

