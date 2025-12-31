package Scanner_class_problems;
import java.util.Scanner;
public class EmpNameIdSal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		System.out.print("Enter Employee Salary: ");
		double sal = sc.nextDouble();
		
		System.out.println("Name of the employee is " +name+ " his employee id is "+id+ " and his Salary is "+(double)sal);

	}

}
