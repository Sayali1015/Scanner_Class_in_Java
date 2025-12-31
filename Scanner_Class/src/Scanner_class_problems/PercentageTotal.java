package Scanner_class_problems;
import java.util.Scanner;
public class PercentageTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Math Score: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Marathi Score: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter Hindi Score: ");
		int num3 = sc.nextInt();
		
		System.out.print("Enter English Score: ");
		int num4 = sc.nextInt();
		
		System.out.print("Enter Histroy Score: ");
		int num5 = sc.nextInt();
		
		int total = num1+num2+num3+num4+num5;
		double percentage = (total / 500.0) * 100;
		
		System.out.println("============================================");
		System.out.println("Total Credits Earned:" + total);
		System.out.println("Total Percentage: "+ (double)percentage+ "%");	

	}

}
