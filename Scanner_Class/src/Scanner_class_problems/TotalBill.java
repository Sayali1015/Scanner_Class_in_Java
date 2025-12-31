package Scanner_class_problems;
import java.util.Scanner;
public class TotalBill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Product Name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter the Prize: ");
		int prize = scan.nextInt();
		
		System.out.println("Enter the Quantity: ");
		int totalQuan = scan.nextInt();
		
		int totalbill = prize*totalQuan;
		
		System.out.println("===========================================================");
		System.out.println("Total Bill is: "+totalbill);
		
		

	}

}
