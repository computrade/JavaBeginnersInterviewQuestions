package student;

// Professor.java - Chapter 14, Java 5 version.

// Copyright 2005 by Jacquie Barker - all rights reserved.

// A MODEL class.


import java.util.ArrayList;

public class Professor extends Person {
	//------------
	// Attributes.
	//------------

	private String title;
	private String department;
	private ArrayList<Section> teaches; 

	//----------------
	// Constructor(s).
	//----------------

	public Professor(String name, String ssn, String title, String dept) {
		// Reuse the parent constructor with two arguments.

		super(name, ssn);

		setTitle(title);
		setDepartment(dept);

		// Note that we're instantiating empty support Collection(s).

		teaches = new ArrayList<Section>();
	}
		
	//----------------
	// Accessor methods.
	//----------------

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setDepartment(String dept) {
		department = dept;
	}

	public String getDepartment() {
		return department;
	}

	//-----------------------------
	// Miscellaneous other methods.
	//-----------------------------

	public void display() {
		// First, let's display the generic Person info.

		super.display();
		
		// Then, display Professor-specific info.

		System.out.println("Professor-Specific Information:");
		System.out.println("\tTitle:  " + getTitle());
		System.out.println("\tTeaches for Dept.:  " + getDepartment());
		displayTeachingAssignments();

		// Finish with a blank line.

		System.out.println();
	}
	
	// We are forced to program this method because it is specified
	// as an abstract method in our parent class (Person); failing to
	// do so would render the Professor class abstract, as well.
	//
	// For a Professor, we wish to return a String as follows:
	//
	// 	Josephine Blow (Associate Professor, Math)

	public String toString() {
		return getName() + " (" + getTitle() + ", " +
		       getDepartment() + ")";
	}

	public void displayTeachingAssignments() {
		System.out.println("Teaching Assignments for " + getName() + ":");
		
		// We'll step through the teaches ArrayList, processing
		// Section objects one at a time.

		if (teaches.size() == 0) {
			System.out.println("\t(none)");
		}

		else for (Section s : teaches) {
			// Note how we call upon the Section object to do
			// a lot of the work for us!

			System.out.println("\tCourse No.:  " +
				s.getRepresentedCourse().getCourseNo());
			System.out.println("\tSection No.:  " + 
				s.getSectionNo());
			System.out.println("\tCourse Name:  " +
				s.getRepresentedCourse().getCourseName());
			System.out.println("\tDay and Time:  " +
				s.getDayOfWeek() + " - " + 
				s.getTimeOfDay());
			System.out.println("\t-----");
		}
	}
	
	public void agreeToTeach(Section s) {
		teaches.add(s);

		// We need to link this bidirectionally.

		s.setInstructor(this);
	}
}
