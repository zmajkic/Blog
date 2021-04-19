import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		Scanner myInput = new Scanner(System.in);
		int a;
		int b;
		int sum;
		int i = 0;
		System.out.print("Enter first integer: ");
		a = myInput.nextInt();
		System.out.print("Enter second integer: ");
		b = myInput.nextInt();
		sum = a + b;
		System.out.printf("Sum = %d\n", sum);

		sum = a - b;
		System.out.printf("Sub = %d\n", sum);

		sum = a / b;
		System.out.printf("Div = %d\n", sum);

		sum = a * b;
		System.out.printf("Mul = %d\n", sum);

		System.out.println((a < b) ? "a is less than b" : "b is greater or equal a");

		System.out.println((a == b) ? "a is equal to b" : "a is not equal b");

		System.out.println("Eclipse geht?");

	}
}