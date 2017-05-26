package computrade.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of linked list we need to find length first
 * but since we can only traverse linked list one time, we will use two pointers
 * one which we will increment on each iteration while other which will be
 * incremented every second iteration. so when first pointer will point to the
 * end of linked list, second will be pointing to the middle element of linked list
 * @author
 */
public class FindTheMiddleElementInLinkedListTest{

	@Test
    public void testEvenElements() {
		
		int numberOfElements = 10;
        SimpleLinkedListImpl linkedList = createLinkedList(numberOfElements);
      
      assertEquals(numberOfElements, linkedList.length()); // length of linked list should be 6
    
      //finding middle element of LinkedList in single pass
      Node current = linkedList.getFirst();
      int length = 1;
      Node middle = linkedList.getFirst();
    
      while(current.getNext() != null){
          length++;
          if(length%2 ==1){
              middle = middle.getNext();
          }
          current = current.getNext();
      }

      System.out.println("The Middle elemet is:" +  middle.getData());
      assertEquals(String.valueOf(numberOfElements/2), middle.getData()); 
      
    } 
	
	@Test
    public void testOddElements() {
        //creating LinkedList with 5 elements including head
		
	  int numberOfElements = 99	;
	  SimpleLinkedListImpl linkedList = createLinkedList(numberOfElements);
      
      assertEquals(numberOfElements, linkedList.length()); // length of linked list should be 6
    
      //finding middle element of LinkedList in single pass
      Node current = linkedList.getFirst();
      int length = 1;
      Node middle = linkedList.getFirst();
    
      while(current.getNext() != null){
          length++;
          if(length%2 ==1){
              middle = middle.getNext();
          }
          current = current.getNext();
      }

      System.out.println("The Middle elemet is:" +  middle.getData());
      assertEquals(String.valueOf(numberOfElements/2+1), middle.getData()); 
      
    }

	private SimpleLinkedListImpl createLinkedList(int numberOfElements) {
		
		SimpleLinkedListImpl linkedList = new SimpleLinkedListImpl();
		for(int number=1;number <=numberOfElements; number++){
			linkedList.append(String.valueOf(number));
		}
		
		return linkedList;
	} 
  
}

