package computrade.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import computrade.Student;


public class ArrayListIteratorDemo {
    public static void main(String[] args) {
	  // Instantiate a collection. 
	  List<Student> students = new ArrayList<Student>();

	  // Create a few Student objects.
	  Student a = new Student(1,"Alice");
	  Student b = new Student(2,"Bob");
	  Student c = new Student(3,"Charley");

	  // Store references to all three Students in the collection.
	  students.add(a);
	  students.add(b);
	  students.add(c);
	  System.out.println(students); 
	  
	  System.out.println("**** Using For Example...");
	  for (Student s : students) {
			System.out.println(s); 
	  }
	
	  System.out.println("**** Iterator Example...");
      Iterator<Student> studentIterator = students.iterator();
		
	  while(studentIterator.hasNext()){	  
		  Student currStudent = studentIterator.next();
		  System.out.println(currStudent);
		  if("Bob".equals(currStudent.getName())){
			  studentIterator.remove();
			  System.out.println("***Removed:" +currStudent );
		  }  
	  }
	  
	  System.out.println("**** Using For Example after remove...");
	  for (Student s : students) {
			System.out.println(s); 
	  }
	  
	  
    }
}
