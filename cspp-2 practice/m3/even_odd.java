import java.util.Scanner; 
public class even_odd {
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		if (n % 2 == 0) {
			System.out.println("The Even Number is:" + n);
		}
		else {
			System.out.println("It's odd Number");
		}
	}
}
