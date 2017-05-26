package collection;

public class MyIntCollectionExample2 {
  public static void main(String[] args) {
    MyIntCollection2 mic = new MyIntCollection2();
   
    // Our client code is IDENTICAL whether we use MyIntCollection
    // or MyIntCollection2!!!  This proves that the details of
    // how we designed these classes truly are hidden.

    mic.add(3);
    mic.add(6);
    mic.add(1);
    mic.add(9);
	
    System.out.println("The collection contains " + mic.size() + 
        " int values");
    System.out.println("The smallest value is:  " + mic.getSmallestInt());
    System.out.println("The largest value is:  " + mic.getLargestInt());
    System.out.println("The average is:  " + mic.getAverage());
  }
}
