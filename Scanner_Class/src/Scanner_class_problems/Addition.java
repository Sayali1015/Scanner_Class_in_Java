package Scanner_class_problems;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = scan.nextInt();
		
		int res = num1+num2;
		System.out.println("Addition is: "+ res);

	}

}
