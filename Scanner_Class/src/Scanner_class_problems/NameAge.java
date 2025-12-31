package Scanner_class_problems;
import java.util.Scanner;
public class NameAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("Name is "+ name + " and Age is "+age);
		
		

	}

}
