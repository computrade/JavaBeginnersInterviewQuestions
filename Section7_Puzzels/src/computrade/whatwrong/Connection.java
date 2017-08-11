package computrade.whatwrong;

public class Connection{
	
	void open(){
		System.out.println("Connection opened");
	}
	
	void send(String input) throws ConnectionException{
		System.out.println("Activating connection Send...");
		//This might throw ConnectionException.
		throw new ConnectionException("problem in sending a message:" + input);
		//System.out.println("After connection Send...");
	}
	
	void close(){
		System.out.println("Connection closed");
	}
	
}
