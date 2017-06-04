package computrade.exceptions;

/*
 * Creating a checked exception.
 */
public class MyCustomException extends Exception{
	
	MyCustomException(){
		super();
	}
	
	MyCustomException(String message){
		super(message);
	}
	


}
