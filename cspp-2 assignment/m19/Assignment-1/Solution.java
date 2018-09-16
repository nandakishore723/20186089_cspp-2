import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
      * Constructs the object.
      */
    private Solution() {
        // leave this blank
    }
    class Quiz {
    	private String question;
    	private String[] choice;
    	private String correctanswer;
    	private String marks;
    	private String penalty;
    	Quiz(String question, String[] choice, String correctanswer, String marks, String penalty){
    		this.question = question;
    		this.choice = choice;
    		this.correctanswer = correctanswer;
    		this.marks = marks;
    		this.penalty = penalty;
    	}
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    static Quiz[] quizlist;
	static int qsize;
	static int tokensize = 0;
	public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
		// write your code here to read the questions from the console
		// tokenize the question line and create the question object
		// add the question objects to the quiz class
		quizlist = new Quiz[20];
		qsize = 0;
		for (int i = 0; i < questionCount; i++) {
			String[] questoken = s.nextLine().split(":");
			tokensize = questoken.length;
			String[] choice = questoken[1].split(",");
			if (tokensize == 5) {
				if (choice.length >= 2) {
					quizlist[qsize++] = new Quiz(choice, Integer.parseInt(questoken[2]), Integer.parseInt(questoken[3]), Integer.parseInt(questoken[4]));
				} else {
					System.out.println("invalid");
				}
			}
		}
		if (qsize > 0) {
			System.out.println(qsize + " are added to the quiz");

		} else {
			if (tokensize != 5) {
				System.out.println("Quiz does not have questions");
			} else {

				System.out.println("Error! Malformed question");
			}
		}
	}


    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}
