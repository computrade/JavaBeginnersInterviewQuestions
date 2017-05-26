package collection;

public class Student {
	private String idNo;
	private String name;

	public Student(String i, String n) {
		idNo = i;
		name = n;
	}

	public Student(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public String getIdNo() {
		return idNo;
	}
}
