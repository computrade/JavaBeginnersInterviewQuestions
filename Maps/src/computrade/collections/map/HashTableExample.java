package computrade.collections.map;
import java.util.Hashtable;
import java.util.Map;

import computrade.Student;

public class HashTableExample {
    public static void main(String[] args) {
    	
        // Instantiate a HashTable with Integer as the key type and Student as the value type.
        Map<Integer, Student> students = new Hashtable<Integer, Student>();
        // Instantiate three Students
        Student s1 = new Student(12, "Fred");
        Student s2 = new Student(98, "Barney");
        Student s3 = new Student(71, "Wilma");

        // Insert all three Students into the Hashtable.
        students.put(s1.getStudentID(), s1);
        students.put(s2.getStudentID(), s2);
        students.put(s3.getStudentID(), s3);
        
        System.out.println("\nIterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
        }
        
        //Hashtable doesn't allow put/get of null as key 
        students.put(null, s3);      
        students.get(null);
        
        //Hashtable doesn't allow putting null as value 
        students.put(88, null);
          
    }
}
