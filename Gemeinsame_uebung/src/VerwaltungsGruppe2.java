
public class VerwaltungsGruppe2 implements MyList{

	public int arraylaenge = 4;
	public int count = 0;
	private Object[] liste = new Object[arraylaenge];

	public boolean add(Object einTeilnehmer) {
		for (int i = 0; i < arraylaenge; i++) {
			if (liste[i] == null) {
				liste[i] = einTeilnehmer;
				count++;
				// System.out.println(i);
				// System.out.println(liste[i]);
				return true;
			}
		}

		// System.out.println("false");
		return false;
	}

	public int size() {
		return count;
	}

	public Object get(int i) {
		if (liste[i] == null) {
			return null;
		}

		// System.out.println(liste[i]);
		return liste[i];

	}

	public boolean abmelden(Object einTeilnehmer) {
		int derLetzte = 0;
		for (int j = 0; j < arraylaenge; j++) {
			if (liste[j] == null) {
				derLetzte = j - 1;
				System.out.println(derLetzte);
				break;
			}else {
				derLetzte = j;
			}
		}

		if (derLetzte < 0) {
			return false;
		}

		for (int i = 0; i < arraylaenge; i++) {
			if (einTeilnehmer == liste[i]) {

				// System.out.println(liste[i] + " wurde Abgemeldet");

				liste[i] = liste[derLetzte];
				liste[derLetzte] = null;
				return true;

			}

		}
		return false;

	}

}
