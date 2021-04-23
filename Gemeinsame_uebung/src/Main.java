
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList sea = new VerwaltungsGruppe2();
		//VerwaltungsGruppe1 sea = new VerwaltungsGruppe1();
	    //VerwaltungsGruppe2 sea = new VerwaltungsGruppe2();
		
		Object thomas = new Object();
		thomas.setVorname("Thomas");
		thomas.setNachname("Horchem");

		Object agata = new Object();
		agata.setVorname("Agata");
		agata.setNachname("Rubin-Jung");

		Object zeljko = new Object();
		zeljko.setVorname("Zeljko");
		zeljko.setNachname("Majkic");

		Object thorsten = new Object();
		thorsten.setVorname("Thorsten");
		thorsten.setNachname("Lorenz");

		sea.add(thomas);
		sea.add(agata);
		sea.add(zeljko);
		sea.add(thorsten);

		sea.size();
	//	var teilnehmer = sea.getTeilnehmer(3);
	//	System.out.println(teilnehmer.getVorname() + " " + teilnehmer.getNachname());

	//	sea.abmelden(thomas);
	//	sea.abmelden(agata);
	//	sea.abmelden(zeljko);
	//	sea.abmelden(thorsten);

		System.out.println(sea.size());
		for (int i = 0; i < 4; i++) {
			if (sea.get(i) == null) {
				System.out.println("Teilnehmer " + i + " wurde abgemeldet");
			} else {
			//	System.out.println(sea.getTeilnehmer(i));
				System.out.println(((Object)sea.get(i)).getVorname());
			}
		}

		
		
	}

}
