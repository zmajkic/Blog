
public class VerwaltungsGruppe2 implements VerwaltungsInterface{

	public int anzahl = 4;

	private Teilnehmer[] liste = new Teilnehmer[anzahl];

	public boolean anmelden(Teilnehmer einTeilnehmer) {
		for (int i = 0; i < anzahl; i++) {
			if (liste[i] == null) {
				liste[i] = einTeilnehmer;

				// System.out.println(i);
				// System.out.println(liste[i]);
				return true;
			}
		}

		// System.out.println("false");
		return false;
	}

	public int anzahlTeilnehmer() {
		for (int i = 0; i < anzahl; i++) {
			if (liste[i] == null) {

				// System.out.println(i);
				return i;
			}

		}
		// System.out.println(anzahl);
		return anzahl;
	}

	public Teilnehmer getTeilnehmer(int i) {
		if (liste[i] == null) {
			return null;
		}

		// System.out.println(liste[i]);
		return liste[i];

	}

	public boolean abmelden(Teilnehmer einTeilnehmer) {
		int derLetzte = 0;
		for (int j = 0; j < anzahl; j++) {
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

		for (int i = 0; i < anzahl; i++) {
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
