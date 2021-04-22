import java.util.Scanner;

public class B_Zweite_Uebung_Scanner { // Methoden/Funktionen und Parameter

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double zahl1, zahl2, ergebnis;
		Scanner scannerVariable = new Scanner(System.in);
	

		
		
		System.out.println("Erste Zahl bitte.");
		zahl1=scannerVariable.nextDouble();
		System.out.println("Zweite Zahl bitte.");
		zahl2=scannerVariable.nextDouble();
		ergebnis=zahl1+zahl2;
		System.out.println("Das Ergebnis ist: " + ergebnis);
		
		scannerVariable.close();	//Scanner Variable wieder schließen
		

	}

}
