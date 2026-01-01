package Scanner_class_problems;
import java.util.Scanner;
public class PassFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Marks: ");
		
		double marks = scan.nextDouble();
		if (marks < 35.0) {
			System.out.println("Fail");
		}else {
			System.out.println("Pass");
		}
	}

}
