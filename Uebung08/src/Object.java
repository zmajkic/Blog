public class Object {
	
	private String vorname;
	private String nachname;
	
	//set variable
	public void setVorname(String vorname) {
	    this.vorname = vorname;
	}
	
	public void setNachname(String nachname) {
	    this.nachname = nachname;
	}
	
	//get variable
	public String getVorname() {
		return this.vorname;
	}
	
	public String getNachname() {
		return this.nachname;
	}
	
	//equals
	public boolean equals(Object p) {
		if (p == null) {
			System.out.println("Übergebene Person ist null");
			return false;
		}
		if (this == p) {
			System.out.println("Beide Objekte haben die selbe Referenz: " + this);
			return true;
		}
		if (this.vorname == p.getVorname() && this.nachname == p.getNachname()) {
			System.out.println("Die Klasse " + this + " und die Klasse " + p + " sind Inhaltlich gleich!");
			return true;
		} else {
			System.out.println("Die Klasse " + this + " und die Klasse " + p + " sind verschieden!");
			return false;
		}
	}
}