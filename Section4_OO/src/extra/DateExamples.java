package extra;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExamples {
    public static void main(String[] args) {
        //-------------------------------------------------------------------------
        // Example #1:  Get the current date and time, and print it out in 
        // a default format.

        // Use the Calendar class to get a snapshot of this precise moment.
        Calendar thisInstant = Calendar.getInstance(); 

        // Convert to a Date.
        Date rightNow = thisInstant.getTime(); 

        // Convert to a String.
        String ex1 = rightNow.toString();

        System.out.print("Example #1:  ");
        System.out.println("Current time and date (default format):  " + ex1);
        System.out.println();

        //-------------------------------------------------------------------------
        // Example #2:  Get the current date and time, and print it out in a
        // specified way as described by the SimpleDateFormat that we've
        // designated below.

        // An alternative way to get the current date and time that doesn't
        // involve the Calendar class.
        Date now = new Date(System.currentTimeMillis());

        SimpleDateFormat sdfEx2 = new SimpleDateFormat("EEEE, MMM d, yyyy hh:mm aaa");
        String ex2 = sdfEx2.format(now);

        System.out.print("Example #2:  ");
        System.out.println("Current time and date (custom format):  " + ex2);
        System.out.println();

        //-------------------------------------------------------------------------
        // Example #3:  Print today's date (only) in a specified way as described by 
        // the alternative SimpleDateFormat that we've designated.

        SimpleDateFormat sdfEx3 = new SimpleDateFormat("MMMM d, yyyy");

        // We'll reuse the Date instance, "now", from above.
        String ex3 = sdfEx3.format(now);

        System.out.print("Example #3:  ");
        System.out.println("Today's date (custom format):  " + ex3);
        System.out.println();

        //-------------------------------------------------------------------------
        // Example #4:  Print today's date (only) in yet another format.

        SimpleDateFormat sdfEx4 = new SimpleDateFormat("MM/dd/yyyy");
        String ex4 = sdfEx4.format(now);

        System.out.print("Example #4:  ");
        System.out.println("Today's date (alternative custom format):  " + ex4);
        System.out.println();

        //-------------------------------------------------------------------------
        // Example #5:  Craft a specific date as a Date object.

        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.NOVEMBER, 17);
        Date specialDate = cal.getTime();

        // We'll reuse the SimpleDateFormat from above.
        String ex5 = sdfEx4.format(specialDate);

        System.out.print("Example #5:  ");
        System.out.println("A special date:  " + ex5);
        System.out.println();

        //-------------------------------------------------------------------------
        // Example #6:  Compare two dates.

        // We'll reuse the Calendar instance from Example #5 to craft two
        // different Dates.

        cal.set(2005, Calendar.JUNE, 1);
        Date bjo2EpublicationDate = cal.getTime();

        cal.set(2005, Calendar.JULY, 1);
        Date jjbVacationDate = cal.getTime();

        System.out.print("Example #6:  ");

        // We'll use the before() method to compare the dates (note that there's
        // also an after() method and an equals() method ...).

        if (jjbVacationDate.before(bjo2EpublicationDate)) {
            System.out.println("Jacquie can't take vacation yet ..." +
                " the book isn't finished!");
        }
        else {
            System.out.println("Have a safe and relaxing trip, Steve and Jacquie!");
        }
    }
}
