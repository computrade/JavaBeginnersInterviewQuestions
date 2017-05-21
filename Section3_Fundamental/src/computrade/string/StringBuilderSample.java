package computrade.string;

public class StringBuilderSample {
	
	public static void main(String []args){
	
		appendStrings();
		appendStringBuffer();
		appendStringBuilder();
		
	}

	private static void appendStrings() {
		long start = System.currentTimeMillis();
		String first = "First";
		String second = "Second";
		for (int i = 0; i < 50000; ++i) {
			first = first + second;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Total running time for String is:" + (end-start) + " millis." );
	}
	
	//StringBuffer is Thread Safe.
	private static void appendStringBuffer() {
		long start = System.currentTimeMillis();
		StringBuffer first = new StringBuffer("First");
		String second = "Second";
		for (int i = 0; i < 50000; ++i) {
			first.append(second);
		}
		long end = System.currentTimeMillis();
		System.out.println("Total running time for StringBuffer is:" + (end-start) + " millis." );
		
	}
	
	private static void appendStringBuilder() {
		long start = System.currentTimeMillis();
		StringBuilder first = new StringBuilder("First");
		String second = "Second";
		for (int i = 0; i < 50000; ++i) {
			first.append(second);
		}
		long end = System.currentTimeMillis();
		System.out.println("Total running time for StringBuilder is:" + (end-start) + " millis. I'm the fastest!!!" );
		
	}
	
	

}
