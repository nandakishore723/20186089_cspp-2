import java.util.*;
public class degrees_to_fahrenheit{
	public static void main(String[] args){
		double fahrenheit = 0;
		Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in degrees:");
        double degrees = s.nextDouble();
        fahrenheit = (degrees*1.8)+32;
        System.out.println("Temperature in fahrenheit:"+fahrenheit);
	}
}
