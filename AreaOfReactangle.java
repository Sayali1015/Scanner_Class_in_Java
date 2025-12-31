package Scanner_class_problems;
import java.util.Scanner;
public class AreaOfReactangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length: ");
		int length = scan.nextInt();
		
		System.out.print("Enter width: ");
		int width = scan.nextInt();
		
		double res = length * width;
		System.out.println("Area of Rectangle is: "+ (double)res);
		
		
		
		
		

	}

}
