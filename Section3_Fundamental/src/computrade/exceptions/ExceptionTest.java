package computrade.exceptions;


public class ExceptionTest {

	   public static void main(String args[]) {
		   
		   ExceptionTest exceptionTest = new ExceptionTest();
		   
		   try {
			   exceptionTest.handleException();
		   } catch (MyCustomException e) {
			   e.printStackTrace();
		   }
		   exceptionTest.handleRuntimeException();
		   
	     
	   }
	   
	   private void handleException() throws MyCustomException{
		   String names[] = {"Jimi","Donald"};
		      try {
		         System.out.println("Access name in element three :" + names[3]);
		      }catch(ArrayIndexOutOfBoundsException e){
		    	  throw new MyCustomException(e.getMessage());
		      }finally {
		    	 names = null;
		         System.out.println("Clean of handleException up done! The finally statement is executed");
		      }
		     
	   }
	   
	   private void handleRuntimeException(){
		   
		   String names[] = {"Jimi","Donald"};
		      try {
		         System.out.println("Access name in element three :" + names[3]);
		      }catch(ArrayIndexOutOfBoundsException e){
		    	  throw new MyCustomRunTimeException(e.getMessage());
		      }finally {
		    	 names = null;
		         System.out.println("Clean up of handleRuntimeException done! The finally statement is executed");
		      }
		   
	   }
	   
	 
	}




