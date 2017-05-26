package student;

// ScheduleOfClasses.java - Chapter 14, Java 5 version.

// Copyright 2005 by Jacquie Barker - all rights reserved.

// A MODEL class.


import java.util.ArrayList;
import java.util.HashMap;

public class ScheduleOfClasses {
	//------------
	// Attributes.
	//------------

	private String semester;

	// This HashMap stores Section object references, using
	// a String concatenation of course no. and section no. as the
	// key, e.g., "MATH101 - 1".

	private HashMap<String, Section> sectionsOffered; 

	//----------------
	// Constructor(s).
	//----------------

	public ScheduleOfClasses(String semester) {
		setSemester(semester);
		
		// Note that we're instantiating empty support Collection(s).

		sectionsOffered = new HashMap<String, Section>();
	}

	//------------------
	// Accessor methods.
	//------------------

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSemester() {
		return semester;
	}

	public HashMap<String, Section> getSectionsOffered() {
		return sectionsOffered;
	}

	//-----------------------------
	// Miscellaneous other methods.
	//-----------------------------

	public void display() {
		System.out.println("Schedule of Classes for " + getSemester());
		System.out.println();

		// Iterate through all the values in the HashMap.

		for (Section s : sectionsOffered.values()) {
			s.display();
			System.out.println();
		}
	}

	public void addSection(Section s) {
		// We formulate a key by concatenating the course no.
		// and section no., separated by a hyphen.

		String key = s.getRepresentedCourse().getCourseNo() + 
			     " - " + s.getSectionNo();
		sectionsOffered.put(key, s);

		// Bidirectionally link the ScheduleOfClasses back to the Section.

		s.setOfferedIn(this);
	}

	// The full section number is a concatenation of the
	// course no. and section no., separated by a hyphen;
	// e.g., "ART101 - 1".

	public Section findSection(String fullSectionNo) {
		return sectionsOffered.get(fullSectionNo);
	}

	public boolean isEmpty() {
		if (sectionsOffered.size() == 0) return true;
		else return false;
	}
}
