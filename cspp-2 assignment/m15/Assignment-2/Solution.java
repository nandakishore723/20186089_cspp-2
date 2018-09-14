import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for set.
 * @author     : nandakishore723
 */
class SortedSet {
    /**
     * 10 is a magic number.
     */
    private static final int val = 10;
    /**
     * Empty constructor.
     */
    protected SortedSet() {
        sortedset = new int[val];
        size = 0;
    }
    /**
     * constructor with arguments.
     */
    private int[] sortedset;
    /**
     * size is the no of elements.
     */
    private int size;
    /**
     * Constructs the object.
     *
     * @param      capacity  The capacity
     */
    protected SortedSet(final int capacity) {
        sortedset = new int[capacity];
        size = 0;
    }
    /**
     * size method.
     *
     * @return     size
     */
    public int size() {
        return size;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + sortedset[i] + ", ";
        }
        str = str + sortedset[i] + "}";
        return str;
    }
    /**
     * resize method.
     */
    public void resize() {
        // System.out.println(size);
        sortedset = Arrays.copyOf(sortedset, 2 * size);
    }
    /**
     * add method.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (size == sortedset.length) {
            resize();
        }
        if (!contains(item)) {
            sortedset[size++] = item;
        }
        sortedset = Arrays.copyOf(sortedset, size);
        Arrays.sort(sortedset);
    }
    /**
     * returns a set after removing the element.
     *
     * @param      index      The index
     *
     * @throws     Exception  Invalid Position Exception
     */
    public void remove(final int index) throws Exception {
        if (index >= size || index < 0) {
            throw new Exception("Invalid Position Exception");
        } else {
            for (int i = index; i < size; i++) {
            sortedset[i] = sortedset[i + 1];
        }
        }
        size--;
    }
    /**
     * Adds all.
     *
     * @param      item  The item
     */
    public void addAll(final int[] item) {
        // System.out.println("addAll");
        for (int i = 0; i < item.length; i++) {
            // System.out.println(item[i]);
            add(item[i]);
        }
    }
    /**
     * boolean method.
     *
     * @param      item  The item
     *
     * @return     return either true or false.
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (item == sortedset[i]) {
                return true;
            }
        }
        return false;
        }
    /**
     * intersection of set.
     *
     * @param      that  The that
     *
     * @return     returns a set
     */
    public SortedSet intersection(final SortedSet that) {
        if (that.size() == 0 || this.size() == 0) {
            return new SortedSet();
        }
        SortedSet newsortedset = new SortedSet();
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < that.size(); j++) {
                    if (that.sortedset[j] == this.sortedset[i]) {
                        newsortedset.add(this.sortedset[i]);
                    }
                }
            }
            return newsortedset;
        }
    /**
     * retailAll function.
     *
     * @param      items  The items
     *
     * @return     a set
     */
    public SortedSet retainAll(final int[] items) {
            SortedSet newsortedset = new SortedSet();
            newsortedset.addAll(items);
            return this.intersection(newsortedset);
        }
    /**
     * cartesian product.
     *
     * @param      that  The that
     *
     * @return     an array
     */
    public int[][] cartesianProduct(final SortedSet that) {
        int[][] array = new int[this.size() * that.size()][2];
        if (this.size() == 0 || that.size() == 0) {
            return null;
        }
        int x = 0;
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < that.size(); j++) {
                array[x][0] = this.sortedset[i];
                array[x++][1] = that.sortedset[j];
            }
        }
        return array;
    }
    /**
     * subset.
     *
     * @param      fromElement  The from element.
     * @param      toElement    To element
     *
     * @return     set
     *
     * @throws     Exception    exception
     */
    public SortedSet subSet(final int fromElement,
                            final int toElement) throws Exception {
        SortedSet set = new SortedSet();
        if (fromElement > toElement) {
            throw new Exception("Invalid Arguments to Subset Exception");
        } else if (size == 0) {
            return set;
        } else {
            for (int i = 0; i < size; i++) {
                if (sortedset[i] >= fromElement && sortedset[i] < toElement) {
                    set.add(sortedset[i]);
                }
            }
        }
    return set;
    }
    /**
     * headset.
     *
     * @param      toElement  To element.
     *
     * @return     set
     *
     * @throws     Exception  exception
     */
    public SortedSet headSet(final int toElement) throws Exception {
        SortedSet set = new SortedSet();
        for (int i = 0; i < size(); i++) {
            if (sortedset[i] < toElement) {
                set.add(sortedset[i]);
            }
        }
        if (set.size() == 0) {
            throw new Exception("Set Empty Exception");
        } else {
            return set;
        }
    }
    /**
     * returns the last element.
     *
     * @return     returns the last element in the set.
     *
     * @throws     Exception  exception
     */
    public int last() throws Exception {
        if (size == 0) {
            throw new Exception("Set Empty Exception");
        } else {
        return sortedset[size - 1];
        }
    }
}
/**
 * Solution class for code-eval.
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
     * @param      s     string input
     *
     * @return     int array from the given string
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
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
        SortedSet s = new SortedSet();
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
                System.out.println(s.size());
                break;
                case "remove":
                try {
                s.remove(Integer.parseInt(tokens[1]));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                }
                break;
                case "addAll":
                intArray = intArray(tokens[1]);
                s.addAll(intArray);
                break;
                case "intersection":
                s = new SortedSet();
                SortedSet t = new SortedSet();
                intArray = intArray(tokens[1]);
                s.addAll(intArray);
                intArray = intArray(tokens[2]);
                t.addAll(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new SortedSet();
                intArray = intArray(tokens[1]);
                s.addAll(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new SortedSet();
                t = new SortedSet();
                intArray = intArray(tokens[1]);
                s.addAll(intArray);
                intArray = intArray(tokens[2]);
                t.addAll(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                case "subSet":
                try {
                if (tokens.length != 2) {
                    break;
                }
                String[] arrstring3 = tokens[1].split(",");
                SortedSet object = s.subSet(Integer.parseInt(arrstring3[0]),
                                        Integer.parseInt(arrstring3[1]));
                if (object != null) {
                    System.out.println(object);
                }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
                case "headSet":
                try {
                System.out.println(s.headSet(Integer.parseInt(tokens[1])));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
                case "last":
                try {
                    System.out.println(s.last());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                default:
                break;
            }
        }
    }
}
