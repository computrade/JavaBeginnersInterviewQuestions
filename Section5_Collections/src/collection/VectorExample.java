package collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
	  // Instantiate a collection. 
	  Vector<Student> students = new Vector<Student>();

	  // Create a few Student objects.
	  Student a = new Student("Herbie");
	  Student b = new Student("Clem");
	  Student c = new Student("Oscar");

	  // Store references to all three Students in the collection.
	  students.add(a);
	  students.add(b);
	  students.add(c);

	  // ... and then iterate through them one by one,
        // printing each student’s name.
	  for (Student s : students) {
	    System.out.println(s.getName()); 
	  }
    }
}
