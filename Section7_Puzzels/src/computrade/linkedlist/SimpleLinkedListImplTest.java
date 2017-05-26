package computrade.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleLinkedListImplTest {

	@Test
	public void SimpleLinkedListImplCreationTest() {
		
		SimpleLinkedListImpl myLinkedList = new SimpleLinkedListImpl();
		assertTrue(myLinkedList.isEmpty()); // linked list should be empty
		assertEquals(0, myLinkedList.length()); // length of linked list should be zero
		
	
	}
	
	@Test
	public void addingOneElementTest() {
		
		SimpleLinkedListImpl myLinkedList = new SimpleLinkedListImpl();
		assertTrue(myLinkedList.isEmpty()); // linked list should be empty
		assertEquals(0, myLinkedList.length()); // length of linked list should be zero
		
		myLinkedList.append("FirstNode");
		assertFalse(myLinkedList.isEmpty()); // linked list should not be empty
		assertEquals(1, myLinkedList.length()); // length of linked list should be 1
		assertEquals("FirstNode",myLinkedList.getFirst().getData());
		assertEquals("FirstNode",myLinkedList.getLast().getData());
		

	}
	
	@Test
	public void addingTwoElementTest() {
		
		SimpleLinkedListImpl myLinkedList = new SimpleLinkedListImpl();
		assertTrue(myLinkedList.isEmpty()); // linked list should be empty
		assertEquals(0, myLinkedList.length()); // length of linked list should be zero
		
		
		myLinkedList.append("FirstNode");
		myLinkedList.append("SecondNode");
		assertFalse(myLinkedList.isEmpty()); // linked list should not be empty
		assertEquals(2, myLinkedList.length()); // length of linked list should be 2		
		assertEquals("FirstNode",myLinkedList.getFirst().getData());
		assertEquals("SecondNode",myLinkedList.getLast().getData());

	}

}
