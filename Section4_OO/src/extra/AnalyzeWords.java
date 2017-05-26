package extra;

// AnalyzeWords.java

import java.util.TreeSet;

public class AnalyzeWords {
    public static void main(String[] args) {
        // Let's start with a bit of error checking.
        // If the user forgot to type any words, let's report this as an error.
        if (args.length == 0) {
            System.out.println("Usage:  java AnalyzeWords [-sort] list_of_words");
            System.out.println("e.g.:   java AnalyzeWords -sort ZEBRA ELEPHANT RAT MONKEY");
            System.exit(0);
        }

	// Initialize a few items.
        boolean sort = false;
        String shortest = null;
        String longest = null;
        TreeSet<String> sortedWords = new TreeSet<String>();

        for (int i = 0; i < args.length; i++) {
            // Watch for the presence of the -sort flag.
            if (args[i].equals("-sort")) {
                sort = true;
                continue;
            }
        
	    // If we haven't yet recorded a shortest or longest word, then by 
            // definition this is the first, and hence both the shortest
            // and longest, word!
            if (shortest == null) {
                shortest = args[0];
                longest = args[0];
            }
	    // Otherwise, compare this word to the shortest/longest seen so far.
            else {     
                if (args[i].length() > longest.length()) longest = args[i]; 
                if (args[i].length() < shortest.length()) shortest = args[i]; 
            }

            // Add the word to the TreeSet so as to sort them automatically.
            // whether the user asked for them to be sorted or not; if the 
            // user didn't ask for them to be sorted, we'll simply suppress
            // displaying this information.
            sortedWords.add(args[i]);
        }

        if (sort) {
            System.out.println("Sorted words:");
            for (String s : sortedWords) {
                System.out.println("\t" + s);
            }
        }

        System.out.println("The shortest word was " + shortest.length() + " characters long.");
        System.out.println("The longest word was " + longest.length() + " characters long.");
    }
}
