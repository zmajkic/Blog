
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VerwaltungsInterface sea = new VerwaltungsGruppe1();
		//VerwaltungsGruppe1 sea = new VerwaltungsGruppe1();
	    //VerwaltungsGruppe2 sea = new VerwaltungsGruppe2();
		
		Teilnehmer thomas = new Teilnehmer();
		thomas.setVorname("Thomas");
		thomas.setNachname("Horchem");

		Teilnehmer agata = new Teilnehmer();
		agata.setVorname("Agata");
		agata.setNachname("Rubin-Jung");

		Teilnehmer zeljko = new Teilnehmer();
		zeljko.setVorname("Zeljko");
		zeljko.setNachname("Majkic");

		Teilnehmer thorsten = new Teilnehmer();
		thorsten.setVorname("Thorsten");
		thorsten.setNachname("Lorenz");

		sea.anmelden(thomas);
		sea.anmelden(agata);
		sea.anmelden(zeljko);
		sea.anmelden(thorsten);

		sea.anzahlTeilnehmer();
	//	var teilnehmer = sea.getTeilnehmer(3);
	//	System.out.println(teilnehmer.getVorname() + " " + teilnehmer.getNachname());

	//	sea.abmelden(thomas);
	//	sea.abmelden(agata);
	//	sea.abmelden(zeljko);
	//	sea.abmelden(thorsten);

		for (int i = 0; i < 4; i++) {
			if (sea.getTeilnehmer(i) == null) {
				System.out.println("Teilnehmer " + i + " wurde abgemeldet");
			} else {
			//	System.out.println(sea.getTeilnehmer(i));
				System.out.println(sea.getTeilnehmer(i).getVorname());
			}
		}

	}

}
