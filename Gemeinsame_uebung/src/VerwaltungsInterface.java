public interface VerwaltungsInterface {
	
	public boolean anmelden(Teilnehmer einTeilnehmer);
	
	public int anzahlTeilnehmer();
	
	public Teilnehmer getTeilnehmer(int i);
}
