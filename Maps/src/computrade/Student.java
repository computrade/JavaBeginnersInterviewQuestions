package computrade;

public class Student {
	private Integer studentID;
	private String name;
	
	public Student(Integer studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public Student( String name) {
		this.name = name;
	}
	
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentID=").append(studentID).append(", name=").append(name).append("]");
		return builder.toString();
	}

	
}
