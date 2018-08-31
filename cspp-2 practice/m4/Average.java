import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int a[] = new int[n];
		float avg = 0;
		for (int i = 0; i < n; i++) {
			a[i] = ip.nextInt();
			avg = avg + a[i];
		}
		System.out.println(avg/n);
	}
}
