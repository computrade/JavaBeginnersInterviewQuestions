package computrade.constructor;

public class Student extends Person {

	String degree;

	public static void main(String[] args) throws Exception {

		Student student = new Student("Yuval", "Ishay", 1234, "Bachelor of Science");
		System.out.println(student);

	}

	public Student(String firstName, String lastName, int id, String degree) {
		super(firstName,  lastName,  id);
		System.out.println("Student four arg constructor");
		this.degree = degree;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [degree=");
		builder.append(degree);
		builder.append(" ,");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
