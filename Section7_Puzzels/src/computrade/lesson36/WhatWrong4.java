package computrade.lesson36;

public class WhatWrong4 {

	public static void main(String[] args) {
		//should ne called in a static way.
		//handleConnection();
		new WhatWrong4().handleConnection();
	}

	private void handleConnection() {

		Connection connection = new Connection();

		try {
			connection.open();
			String input = "Hello World";
			connection.send(input);
		} catch (Exception e) {
			System.out.println("Handling Exception. " + e.getMessage());
		//the order of the Exception is important!
			
		//} catch (ConnectionException e){
		//	System.out.println("Handling connection Exception. " + e.getMessage());
		}finally {
			// the close of the connection should be in a finally block.
			if (connection != null) {
				connection.close();
			}

		}

	}

}
