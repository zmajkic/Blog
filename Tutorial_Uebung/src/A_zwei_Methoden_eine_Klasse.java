
public class A_zwei_Methoden_eine_Klasse {											//Methoden/Funktionen und Parameter

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		schreibeText("Hallo ich bin eine Methode");
		summenberechnung(15, 3);
		System.out.println();
	}

	public static void schreibeText(String text) {					//schreibeText Methode, public ohne rückgabe
		System.out.println(text);
	}

	public static int summenberechnung(int zahl1, int zahl2) {		//Summenberechnung Methode, rückgabe int 
		int zahl3 = zahl1 + zahl2;
		return zahl3;

	}

}
