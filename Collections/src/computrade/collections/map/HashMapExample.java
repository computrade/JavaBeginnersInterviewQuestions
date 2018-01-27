package computrade.collections.map;
import java.util.Hashtable;

import computrade.Student;

public class HashMapExample {
    public static void main(String[] args) {
        // Instantiate a HashMap with String as the key type and Student as
        // the object type.
        Hashtable<Integer, Student> students = new Hashtable<Integer, Student>();

        // Instantiate three Students; the constructor arguments are 
        // used to initialize Student attributes studentIdNo and studentName,
        // respectively, which are both declared to be Strings.
        Student s1 = new Student(12345, "Fred");
        Student s2 = new Student(98765, "Barney");
        Student s3 = new Student(71024, "Wilma");

        // Insert all three Students into the HashMap.
        students.put(s1.getStudentID(), s1);
        students.put(s2.getStudentID(), s2);
        students.put(s3.getStudentID(), s3);

        // Retrieve a Student based on a particular (valid) ID.
        String id = "98765";
        System.out.println("Let's try to retrieve a Student with ID = " + id);
        Student x = students.get(id);
        if (x != null) System.out.println("Found!  Name = " + x.getName());
        else System.out.println("Invalid ID:  " + id);
        System.out.println();

        // Try an invalid ID.
        id = "00000-00";
        System.out.println("Let's try to retrieve a Student with ID = " + id);
        x = students.get(id);
        if (x != null) System.out.println("Found!  Name = " + x.getName());
        else System.out.println("Invalid ID:  " + id);
        System.out.println();

        // Iterate through the HashMap to process all Students.
        for (Student s : students.values()) {
            System.out.println("ID:  " + s.getStudentID());
            System.out.println("Name:  " + s.getName());
            System.out.println();
        }
    }
}
