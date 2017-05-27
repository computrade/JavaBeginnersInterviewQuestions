package computrade.constructor;

public class PersonForConstSample {
	
	private String firstName;
	private String lastName;
	private int id;
	
	public static void main(String[] args) {
		
		PersonForConstSample person = new PersonForConstSample();
		System.out.println(person);

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
