package computrade.arrays;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicationTest {
	
	@Test
	public void testRemoveDuplicationWithSort(){
		RemoveDuplicationWithSort removeDuplicationWithSort = new RemoveDuplicationWithSort();
		
		System.out.println("====Starting testRemoveDuplicationWithSort====");
		
		int[] numbersWithDuplicates = new int[]{5, 2, 2, 3, 5};
		int[] expected =  new int[]{2, 3, 5}; 
		Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{1, 1, 1, 1, 1, 1, 1};
		expected =  new int[]{1};
		Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{1, 2, 3, 4, 5, 6, 7};
		expected =  new int[]{1, 2, 3, 4, 5, 6, 7};
		Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{1, 2, 1, 1, 1, 1, 1};
		expected =  new int[]{1, 2};
		Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{7, 7, 1, 6, 5, 5, 9,9};
		expected =  new int[]{1, 5, 6, 7, 9};
		//expected =  new int[]{7, 1, 6, 5, 9};
		Assert.assertArrayEquals(expected, removeDuplicationWithSort.removeDuplicates(numbersWithDuplicates));
		
	}
	
	
	@Test
	public void testRemoveDuplication(){
		RemoveDuplication removeDuplication = new RemoveDuplication();
		
		System.out.println("====Starting testRemoveDuplication====");
		int[] numbersWithDuplicates = new int[]{5, 2, 2, 3, 5};
		int[] expected =  new int[]{5, 2, 3}; 
		Assert.assertArrayEquals(expected, removeDuplication.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates = new int[]{1, 1, 2, 2, 3, 4, 5};
		expected =  new int[]{1, 2, 3, 4, 5}; 
		Assert.assertArrayEquals(expected, removeDuplication.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{1, 1, 1, 1, 1, 1, 1};
		expected =  new int[]{1};
		Assert.assertArrayEquals(expected, removeDuplication.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{1, 2, 3, 4, 5, 6, 7};
		expected =  new int[]{1, 2, 3, 4, 5, 6, 7};
		Assert.assertArrayEquals(expected, removeDuplication.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{1, 2, 1, 1, 1, 1, 1};
		expected =  new int[]{1, 2};
		Assert.assertArrayEquals(expected, removeDuplication.removeDuplicates(numbersWithDuplicates));
		
		numbersWithDuplicates= new int[]{7, 7, 1, 6, 5, 5, 9,9};
		expected =  new int[]{7, 1, 6, 5, 9};
		Assert.assertArrayEquals(expected, removeDuplication.removeDuplicates(numbersWithDuplicates));
		
	}
}
