import java.util.Scanner;
	
class SumOfTwoNumbers{

	static int sumOfTwoNumbers(int a, int b) {
	int sum = a + b;
	return sum;
	}
		
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int firstNumber = sc.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = sc.nextInt();

		int result = sumOfTwoNumbers(firstNumber, secondNumber);

		System.out.println(
			"The sum of " + firstNumber + " and " + secondNumber + " is " + result
		);
		
	}	
	
}