package Scanner_class_problems;
import java.util.Scanner;
public class Perimeter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Side: ");
		int side1 = scan.nextInt();
		
		System.out.println("Enter Second Side: ");
		int side2 = scan.nextInt();
		
		System.out.println("Enter Third Side: ");
		int side3 = scan.nextInt();
		
		int res = side1+side2+side3;
		System.out.println("Perimeter of the Triangle is: "+ res);
		
		
	}

}
