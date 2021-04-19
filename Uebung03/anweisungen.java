import java.util.Scanner;

public class anweisungen {
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

		if (a > b) {
			System.out.println(a + " is greater than " + b);
		}

		else {
			System.out.println(a + " is less as " + b);
		}

		// ternary operator - Bedingter (ternärer) Operator

		var elvisLives = a > b ? "Yep" : "Nope";
		System.out.println("Elvis lives? " + elvisLives);

		// for
		for (int i2 = 0; i2 < 5; i2++)
		{
			System.out.println(i2);
		}

		// while
		int i3 = 0;
		while (i3 < 10) {
			System.out.println(i3);
			i3++;
		}

	}
}