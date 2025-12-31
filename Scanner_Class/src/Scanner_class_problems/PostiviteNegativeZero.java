package Scanner_class_problems;
import java.util.Scanner;
public class PostiviteNegativeZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num = scan.nextInt();
		 if (num > 0) {
			 System.out.println(num+ " is a Positive Number.");
		 }else if (num < 0) {
			 System.out.println(num+ " is a Negative Number."); 
		 }else {
			 System.out.println(num+ " is a Zero Number.");
		 }
	}
	}


