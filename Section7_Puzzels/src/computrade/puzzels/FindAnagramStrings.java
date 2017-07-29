package computrade.puzzels;

import java.util.Arrays;

/**
 * Java program - String Anagram Example. This program checks if two Strings are
 * anagrams or not
 *
 */
public class FindAnagramStrings {
	
	/*
	 * 
	 * Our first solution to the anagram problem will check to see that each character in the first string
	 *  actually occurs in the second. 
	 *  
	 *  If it is possible to “checkoff” each character, then the two strings must be anagrams.
	 *  Checking off a character will be accomplished by replacing it with '0'.
	 *   	
	 * Before starting:
	 * 1. Checking the length,
	 * 2. Changing the input to lower case in order to ignore cases.
	 *
	 * @throws IllegalArgumentException if one of the inputs is null.
	 * @return true, if both String are anagram
	 * 
	 */
	public static boolean isAnagramByCheckingOff(String word, String anagram) {

		validateInput(word, anagram);

		if (word.length() != anagram.length()) {
			return false;
		}
		word = word.toLowerCase();
		anagram = anagram.toLowerCase();

		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();

		for (int i=0; i<charFromWord.length;i++) {
			for (int j=0; j<charFromAnagram.length;j++) {
				if (charFromWord[i] == charFromAnagram[j]) {
					charFromAnagram[j] = 0;
					break;
				}
			}
		}

		for (char a : charFromAnagram) {
			if (a != 0) {
				return false;
			}
		}

		return true;

	}
	
	/*
	 * Find if two Strings are anagram by iterating the char array and removing the char
	 * from the anagram char array.
	 * 
	 * Before starting:
	 * 1. Checking the length,
	 * 2. Changing the input to lower case in order to ignore cases.
	 *
	 * @throws IllegalArgumentException if one of the inputs is null.
	 * @return true, if both String are anagram
	 */
	public static boolean isAnagramBySubstring(String word, String anagram) {
		
		validateInput(word,anagram);

		if (word.length() != anagram.length()) {
			return false;
		}

		word = word.toLowerCase();
		anagram = anagram.toLowerCase();

		char[] chars = word.toCharArray();

		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	

	/*
	 * Find if two Strings are anagram by iterating the char array and using StringBuilder deleteCharAt method 
	 * for removing the char from the anagram StringBuffer.
	 * 
	 * Before starting:
	 * 1. Checking the length,
	 * 2. Changing the input to lower case in order to ignore cases.
	 *
	 * @throws IllegalArgumentException if one of the inputs is null.
	 * @return true, if both String are anagram
	 */
	public static boolean checkAnagramBySBDelete(String word, String anagram) {
		
		validateInput(word,anagram);
		
		if (word.length() != anagram.length()) {
			return false;
		}
		
		word = word.toLowerCase();
		anagram = anagram.toLowerCase();
		
		char[] characters = word.toCharArray();
		StringBuilder sbAnagram = new StringBuilder(anagram);

		for (char ch : characters) {
			int index = sbAnagram.indexOf("" + ch);
			if (index != -1) {
				sbAnagram.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return sbAnagram.length() == 0 ? true : false;
	}
		
	/*
	 * Find if two Strings are anagram by sorting the characters in both inputs and comparing them.
	 * 
	 * Before starting:
	 * 1. Checking the length,
	 * 2. Changing the input to lower case in order to ignore cases.
	 *
	 * @throws IllegalArgumentException if one of the inputs is null.
	 * @return true, if both String are anagram
	 * 
	 */
	public static boolean isAnagramBySort(String word, String anagram) {
		
		validateInput(word,anagram);
		
		if (word.length() != anagram.length()) {
			return false;
		}
		word = word.toLowerCase();
		anagram = anagram.toLowerCase();
		
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);

		return Arrays.equals(charFromWord, charFromAnagram);
	}
	
	
	/*
	 * Find if two Strings are anagram by counting the number of times each character occurs.
	 * Since there are 26 possible characters, we can use a list of 26 counters, one for each possible character.
	 * Each time we see a particular character, we will increment the counter at that position.
	 * In the end, if the two lists of counters are identical, the strings must be anagrams
	 * 
	 * Before starting:
	 * 1. Checking the length,
	 * 2. Changing the input to lower case in order to ignore cases.
	 *
	 * @throws IllegalArgumentException if one of the inputs is null.
	 * @return true, if both String are anagram
	 * 
	 */
	public static boolean isAnagramByCountAndCompare(String word, String anagram) {
		
		validateInput(word,anagram);
		
		if (word.length() != anagram.length()) {
			return false;
		}
		
		word = word.toLowerCase();
		anagram = anagram.toLowerCase();
		
	    char[] wordChars = word.toCharArray();
	    char[] anagramChars = anagram.toCharArray();
		
		//array of 26 int for each input
	    int[] wordCount = new int[26];
	    int[] anagramCount = new int[26];
	    
	    //count each character in the 'word' input
	    for(int i=0;i<wordChars.length;i++){
	    	int pos = wordChars[i]-'a';
	    	wordCount[pos] = wordCount[pos]+1;
	    }

	    //count each character in the 'anagram' input
	    for(int i=0;i<anagramChars.length;i++){
	    	int pos = anagramChars[i]-'a';
	    	anagramCount[pos] = anagramCount[pos]+1;
	    }

	    //compare the counters array
	    for(int i=0;i<26;i++){
	    	if(wordCount[i]!=anagramCount[i]){
	    		return false;
	    	}	
	    }
	    
	    return true;
	  

	}
	
	private static void validateInput(String word, String anagram) {
		if(word == null || anagram == null){
			throw new IllegalArgumentException("Input for anagram should not be null");
		}

	}
	
	
}
