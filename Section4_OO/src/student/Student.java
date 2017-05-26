package student;

// Student.java - Chapter 14, Java 5 version.

// Copyright 2005 by Jacquie Barker - all rights reserved.

// A MODEL class.


import java.util.ArrayList;
import java.util.Collection;

public class Student extends Person {
	//------------
	// Attributes.
	//------------

	private String major;
	private String degree;
	private Transcript transcript;
	private ArrayList<Section> attends; 
	
	//----------------
	// Constructor(s).
	//----------------

	public Student(String name, String ssn, String major, String degree) {
		// Reuse the code of the parent's constructor.

		super(name, ssn);

		this.setMajor(major);
		this.setDegree(degree);

		// Create a brand new Transcript.

		this.setTranscript(new Transcript(this));

		// Note that we're instantiating empty support Collection(s).

		attends = new ArrayList<Section>();
	}
	
	// A second simpler form of constructor.

	public Student(String ssn) {
		// Reuse the code of the other Student constructor.

		this("TBD", ssn, "TBD", "TBD");
	}

	//------------------
	// Accessor methods.
	//------------------

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDegree() {
		return degree;
	}

	public void setTranscript(Transcript t) {
		transcript = t;
	}

	public Transcript getTranscript() {
		return transcript;
	}

	//-----------------------------
	// Miscellaneous other methods.
	//-----------------------------

	public void display() {
		// First, let's display the generic Person info.

		super.display();
		
		// Then, display Student-specific info.

		System.out.println("Student-Specific Information:");
		System.out.println("\tMajor:  " + this.getMajor());
		System.out.println("\tDegree:  " + this.getDegree());
		this.displayCourseSchedule();
		this.printTranscript();

		// Finish with a blank line.
		System.out.println();
	}	
	
	// We are forced to program this method because it is specified
	// as an abstract method in our parent class (Person); failing to
	// do so would render the Student class abstract, as well.
	//
	// For a Student, we wish to return a String as follows:
	//
	// 	Joe Blow (123-45-6789) [Master of Science - Math]

	public String toString() {
		return this.getName() + " (" + this.getSsn() + ") [" + this.getDegree() +
		       " - " + this.getMajor() + "]";
	}

	public void displayCourseSchedule() {
		// Display a title first.

		System.out.println("Course Schedule for " + this.getName());
		
		// Step through the ArrayList of Section objects, 
		// processing these one by one.

		for (Section s : attends) {
		    // Since the attends ArrayList contains Sections that the
		    // Student took in the past as well as those for which
		    // the Student is currently enrolled, we only want to
		    // report on those for which a grade has not yet been
		    // assigned.
            
                    if (s.getGrade(this) == null) {
			System.out.println("\tCourse No.:  " + 
				s.getRepresentedCourse().getCourseNo());
			System.out.println("\tSection No.:  " + 
				s.getSectionNo());
			System.out.println("\tCourse Name:  " + 
				s.getRepresentedCourse().getCourseName());
			System.out.println("\tMeeting Day and Time Held:  "  +
				s.getDayOfWeek() + " - " +
				s.getTimeOfDay());
			System.out.println("\tRoom Location:  "  +
				s.getRoom());
			System.out.println("\tProfessor's Name:  " +
				s.getInstructor().getName());
			System.out.println("\t-----");
		    }
		}
	}
	
	public void addSection(Section s) {
		attends.add(s);
	}
	
	public void dropSection(Section s) {
		attends.remove(s);
	}
	
	// Determine whether the Student is already enrolled in THIS
	// EXACT Section.

	public boolean isEnrolledIn(Section s) {
		if (attends.contains(s)) return true;
		else return false;
	}
		
	// Determine whether the Student is already enrolled in ANOTHER
	// Section of this SAME Course.

	public boolean isCurrentlyEnrolledInSimilar(Section s1) {
		boolean foundMatch = false;

		Course c1 = s1.getRepresentedCourse();

		for (Section s2 : attends) {
			Course c2 = s2.getRepresentedCourse();
			if (c1 == c2) {
				// There is indeed a Section in the attends()
				// ArrayList representing the same Course.
				// Check to see if the Student is CURRENTLY
				// ENROLLED (i.e., whether or not he has
				// yet received a grade).  If there is no
				// grade, he/she is currently enrolled; if
				// there is a grade, then he/she completed
				// the course some time in the past.
				if (s2.getGrade(this) == null) {
					// No grade was assigned!  This means
					// that the Student is currently
					// enrolled in a Section of this
					// same Course.
					foundMatch = true;
					break;
				}
			}
		}

		return foundMatch;
	}
		
	public void printTranscript() {
		this.getTranscript().display();
	}

	public Collection<Section> getEnrolledSections() {
		return attends;
	}
}
