
public class F1_Main {
									

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// compare Person1 and Person2
		
		F2_Person person1 = new F2_Person();
		person1.setLastname("Paul");
		
		F2_Person person2 = new F2_Person();
		person2.setFirstname("Paul");
		
		System.out.println("Person1: " + person1);
		System.out.println("Person2: " + person2);
		
		System.out.println("Person1: " + person1.getLastname());
		System.out.println("Person2: " + person2.getFirstname());
		
		
		if(person1 == person2) {
		    System.out.println("person1 and person2 are equal");
		}
		
		if(person1.equals(person2)) {
		    System.out.println("person1 and person2 are the same");
		}
		
		// compare Person3 and Person4
		
				
		F2_Person person3 = new F2_Person();
		person3.setFirstname("Anna");
		person3.setLastname("Mueller");
		
		F2_Person person4 = new F2_Person();
		person4.setFirstname("Anna");
		person4.setLastname("Mueller");
		
		System.out.println("Person1: " + person3);
		System.out.println("Person2: " + person4);
		
		System.out.println("Person3: " + person3.getFirstname() + " " + person3.getLastname());
		System.out.println("Person4: " + person4.getFirstname() + " " + person4.getLastname());
		
		
		if(person3 == person4) {

			
		    System.out.println("person3 and person4 are equal");
		}
		
		if(person3.equals(person4)) {
		    System.out.println("person3 and person4 are the same");
		}
		
		// hashCode	
		
		
		    System.out.println("HashCode Person1: " + person1.hashCode());
		    System.out.println("HashCode Person2: " + person2.hashCode());
		    System.out.println("HashCode Person3: " + person3.hashCode());
		    System.out.println("HashCode Person4: " + person4.hashCode());
		
		
		
		
		
	}
		

	

}
