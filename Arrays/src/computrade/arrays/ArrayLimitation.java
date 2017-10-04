package computrade.arrays;

public class ArrayLimitation {
	
	
	int intArray[] = {1,2,3,4,5};
	
	public void extendArray(int newLength){
		
		int[] newIntArray = new int[newLength];
		for(int i=0;i<intArray.length;i++){
			newIntArray[i]=intArray[i];
		}
		intArray=newIntArray;
	}
		
	public void extendArrayUsingArrayCopy(int newLength){
		int[] newIntArray = new int[newLength]; 
		System.arraycopy(intArray, 0, newIntArray, 0, intArray.length);
		intArray=newIntArray;
	}
	
	public void shrinkArray(int newLength){
		
		int[] newIntArray = new int[newLength];
		for(int i=0;i<newIntArray.length;i++){
			newIntArray[i]=intArray[i];
		}
		intArray=newIntArray;
	}
	
	public void shrinkArrayUsingArrayCopy(int newLength){
		int[] newIntArray = new int[newLength]; 
		System.arraycopy(intArray, 0, newIntArray, 0, newLength);
		intArray=newIntArray;		
	}
	
	public void printIntArray() {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "]:" + intArray[i]);
		}
	}
	
	public static void main(String... args){
		
		ArrayLimitation arrayLimitation = new ArrayLimitation();
		arrayLimitation.printIntArray();
		System.out.println("=======extendArray==========");
		arrayLimitation.extendArray(10);
		arrayLimitation.printIntArray();
		//System.out.println("========extendArrayUsingArrayCopy=========");
		//arrayLimitation.extendArrayUsingArrayCopy(15);
		//arrayLimitation.printIntArray();
		//System.out.println("=======shrinkArray==========");
		//arrayLimitation.shrinkArray(5);
		//arrayLimitation.printIntArray();
		//System.out.println("=======shrinkArrayUsingArrayCopy==========");
		//arrayLimitation.shrinkArrayUsingArrayCopy(3);
		//arrayLimitation.printIntArray();
		
	}
	

}
