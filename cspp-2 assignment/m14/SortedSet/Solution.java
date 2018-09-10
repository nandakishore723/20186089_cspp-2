import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for sorted set.
 */
class SortedSet extends Set {
    /**
     * sort function.
     *
     * @param      array  The array
     */
    public void sort(final int[] array) {
        int val;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    val = array[i];
                    array[i] = array[j];
                    array[j] = val;
                }
            }
        }
    }
    /**
     * add function.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (!contains(item)) {
            set[size++] = item;
        }
        sort(set);
    }
    /**
     * subset.
     *
     * @param      fromElement  The fromElement
     * @param      toElement    The toElement
     *
     * @return     from fromElement to toElement returns elements.
     */
    public int[] subSet(final int fromElement, final int toElement) {
        if (fromElement > toElement) {
            System.out.println("Invalid Arguments to Subset Exception");
            return null;
        }
        int[] result = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] >= fromElement) {
                for (int j = i; j < size; j++) {
                    if (set[j] < toElement) {
                        result[k++] = set[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(result, k);
    }
    /**
     * headset function.
     *
     * @param      toElement   The toElement
     *
     * @return     returms elements.
     */
    public int[] headSet(final int toElement) {
        int[] result = new int[size];
        int val = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] < toElement) {
                result[i] = set[i];
                val++;
            }
        }
        return Arrays.copyOf(result, val);
    }
    /**
     * last function.
     *
     * @return     returns list of elements.
     */
    public int last() {
        if (size == 0) {
            System.out.println("Set Empty Exception");
            return -1;
        }
        return set[size - 1];
    }
    /**
     * Adds all.
     *
     * @param      element  The element
     */
    public void addAll(final int[] element) {
        for (int i : element) {
            this.add(i++);
        }
    }
}
/**
 * Solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      str     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String str) {
        String input = str;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (str.contains("[")) {
            input = str.substring(1, str.length() - 1);
        }
        return Arrays.stream(input.split(","))
               .mapToInt(Integer::parseInt)
               .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        SortedSet ss = new SortedSet();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(ss.size());
                break;
            case "contains":
                System.out.println(ss.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(ss);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    ss.add(intArray[0]);
                } else {
                    ss.add(intArray);
                }
                break;
            case "intersection":
                ss = new SortedSet();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                ss.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(ss.intersection(t));
                break;
            case "retainAll":
                ss = new SortedSet();
                intArray = intArray(tokens[1]);
                ss.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(ss.retainAll(intArray));
                break;
            case "cartesianProduct":
                ss = new SortedSet();
                t = new Set();
                intArray = intArray(tokens[1]);
                ss.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(ss.cartesianProduct(t)));
                break;
            case "subSet":
                if (tokens.length != 2) {
                    break;
                }
                String[] arrstring3 = tokens[1].split(",");
                int[] object = ss.subSet(Integer.parseInt(arrstring3[0]),
                                         Integer.parseInt(arrstring3[1]));
                if (object != null) {
                    System.out.println(Arrays.toString(object).replace("[",
                                       "{").replace("]", "}"));
                }
                break;
            case "headSet":
                if (tokens.length != 2) {
                    break;
                }
                int[] obj = ss.headSet(Integer.parseInt(tokens[1]));
                if (obj != null) {
                    System.out.println(Arrays.toString(obj).replace("[",
                                       "{").replace("]", "}"));
                }
                break;
            case "last":
                if (tokens.length != 1) {
                    break;
                }
                int temp = ss.last();
                System.out.println(temp);
                break;
            case "addAll":
                int[] intArr = intArray(tokens[1]);
                if (intArr.length == 1) {
                    ss.add(intArr[0]);
                } else {
                    ss.add(intArr);
                }
                break;
            default:
                break;
            }
        }
    }
}





