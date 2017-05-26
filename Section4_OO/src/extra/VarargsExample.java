package extra;

import java.util.ArrayList;

public class VarargsExample {
    public static void main(String[] args) {
        // Invoking examples of methods that define varargs 
        // argument signatures, where the type of argument
        // to be passed in is designated by the name 
        // of the method.

        stringExample("foo", "bar");
        stringExample("eeny", "meeny", "miney", "mo");

        intExample(1, 3, 9, 27);
        intExample();

        Student student = new Student("Fred");
        Professor professor = new Professor("Dr. Carson");
        personExample(student, professor);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello!");
        arrayList.add("How are you?");
        arrayList.add("Goodbye ...");
        objectExample(student, arrayList);

        // Pass in three totally unrelated objects.
        objectExample2(new Pineapple(), new Bicycle(), new Cloud());
    }

    private static void stringExample(String ... args) {
        System.out.println("In stringExample, there were " + args.length + " arguments.");

        for (int i = 0; i < args.length; i++) {
            System.out.println("    " + args[i] + " is a " + args[i].getClass().getName());
        }

        System.out.println();
    }

    private static void intExample(int ... args) {
        System.out.println("In intExample, there were " + args.length + " arguments.");

        for (int i = 0; i < args.length; i++) {
            System.out.println("    " + args[i] + " is an int");
        }

        System.out.println();
    }

    private static void personExample(Person ... args) {
        System.out.println("In personExample, there were " + args.length + " arguments.");

        for (int i = 0; i < args.length; i++) {
            System.out.println("    " + args[i] + " is a " + args[i].getClass().getName());
        }

        System.out.println();
    }

    private static void objectExample(Object ... args) {
        System.out.println("In objectExample, there were " + args.length + " arguments.");

        for (int i = 0; i < args.length; i++) {
            System.out.println("    " + args[i] + " is a " + args[i].getClass().getName());
        }

        System.out.println();
    }

    private static void objectExample2(Object ... args) {
        // Here, we know that the collection will be an assortment of Pineapples,
        // Bicycles, and Clouds.
        for (int i = 0; i < args.length; i++) {
            // Note casts.
            if (args[i] instanceof Pineapple) {
                ((Pineapple) args[i]).eat();
            }
            else if (args[i] instanceof Bicycle) {
                ((Bicycle) args[i]).ride();
            }
            else if (args[i] instanceof Cloud) {
                ((Cloud) args[i]).paint();
            }
        }

        System.out.println();
    }
}
