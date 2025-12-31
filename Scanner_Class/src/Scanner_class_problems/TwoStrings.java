package Scanner_class_problems;
import java.util.Scanner;
public class TwoStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Personal Details : ");
		String sent1= scan.nextLine();
		
		System.out.println("Enter Address: ");
		String sent2 = scan.nextLine();
		
		System.out.println(sent1+" "+sent2);

	}

}
