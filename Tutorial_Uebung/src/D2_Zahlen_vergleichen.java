public class D2_Zahlen_vergleichen { 

	int i;
	
		
	boolean equals(D2_Zahlen_vergleichen z) {
		if (this.i == z.i) {
			System.out.println("Die Zahlen sind gleich" + i);
			return true;
		} else {
			System.out.println("Die zahlen sind ungleich " + i);
			return false;
		}
	}

}
