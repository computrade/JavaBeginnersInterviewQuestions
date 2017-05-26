package computrade.lesson35;

public class WhatWrong3Answer {
	
	public static void main(String [] args){
		
		handleConnection();
	}
	
	private static void handleConnection(){
		
		Connection connection = new Connection();
		connection.open();
		
		try{
			String input="Hello World";
			connection.send(input);
		// it better to catch the specific Excpetion.	
		}catch(ConnectionException e){
			// You should provide good logging for the support team. 
			System.out.println("Handling connection Exception. " + e.getMessage());
			
		}finally{
			// the close of the connection should be in a finally block.
			if(connection!=null){
				connection.close();
			}
			
		}
		
	}
	
}


