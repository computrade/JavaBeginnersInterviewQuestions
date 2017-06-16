package computrade.exceptions;


public class ExceptionTest {

	   public static void main(String args[]) {
		   
		   ExceptionTest exceptionTest = new ExceptionTest();
		   
//		   try {
//			exceptionTest.handleException();
//		   } catch (MyCustomException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		   }
		   exceptionTest.handleRuntimeException();
		   
	     
	   }
	   
	   private void handleException() throws MyCustomException{
		   String names[] = {"Jimi","Donald"};
		      try {
		         System.out.println("Access name in element three :" + names[3]);
		      }catch(ArrayIndexOutOfBoundsException e){
		    	  throw new MyCustomException("Coverting from un-checked to checked exception: "
		    			  + e.getMessage());
		      }finally {
		    	 names = null; // Helping the GC
		         System.out.println("finally of handleException method done!");
		      }
		     
	   }
	   
	   private void handleRuntimeException(){
		   
		   String names[] = {"Jimi","Donald"};
		      try {
		         System.out.println("Access name in element three :" + names[3]);
		      }catch(ArrayIndexOutOfBoundsException e){
		    	  throw new MyCustomRunTimeException("Coverting from "
		    	  		+ "un-checked to another un-checked exception:"+ e.getMessage());
		      }finally {
		    	 names = null; // Helping the GC
		         System.out.println("finally of handleRuntimeException done!\n");
		      }
		   
	   }
	   
	 
	}




