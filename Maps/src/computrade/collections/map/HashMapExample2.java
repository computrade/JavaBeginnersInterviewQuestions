package computrade.collections.map;
import java.util.HashMap;
import java.util.Map;

import computrade.Student;

public class HashMapExample2 {
    public static void main(String[] args) {
    	
        // Instantiate a HashMap with Integer as the key type and Student as
        // the value type.
        Map<Integer, Student> students = new HashMap<Integer, Student>();
        // Instantiate three Students; the constructor arguments are 
        // used to initialize Student attributes studentId and studentName
        Student s1 = new Student(12, "Fred");
        Student s2 = new Student(98, "Barney");
        Student s3 = new Student(71, "Wilma");

        // Insert all three Students into the HashMap.
        students.put(s1.getStudentID(), s1);
        students.put(s2.getStudentID(), s2);
        students.put(s3.getStudentID(), s3);
        
        System.out.println("After adding 3 students, Map size is:" + students.size() );
        
       //using the same key - override the previous value
        Student s4 = new Student(98, "New Barney");
        Student previous = students.put(s4.getStudentID(), s4);
        
        System.out.println("The previous student is returned: " + previous);
        System.out.println("After adding Student 4 - Map size is still:" + students.size() );
       
        System.out.println("\nIterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
        }
        
        //adding null 
        students.put(null, previous);
        
        System.out.println("\nAfter adding null key - Map size is:" + students.size() );
        System.out.println("Iterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
        }
        
        Student nullStudent =  students.get(null);
        System.out.println("\nWe can use null as a key. This is the NULL student: " + nullStudent);
        
        //it is possible to set a value to null as well
        students.put(88, null);
        System.out.println("\nAfter adding null value - Map size is:" + students.size() );
        System.out.println("Iterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
        }
        
    }
}
