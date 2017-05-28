package computrade.constructor;

public class PersonForConstSample {
	
	private String firstName;
	private String lastName;
	private int id;
	
	public static void main(String[] args) throws Exception {
		
		PersonForConstSample person = new PersonForConstSample();
		System.out.println(person);
		PersonForConstSample person1 = new PersonForConstSample("Yuval");
		System.out.println(person1);
		PersonForConstSample person2 = new PersonForConstSample("Yuval","Ishay");
		System.out.println(person2);
		PersonForConstSample person3 = new PersonForConstSample("Yuval","Ishay",1234);
		System.out.println(person3);
	
	}
	
	public PersonForConstSample() {
	
		
	}
	
	public  PersonForConstSample(String firstName) throws Exception {
		
		this.firstName = firstName;
		throw new Exception("from a constructor");
	
	}
	
	public String PersonForConstSample(String firstName) {
		
		this.firstName = firstName;
		return firstName;
	}



	public PersonForConstSample(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

	public PersonForConstSample(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonForConstSample [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
