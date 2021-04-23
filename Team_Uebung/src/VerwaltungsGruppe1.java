
public class VerwaltungsGruppe1 implements MyList{
	
	private Object[] listeDerTeilnehmer = new Object[15];
	private int count = 0;
	
		public boolean add(Object p) {
		boolean result = false;
		//Duplicate check
		for (int i = 0; i< listeDerTeilnehmer.length; i++) {
			if (p!= null) { // equals nur möglich, wenn p nicht null ist
				if (p.equals(listeDerTeilnehmer[i])) {
					return false;
				}
			}
		}
		//insert new participant at the first free cell
		//the first free cell is defined by the number of saved participants,
		//not by the first cell with null
		if (count < listeDerTeilnehmer.length) {
			listeDerTeilnehmer[count]=p;
			count++;
			result=true;
		}
		return result;
	}
		
	public boolean remove(Object p) {
		boolean result = false;
		for (int i = 0; i< listeDerTeilnehmer.length; i++) {
			if (listeDerTeilnehmer[i] == p) {
				listeDerTeilnehmer[i] = null;
				count--;
				result = true;
				//all cells after i must shift 1 left
				for (int j = i+1; j < listeDerTeilnehmer.length; j++) {
					listeDerTeilnehmer[j-1] = listeDerTeilnehmer[j];  
				}
			}
		}
		return result;
	}

	public Object get(int index) {
		if (index < this.listeDerTeilnehmer.length && index >=0) {
			return this.listeDerTeilnehmer[index];
		} else {
			return null;
		}
	}
	
	public Object[] getAll() {

		Object[] result = new Object[count];
		for (int i = 0; i< listeDerTeilnehmer.length; i++) {
			if (listeDerTeilnehmer[i] != null) {
				for (int j = 0; j< result.length; j++) {
					if (result[j] == null) {
						result[j] = listeDerTeilnehmer[i];
					}
				}
			}	
		}
		return result;
	}
	
	public int size() {
		return this.count;
	}
	
	public void clear() {
		//TODO
	}
	public boolean contains(Object p) {
		//TODO
		return false;
	}
	public int indexOf(Object p) {
		//TODO
		return -1;
	}	
}
