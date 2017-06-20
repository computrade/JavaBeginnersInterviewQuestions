package computrade.puzzels;

public class WhatIsTheOutputStringPool {
	
	public static void main(String ... args){
		
		String str1 = "Abracadabra";
		String str2 = "Abra" + "cadabra";
		String str3 = new String("Abracadabra");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
	}

}
