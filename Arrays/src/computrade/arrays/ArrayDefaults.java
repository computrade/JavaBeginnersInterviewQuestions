package computrade.arrays;

import computrade.Student;

public class ArrayDefaults{

	private boolean[] booleanArray = new boolean[3]; 
	private Student[] studentArray = new Student[4];

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
			System.out.println("intArray[" + i + "]:" + intArray[i]);
		}
	}

	public void printStringArray() {
		
		String[] stringArray = new String[4];
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

		ArrayDefaults myArray = new ArrayDefaults();
		myArray.printBooleanArray();
		myArray.printIntArray();
		myArray.printStringArray();
		myArray.printStudentArray();
		
	}

}
