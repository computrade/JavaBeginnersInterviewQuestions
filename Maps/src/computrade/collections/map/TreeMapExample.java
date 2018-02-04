package computrade.collections.map;

import java.util.Map;
import java.util.TreeMap;

import computrade.Student;

public class TreeMapExample {
    public static void main(String[] args) {
      
            // Instantiate a HashMap with Integer as the key type and Student as
            // the value type.
    		TreeMap<Integer, Student> students = new TreeMap<Integer, Student>();
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
            
            System.out.println("Iterate through the TreeMap to process all Entries (Id, Student):");
            for (Map.Entry<Integer,Student> entry : students.entrySet()) {
                System.out.println("ID: " + entry.getKey() +  " Student: " + entry.getValue() );
            }
            
            System.out.println("***Note: The map is sorted according to the natural ordering of its keys!");
            
            System.out.println("\nprinting first entry:" + students.firstEntry());
            System.out.println("printing last entry:" + students.lastEntry());
            System.out.println("printing sub map with toString method:" + students.subMap(0,50));  
             
        }
}
