package PCK1;

public class Person {
	//Global Data Members
	String firstName; 
	String lastName;
	int id;
	
	//Constructors
	public Person() {
		
	}
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		 
	}
	//Membership Functions
	public void displayData() {
		System.out.println("id = " + id);
		System.out.println("Name = " + firstName + " " + lastName +"\n");
	}
}

