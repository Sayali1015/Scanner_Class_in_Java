package Scanner_class_problems;
import java.util.Scanner;
public class MultiplicationDivision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter Number: ");
		int num2 = scan.nextInt();
		    System.out.println("Enter choice:");
	        System.out.println("1. Multiplication");
	        System.out.println("2. Division");
	        
	        int choice = scan.nextInt();

	        if (choice == 1) {
	        	 System.out.println("Multiplication is: " + (num1 * num2));
	        }
	        else if (choice == 2) {
	        	 System.out.println("Division is: " + (num1 / num2));
	        }
	        else {
	        	 System.out.println("Invaild Choice.");
	        }
	
	}

}
