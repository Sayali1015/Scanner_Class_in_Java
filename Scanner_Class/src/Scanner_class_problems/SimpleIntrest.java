package Scanner_class_problems;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Principle: ");
		int num = scan.nextInt();
		
		System.out.print("Enter Time: ");
		int time =scan.nextInt();
		
		System.out.print("Enter Rate: ");
		double rate = scan.nextDouble();
		
		double res = num * time* (double)rate / 100;
		
		System.out.println("Intrest amount is: "+res);

	}

}
