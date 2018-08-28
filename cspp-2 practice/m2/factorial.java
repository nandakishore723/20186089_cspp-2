import java.util.*;
public class factorial{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Give a Value:");
		int n = ip.nextInt();
		System.out.println(fact(n));
	}
	public static int fact(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
}
