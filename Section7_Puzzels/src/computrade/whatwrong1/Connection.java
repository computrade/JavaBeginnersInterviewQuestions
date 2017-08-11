package computrade.whatwrong1;

public class Connection{
	
	void open(){
		System.out.println("Connection opened");
	}
	
	void send(String input){
		System.out.println("Activating connection Send...");
		//This might throw ConnectionException.
		runSend(input);
		System.out.println("After connection Send...");
	}
	
	void close(){
		System.out.println("Connection closed");
	}
	
	private void runSend(String input) {
		throw new ConnectionException("problem in sending a message: " + input);
	}
	
}
