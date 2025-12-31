package Scanner_class_problems;
import java.util.Scanner;
public class SquareCube {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Side 1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter Side 2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Enter Side 3: ");
		int num3 = scan.nextInt();
		
		System.out.println("Enter Choice: ");
		System.out.println("1. Square ");
		System.out.println("2. Cube ");
		
		int choice = scan.nextInt();
		if (choice == 1) {
			int square = num1 * num2;

				System.out.println("Its a Square and it's area is: "+ square); 	
		}
			else if (choice == 2) {
				int cube = num1 * num2* num3;
				
					System.out.println("Its a Cube and it's area is: "+ cube); 	
				
			}	
	}

}
