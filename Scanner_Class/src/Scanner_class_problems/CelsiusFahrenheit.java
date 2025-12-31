package Scanner_class_problems;
import java.util.Scanner;
public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius: " );
		double celsius = scan.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("Temperature in Fahrenheit " + fahrenheit+ "°F");	
	}

}
