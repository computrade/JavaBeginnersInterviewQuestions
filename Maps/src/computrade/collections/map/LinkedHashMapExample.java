package computrade.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

import computrade.Student;

public class LinkedHashMapExample {
	
    public static void main(String[] args) {
      
            // Instantiate a HashMap with Integer as the key type and Student as the value type.
         	Map<Integer, Student> students = new LinkedHashMap<Integer, Student>();
            // Instantiate four Students; the constructor arguments are 
            // used to initialize Student attributes studentId and studentName
            Student s1 = new Student(12, "Fred");
            Student s2 = new Student(98, "Barney");
            Student s3 = new Student(49, "Sher");
            Student s4 = new Student(71, "Wilma");

            // Insert all three Students into the HashMap.
            students.put(s1.getStudentID(), s1);
            students.put(s2.getStudentID(), s2);
            students.put(s3.getStudentID(), s3);
            students.put(s4.getStudentID(), s4);
          
            System.out.println("\nIterate through the LinkedHashMap to process all Entries (Id, Student):");
            for (Map.Entry<Integer,Student> entry : students.entrySet()) {
                System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
            }   
            
        }
}
