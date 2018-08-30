import java.util.Scanner;
public class FirstLast6 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ip.nextInt();
		}
		if (a[0] == 6)
			System.out.println(true);
		else if (a[a.length-1] == 6)
			System.out.println(true);
		else 
			System.out.println(false);
	}
}
