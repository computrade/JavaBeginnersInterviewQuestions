package computrade.collections.map;
import java.util.HashMap;
import java.util.Map;

import computrade.Student;

public class HashMapExample {
    public static void main(String[] args) {
    	
        // Instantiate a HashMap with Integer as the key type and Student as the value type.
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

        // Retrieve a Student based on a particular (valid) ID.
        int id = 98;
        System.out.println("Let's try to retrieve a Student with ID = " + id);
        Student student = students.get(id);
        if (student != null){
        	System.out.println("Student Found!  Name = " + student.getName());
        }else{
        	System.out.println("Invalid ID:  " + id);
        }
       

        // Try an invalid ID.
        id = 13;
        System.out.println("\nLet's try to retrieve a Student with ID = " + id);
        student = students.get(id);
        if (student != null){
        	System.out.println("Found!  Name = " + student.getName());
        }else{
        	System.out.println("Invalid ID:  " + id);
        }
        
        System.out.println("\nIterate through the HashMap to process all Keys (Ids):");
        for (Integer key : students.keySet()) {
            System.out.println("ID: " + key );
        }
        
        System.out.println("***Note: The order is not kept... ");
     
        System.out.println("\nIterate through the HashMap to process all Values (Students):");
        for (Student s : students.values()) {
            System.out.println(s);
        }
      
        
        System.out.println("\nIterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
        }
        
        
    }
}
