import java.util.*;
public class degrees_to_fahrenheit{
	public static void main(String[] args){
		double degrees, fahrenheit;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in degrees:");
        fahrenheit = s.nextDouble();
        fahrenheit = degrees+32/(0.5556);
        System.out.println("Temperature in degrees:"+degrees);
	}
}
