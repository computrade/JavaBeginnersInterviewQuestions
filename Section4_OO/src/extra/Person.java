package extra;

// Person.java

/**
 * A person is a human being.  We might use a Person to represent a student or a professor
 * in an academic setting. 
 */
public class Person {
    //------------
    // Attributes.
    //------------

    /**
     * A person's legal name.  Typically represented as “FirstName I. LastName”.
     */
    public String name;

    /**
     * A person's age in years.  No matter how imminent a person’s next birthday is,
     * their age will always reflect how old they were at their most recent birthday.
     */
    private int age;

    //-------------
    // Constructors.
    //-------------

    /** 
     * This constructor initializes attributes name and age.
     * @param n The Person's name, in first name - middle initial - last name order.
     * @param a The Person's age.
     */
    public Person(String n, int a) { 
        name = n;    
        age = a;
    }

    /** 
     * This constructor replaces the default parameterless constructor.
     */
    public Person() { 
        name = "?";    
    }

    /** 
     * This method is used to determine a person's age in dog years.
     */
    public double dogYears() {
        return age/7.0;
    }
}

