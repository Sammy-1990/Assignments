import java.util.Scanner;

class SumofNum {

    static void sum() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers is " + sum);

    }

    public static void main(String args[]) {
        SumofNum.sum();
    }
}