import java.util.Arrays;

public class VerwaltungsGruppe2 implements MyList {

	public int arraylaenge = 4;
	public int count = 0;
	private Object[] liste = new Object[arraylaenge];

	public boolean add(Object einTeilnehmer) {
		if (count < arraylaenge) {
			liste[count] = einTeilnehmer;
			count++;
			return true;
		} else {
			return false;
		}

		/*
		 * for (int i = 0; i < arraylaenge; i++) { if (liste[i] == null) { liste[i] =
		 * einTeilnehmer; count++; // System.out.println(i); //
		 * System.out.println(liste[i]); return true; } }
		 * 
		 * // System.out.println("false"); return false;
		 */
	}

	public int size() {
		return count;
	}

	public Object get(int i) {
		/*
		 * if (liste[i] == null) { return null; }
		 */
		// System.out.println(liste[i]);
		// System.out.println(Arrays.toString(liste));
		if (i < arraylaenge) {
			return liste[i];
		} else
			return null;
	}

	public boolean remove(Object obj) {

		for (int i = 0; i < count -2; i++) {
			

			if (obj == liste[i]) {
				liste[i] = liste[count-1];
				liste[count-1] = null;
				count--;
				return true;

			}
			
	
				
				
				
			}
			return false;
		}
	

	/*
	 * public boolean remove(Object object) {
	 * 
	 * /* int derLetzte = 0; for (int j = 0; j < arraylaenge; j++) { if (liste[j] ==
	 * null) { derLetzte = j - 1; System.out.println(derLetzte); break; }else {
	 * derLetzte = j; } }
	 * 
	 * if (derLetzte < 0) { return false; }
	 */
	/*
	 * for (int i = 0; i < arraylaenge; i++) { if (object == liste[i]) { liste[i] =
	 * null; count--; return true; // System.out.println(liste[i] +
	 * " wurde Abgemeldet");
	 */

	// liste[i] = liste[derLetzte]; liste[derLetzte] = null; return true;

	/*
	 * }
	 * 
	 * } return false;
	 * 
	 * }
	 * 
	 */

}
