import java.util.*;
public class quotient_remainder{
	public static void main(String[] args){
		float quotient = 0;
		float remainder = 0;
		System.out.println("enter the values of a and b:");
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		int b = ip.nextInt();
		quotient = a/b;
		remainder = a%b;
		System.out.println("quotient ="+quotient +"  "+ "remainder ="+remainder);
	}
}