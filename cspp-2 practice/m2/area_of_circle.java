import java.util.*;
public class area_of_circle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("radius:");
        int r = ip.nextInt();
        System.out.println(area(r));
	}
	public static double area(int r) {
		return pi()*r*r;
	}
	public static double pi() {
		return 3.14;
	}
}
