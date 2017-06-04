package computrade.exceptions;

public class MyCustomRunTimeException extends RuntimeException{
	
	MyCustomRunTimeException(){
		super();
	}
	
	MyCustomRunTimeException(String message){
		super(message);
	}
	

}
