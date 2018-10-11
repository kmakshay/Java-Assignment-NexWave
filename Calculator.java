import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter the two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(
				"Enter the operation(1.Addition 2.Subtraction 3.Multiplication 4.Division)Please enter a number");
		int choice = scan.nextInt();
		switch (choice) {
		case 1: {
			int sum = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
			break;
		}
		case 2: {
			int diff = num1 - num2;
			System.out.println("The difference between " + num1 + " and " + num2 + " is " + diff);
			break;

		}
		case 3: {
			int product = num1 * num2;
			System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
			break;
		}
		case 4: {
			int div = num1 / num2;
			System.out.println("The division of " + num1 + " and " + num2 + " is " + div);
			break;
		}
		default: {
			System.out.println("Please enter a number between 1 and 4");
			break;
		}
		}

	}

}
