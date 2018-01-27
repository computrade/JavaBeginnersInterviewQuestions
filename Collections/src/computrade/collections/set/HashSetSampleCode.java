package computrade.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetSampleCode {
	
	public static void main(String[] args) {
		
		HashSetSampleCode findDups = new HashSetSampleCode();
		
		List<Person> personsList = findDups.createListOfPerson();
		System.out.println("List of persons" + personsList);
		
		
		Set<Person> personsSet = new HashSet<Person>(personsList);
		System.out.println("List of persons without duplication:" + personsSet);
		
	}
	
	
	private List<Person> createListOfPerson(){
		
		
		List <Person> persons = new ArrayList<Person>(); //List Allow duplication
		persons.add(new Person(1,"David"));
		persons.add(new Person(2,"Bob"));
		persons.add(new Person(3,"Alice"));
		// Add duplicate Person elements ID
		persons.add(new Person(2,"Bob"));
		persons.add(new Person(3,"Jim"));
		return persons;
		
	}

}
