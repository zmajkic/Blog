public class E2_Zahlen_vergleichen2 { 

	
	boolean zvergleich(int z, int i) {
		if (i == z) {
			System.out.println("Die Zahlen sind gleich" + i);
			return true;
		} else {
			System.out.println("Die zahlen sind ungleich " + i);
			return false;
		}
	}

}
