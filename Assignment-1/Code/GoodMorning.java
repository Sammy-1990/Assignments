import java.util.Scanner;

public class GoodMorning {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number between 5 and 12: ");
		int time = scanner.nextInt();

		if (time > 5 && time < 12) {
			System.out.println("Good Morning");
		} else {
			System.out.println("NA");
		}	

		scanner.close();
	}
}