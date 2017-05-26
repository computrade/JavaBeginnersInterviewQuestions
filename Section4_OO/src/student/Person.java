package student;

// Person.java - Chapter 14, Java 5 version.

// Copyright 2005 by Jacquie Barker - all rights reserved.

// A MODEL class.


// We are making this class abstract because we do not wish for it
// to be instantiated.

public abstract class Person {
	//------------
	// Attributes.
	//------------

	private String name;
	private String ssn;
	
	//----------------
	// Constructor(s).
	//----------------

	public Person(String name, String ssn) {
		this.setName(name);
		this.setSsn(ssn);
	}

        public Person() {
		this.setName("?");
		this.setSsn("???-??-????");
        }
	
	//------------------
	// Accessor methods.
	//------------------

	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSsn(String s) {
		ssn = s;
	}
	
	public String getSsn() {
		return ssn;
	}

	//-----------------------------
	// Miscellaneous other methods.
	//-----------------------------

	// We'll let each subclass determine how it wishes to be
	// represented as a String value.

	public abstract String toString(); 

	public void display() {
		System.out.println("Person Information:");
		System.out.println("\tName:  " + this.getName());
		System.out.println("\tSoc. Security No.:  " + this.getSsn());
	}
}	
