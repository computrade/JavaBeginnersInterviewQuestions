package computrade.arrays;

import computrade.Student;

public class ArrayInitialization{

	private boolean[] booleanArray = new boolean[] {true,false,true}; 
	private Student[] studentArray = new Student[]{new Student(1,"Linda"),new Student(2,"Brian"),new Student(3,"Amit")};

	public void printBooleanArray() {
		// Display the initial value for elements of the instance variable bArray
		for (int i = 0; i < booleanArray.length; i++) {
			System.out.println("booleanArray[" + i + "]:" + booleanArray[i]);
		}
	}
	
	public void printIntArray() {
		
		int[] intArray = new int[5];
		// Display the initial value for elements of the instance variable intArray
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=2*i;
			System.out.println("intArray[" + i + "]:" + intArray[i]);
		}
	}

	public void printStringArray() {
		
		String[] stringArray = { "Linda","Brian",new String("Amit")};
		// Display the initial value for elements of the variable stringArray
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println("stringArray[" + i + "]:" + stringArray[i]);
		}
	}

	public void printStudentArray() {
		// Display the initial value for elements of the instance studentArray
		int i=0;
		for (Student student: studentArray) {
			System.out.println("studentArray[" + i + "]:"  + student);
			i++;
		}
	}

	public static void main(String[] args) {

		ArrayInitialization myArray = new ArrayInitialization();
		myArray.printBooleanArray();
		myArray.printIntArray();
		myArray.printStringArray();
		myArray.printStudentArray();
		
		//array elements cannot be printed as an object.
		//System.out.println(myArray.booleanArray);
		//System.out.println(myArray.studentArray);

	}

}
