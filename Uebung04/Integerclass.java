import java.util.Scanner;

public class Integerclass {
	public static void main(String args[]) {
		Scanner myInput = new Scanner(System.in);
		int a;
		int b;
		int summe;

		System.out.print("Enter first integer: ");
		a = myInput.nextInt();
		System.out.print("Enter second integer: ");
		b = myInput.nextInt();

		summe = (a + b);
		System.out.printf(a + " + " + b);
		System.out.println(" = " + summe);
		
		
		
		
		

	}
}