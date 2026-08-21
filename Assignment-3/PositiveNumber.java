import java.util.Scanner;

class PositiveNumber{
	static void positive() {
		Scanner sc = new Scanner(System.in);
		int num1;
		do{
			System.out.println("Enter the number");
			num1 = sc.nextInt();
		}
		while(num1<=0);
		System.out.println("Enter number is " + num1);
	}
	
	public static void main(String args[]) {
		PositiveNumber.positive();
	}
}