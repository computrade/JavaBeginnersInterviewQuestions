package student;

// EnrollmentStatus.java - Chapter 14, Java 5 version.

// Copyright 2005 by Jacquie Barker - all rights reserved.

// A SUPPORT enum.


// Used by the Section class to represent various possible outcomes of
// an attempt to enroll by a Student.

public enum EnrollmentStatus {
	// Enumerate the values that the enum can assume.
	success("Enrollment successful!  :o)"), 
	secFull("Enrollment failed;  section was full.  :op"), 
	prereq("Enrollment failed; prerequisites not satisfied.  :op"), 
	prevEnroll("Enrollment failed; previously enrolled.  :op");

	// This represents the value of an enum instance.
	private final String value;

	// A "constructor" of sorts (used above).
	EnrollmentStatus(String value) {
		this.value = value;
	}

	// Accessor for the value of an enum instance.
	public String value() {
		return value;
	}
}
