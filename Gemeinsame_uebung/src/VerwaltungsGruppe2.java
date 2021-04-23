import java.util.Arrays;

public class VerwaltungsGruppe2 implements MyList {

	public int arraylaenge = 4;                       // gesamte ArrayLaenge
	public int count = 0;                             // Anzahl der angemeldeten Objekte
	private Object[] liste = new Object[arraylaenge]; // Array liste erstellen   arraylaenge4 -> String0,1,2,3

	
	
	
	public boolean add(Object einTeilnehmer) {         // add Methode
		if (count < arraylaenge) {
			liste[count] = einTeilnehmer;              // belege den ersten freien Platz 
			count++;
			return true;
		} else {
			return false;
		}

	}

	
	public int size() {                                // size gibt aus wieviele angemeldet sind
		return count;
	}

	
	
	
	public Object get(int i) {                         // gibt einen Wert zurück wenn innerhalb der ArrayLänge

		if (i < arraylaenge) {
			return liste[i];
		} else
			return null;
	}

	
		
	
	public boolean remove(Object obj) {                // 
if (count == 0) {
	
	return false;
	
}
		for (int i = 0; i < count - 1; i++) {          // weil count bei 1 anfängt und array bei 0 -1 
                                                        
			if (obj == liste[i]) {                     
				liste[i] = liste[count - 1];
				liste[count - 1] = null;
				count--;
				return true;
			} 
<<<<<<< Upstream, based on branch 'main' of git@github.com:zmajkic/Blog.git

=======
		}
			if (obj==liste[count-1]) {
				liste[count-1]=null;
				count--;
				return true;
			
>>>>>>> 8342fe5 pruefung wenn leer
		}
		return false;
	}
	
}
