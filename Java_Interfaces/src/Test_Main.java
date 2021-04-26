
public class Test_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Webshop w0 = new Webshop ("Shop 0", new PayPal());
		Webshop w1 = new Webshop ("Shop 1", new EC());
		Webshop w2 = new Webshop ("Shop 2", new Kreditkarte());
		w0.zahlen();
		w1.zahlen();
		w2.zahlen();
		
		
	}

	
}
