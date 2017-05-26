package extra;

import java.util.*;

public class Course {
	private String name;
	private ArrayList<Student> enrolledStudents;
	private GradeBook gradeBook;

	public Course(String name) {
		this.name = name;
		enrolledStudents = new ArrayList<Student>();
		gradeBook = new GradeBook();
	}

	public String getGrade(Student s) {
		// Delegation.
		return gradeBook.getGrade(s);
	}

	// An inner class.  The symbol "GradeBook" is only 
	// recognized by the compiler within the scope of
	// the Course class; we can't reference GradeBook
	// objects anywhere else.
	class GradeBook {
		// For every Student, we store a grade as
		// a String value:  e.g., "B+".
		private HashMap<Student, String> grades;

		// Constructor.
		public GradeBook() {
			grades = new HashMap<Student, String>();
			// etc.
		}

		// Other methods.

		public void assignGrade(Student s, String grade) {
			grades.put(s, grade);
		}

		public String getGrade(Student s) {
			return grades.get(s);
		}
	}
}
