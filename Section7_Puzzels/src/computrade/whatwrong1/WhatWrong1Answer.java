package computrade.whatwrong1;

public class WhatWrong1Answer {
	
	public static void main(String [] args){
		
		handleConnection();
	}
	
	private static void handleConnection(){
		
		Connection connection = new Connection();
		connection.open();
		
		try{
			String input="Hello World";
			connection.send(input);
		 
		}catch(ConnectionException connectionEx){  //catch the specific Excpetion.	
			// You should provide good logging for the support team. 
			System.out.println("Handling connection Exception: " + connectionEx.getMessage());
		}catch(Exception ex){
			System.out.println("Un-known Exception happen: " + ex.getMessage());
		}
		finally{
			// the close of the connection should be in a finally block.
			if(connection!=null){
				connection.close();
			}	
		}
		
	}
	
}


