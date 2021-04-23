
public class Webshop {

	private String name = null;
	private IZahlung zahlungsart = null;
	
	
	
	public Webshop(String name, IZahlung iz) {
		this.name = name;
		this.zahlungsart = iz;

	}
	
	
	
	
	public void zahlen() {
		System.out.printf(name + " ");
		zahlungsart.erzeugeZahlung();

	}
	
	
	
	
	

}
