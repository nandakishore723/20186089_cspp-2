import java.util.Scanner;
public class SumOfNNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("sum = " + sum);
	}
}
