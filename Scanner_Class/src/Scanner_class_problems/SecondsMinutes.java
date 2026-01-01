package Scanner_class_problems;
import java.util.Scanner;
public class SecondsMinutes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Time in Seconds: ");
		
		int totalSeconds = scan.nextInt();
		int minutes = totalSeconds / 60;
		int seconds = totalSeconds % 60;
		
		System.out.println("Time = " + minutes + " minutes " + seconds + " seconds");
		

	}

}
