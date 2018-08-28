import java.util.*;
public class bigger_equal_smaller {
	public static void main(String[] args) {

		int varA, varB;
		System.out.print("Enter the value of varA:");
		Scanner ip = new Scanner(System.in);
		varA = ip.nextInt();
		System.out.print("Enter the value of varB:");
		varB = ip.nextInt();
		if (varA > varB) {
			System.out.println("Bigger");
		}
		else if (varA == varB) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Smaller");
		}
	}
}
