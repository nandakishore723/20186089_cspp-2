public class swap{
	public static void main(String[] args){
		/*int a, b, temp;
		a = b;
		b = temp;
		temp = a;*/
		int a = 2;
		int b = 3;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);
	}
}