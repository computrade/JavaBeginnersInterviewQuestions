package computrade.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import computrade.Student;


public class ArrayListBasicDemo {
    public static void main(String[] args) {
	  // Instantiate a collection. 
	  List<Student> students = new ArrayList<Student>();

	  // Create a few Student objects.
	  Student a = new Student(1,"Alice");
	  Student b = new Student(2,"Bob");
	  Student c = new Student(3,"Charly");

	  // Store references to all three Students in the collection.
	  students.add(a);
	  students.add(b);
	  students.add(c);
	  System.out.println(students); 
	  
	  //students.add(null); //possible to add null values.
	  
	  //it is possible to add the same objects again
	  //students.add(a);
	  //students.add(b);
	  //students.add(c);
	  
	  // use toString method of Student for printing.
	  

      // iterate and print each student’s name:
	  /*
	  System.out.println("**** Using For Example...");
	  for (Student s : students) {
			System.out.println(s); 
	  }
	  */
	  /*
	  System.out.println("**** Iterator Example...");
      Iterator<Student> studentIterator = students.iterator();
		
	  while(studentIterator.hasNext()){
		  System.out.println(studentIterator.next()); 
	  }
	  */
	  //TODO #1
	  //iterate using for with arraylist.get(index)
	  
	  //TODO #2 
	  //iterate using while with arraylist.get(index)
	  
	  //TODO #3 - advance.
	  //iterate using collection stream() utils. 
	  
    }
}
