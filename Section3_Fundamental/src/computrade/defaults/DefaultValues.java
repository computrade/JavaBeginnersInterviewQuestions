package computrade.defaults;

public class DefaultValues {
	
	// primitive types
	boolean defaulBoolean=true;
	char defaultChar;
	byte defaultByte;
	int defaultInt=10;
	long defaultLong;
	double defaultDouble;
	float defaultFloat;
	
	// Object sample
	String defaultString="myString";
	Object defaultObject;
	
	
	public static void main(String... args) {
	
		DefaultValues df = new DefaultValues();
		
		System.out.println("defaulBoolean:" + df.defaulBoolean);
		System.out.println("defaultChar:" + (int)df.defaultChar);
		System.out.println("defaultByte:" + df.defaultByte);
		System.out.println("defaultInt:" + df.defaultInt);
		System.out.println("defaultLong:" + df.defaultLong);
		System.out.println("defaultDouble:" + df.defaultDouble);
		System.out.println("defaultFloat:" + df.defaultFloat);
		System.out.println("defaultString:" + df.defaultString);
		System.out.println("defaultObject:" + df.defaultObject);

	}

}
