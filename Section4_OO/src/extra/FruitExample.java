package extra;

// FruitExample.java

// This nonsensical program is intended to illustrate command line argument
// passing.

public class FruitExample {
    // The signature of the main() method always needs to 
    // declare one argument, which happens to be a String array 
    // named 'args'. (You can name the array whatever you'd like, 
    // but 'args' is the standard name that most people use.)
    //
    // This array is automatically initialized when the program is run
    // from the DOS or Unix command line with whatever (space-separated) 
    // values ('arguments') you've typed on the command line 
    // after the program name.
    //
    // For example, if the compiled program is run from the DOS 
    // command line as follows:
    //
    //     java FruitExample apple banana cherry
    // 
    // then the args array will be automatically initialized with 
    // three String values "apple", "banana", and "cherry" which
    // will be stored in array 'cells' args[0], args[1], and
    // args[2], respectively (remember that arrays start counting at 0).

    public static void main(String[] args) {
        System.out.println("The args array contains " + args.length + " entries." );

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument #" + i + " = |" + args[i] + "|");
        }
    }
}
