package collection;

import java.util.ArrayList;

// We're no longer extending the ArrayList class.
public class MyIntCollection2 {
    // Instead, we're encapsulating a garden-variety ArrayList inside of this class.
    ArrayList<Integer> numbers;

    // We define a few extra attributes and methods beyond those that the
    // encapsulated ArrayList will provide -- the SAME attributes and methods
    // that we added to MyIntCollection:  
    private int smallestInt;
    private int largestInt;
    private int total;

    public MyIntCollection2() {
	// Instantiate the embedded ArrayList.
        numbers = new ArrayList<Integer>();

        // Initialize the total.
        total = 0;
    }

    // Since we don't inherit a size() method any longer, let's add one!

    public int size() {
        // DELEGATION!
        return numbers.size();
    }

    // We have the same methods for MyIntCollection2 as we had for myIntCollection, 
    // but we've made minor modifications to delegate some work to the encapsulated
    // numbers ArrayList.

    public boolean add(int i) {
        // Remember this int as the largest/smallest, 
        // if appropriate.  (The FIRST time we add a value, it by default 
        // will be BOTH the smallest AND the largest!)
	// DELEGATION!
        if (numbers.isEmpty()) {
            smallestInt = i;
            largestInt = i;
        }
        else {
            if (i < smallestInt) smallestInt = i;
            if (i > largestInt) largestInt = i;
        }

	// Increase the total.
	total = total + i;

        // Add the int to the numbers collection.
	// DELEGATION!
        return numbers.add(i);
    }

    // All remaining methods are identical to those of MyIntCollection.

    public int getSmallestInt() {
	return smallestInt;
    }

    public int getLargestInt() {
	return largestInt;
    }

    public double getAverage() {
        return ((double) total)/((double) this.size());
    }
}
