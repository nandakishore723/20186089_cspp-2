import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */

/**
 * Class for task.
 */
class Task {
    private String task;
    private String name;
    private int min;
    private boolean important;
    private boolean urgent;
    private String status;
    Task() {

    }
    /**
     * Constructs the object.
     *
     * @param      task       The task
     * @param      name       The name
     * @param      min        The minimum
     * @param      important  The important
     * @param      urgent     The urgent
     * @param      status     The status
     */
    Task(String task, String name, int min, boolean important,
         boolean urgent, String status) throws Exception {
        if (task.equals("")) {
            throw  new Exception("Title not provided");

        } else {
            this.task = task;
        }
        this.name = name;
        if (min >= 0) {
            this.min = min;
        } else {
            throw new Exception("Invalid timeToComplete " + min);
        }

        this.important = important;
        this.urgent = urgent;
        if (status.equals("done") || status.equals("todo")) {
            this.status = status;

        } else {
            throw new Exception("Invalid status " + status);
        }

    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public String task () {
        return task;
    }


    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public String name() {
        return name;
    }


    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public int min() {
        return min;
    }


    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public String important() {
        String s1 = "";
        if (important) {
            s1 = "Important";
        } else {
            s1 = "Not Important";
        }
        return s1;
    }


    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public String urgent() {
        String s2 = "";
        if (urgent) {
            s2 = "Urgent";
        } else {
            s2 = "Not Urgent";
        }
        return s2;


    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public String status() {
        return status;


    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String s2 = "";
        String s1 = "";
        if (urgent) {
            s2 = "Urgent";
        } else {
            s2 = "Not Urgent";
        }
        if (important) {
            s1 = "Important";
        } else {
            s1 = "Not Important";
        }
        String s = task + ", " + name + ", " + min + ", " + s1 + ", " + s2 + ", " + status;
        return s;
    }
}

/**
 * Class for todoist.
 */
class Todoist {

}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            /*case "add-task":
                testAddTask(todo, tokens);
            break;
            case "print-todoist":
                System.out.println(todo);
            break;
            case "get-next":
                System.out.println(todo.getNextTask(tokens[1]));
            break;
            case "get-next-n":
                int n = Integer.parseInt(tokens[2]);
                Task[] tasks = todo.getNextTask(tokens[1], n);
                System.out.println(Arrays.deepToString(tasks));
            break;
            case "total-time":
                System.out.println(todo.totalTime4Completion());
            break;
            */
            default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    /*public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }*/

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
                   title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
