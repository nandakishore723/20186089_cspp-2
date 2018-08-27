public class swap{
	public static void main(String[] args){
		int a = 2;
		int b = 3;
		int temp = 0;
		temp = b;
		b = a;
		a = temp;
		/*int a = 2;
		int b = 3;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;*/
		System.out.println(a + " " + b);
	}
}