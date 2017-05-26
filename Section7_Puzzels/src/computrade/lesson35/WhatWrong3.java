package computrade.lesson35;

public class WhatWrong3 {
	
	public static void main(String [] args){
		
		handleConnection();
	}
	
	private static void handleConnection(){
		
		try{
			
			Connection connection = new Connection();
			connection.open();
			
			String input="Hello World";
			connection.send(input);
			
			connection.close();
			
			
		}catch(Exception e){
			
			
		}
		
	}
	
}


