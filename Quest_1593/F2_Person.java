
public class F2_Person {

	private String Firstname;
	private String Lastname;

	public void setFirstname(String aFirstname) {
		this.Firstname = aFirstname;

	}

	public void setLastname(String aLastname) {
		this.Lastname = aLastname;

	}

	public String getFirstname() {
		return this.Firstname;

	}

	public String getLastname() {
		return this.Lastname;

	}

	public boolean equals(F2_Person p) {

		if (Firstname == p.getFirstname() && Lastname == p.getLastname()) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Firstname == null) ? 0 : Firstname.hashCode());
		result = prime * result + ((Lastname == null) ? 0 : Lastname.hashCode());
		return result;
	}

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		F2_Person other = (F2_Person) obj;
		if (Firstname == null) {
			if (other.Firstname != null)
				return false;
		} else if (!Firstname.equals(other.Firstname))
			return false;
		if (Lastname == null) {
			if (other.Lastname != null)
				return false;
		} else if (!Lastname.equals(other.Lastname))
			return false;
		return true;
	} */

}
