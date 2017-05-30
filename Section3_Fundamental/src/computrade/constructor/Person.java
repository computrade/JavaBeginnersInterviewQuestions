package computrade.constructor;

public class Person {
	
	protected String firstName;
	protected String lastName;
	protected int id;
	
	public static void main(String[] args) throws Exception {
		
		Person person = new Person("Yuval","Ishay",1234);
		System.out.println(person);
	
	}
	
	public Person() {
		System.out.println("Person default constructor");
		
	}
	
	public  Person(String firstName) {
		System.out.println("Person one arg constructor");
		this.firstName = firstName;
		
	
	}

	public Person(String firstName, String lastName) {
		System.out.println("Person two arg constructor");
		this.firstName = firstName;
		this.lastName = lastName;
	}	
	

	public Person(String firstName, String lastName, int id) {
		System.out.println("Person three arg constructor");
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
