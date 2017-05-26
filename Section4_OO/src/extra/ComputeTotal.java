package extra;

// ComputeTotal.java

public class ComputeTotal {
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
    //     java ComputeTotal 123 456 789
    // 
    // then the args array will be automatically initialized with 
    // three String values "123", "456", and "789", which
    // will be stored in array 'cells' args[0], args[1], and
    // args[2], respectively.

    public static void main(String[] args) {
        // Let's start with a bit of error checking.
        // If the user forgot to type any numbers, let's report this as an error.
        if (args.length == 0) {
            System.out.println("Usage:  java ComputeTotal list_of_numbers_to_add");
            System.out.println("e.g.:   java ComputeTotal 123 456 789");
            System.exit(0);
        }

        // Next, let's try converting all of the String inputs to numeric equivalents,
        // computing the total as we go.  If any of these fail, we'll report an error.
        double sum = 0.0;
        for (int i = 0; i < args.length; i++) {
          // We place the try-catch logic inside of the for loop because ...
          try {
            sum = sum + Double.parseDouble(args[i]);
          }
          catch (NumberFormatException e) {
            System.out.println("Whoops! \"" + args[i] + "\" is not a valid number.");
          }
        }        

        System.out.println("The total is:  " + sum);
    }
}
