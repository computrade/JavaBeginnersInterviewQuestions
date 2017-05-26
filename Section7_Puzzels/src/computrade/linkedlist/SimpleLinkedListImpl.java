package computrade.linkedlist;

public class SimpleLinkedListImpl {

	private Node head; // Head is first node in linked list

	public boolean isEmpty() {
		return length() == 0;
	}

	public void append(String data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		tail().setNext(new Node(data));
	}
	
	public Node getFirst(){
		return head;
	}
	
	public Node getLast(){
		return tail();
		
	}
	
	public boolean hasNext(Node node){
		
		if(node.getNext()!=null){
			return true;
		}else{
			return false;
		}
		
	}

	private Node tail() {
		Node tail = head; // Find last element of linked list known as tail
		while (tail.getNext() != null) {
			tail = tail.getNext();
		}
		return tail;
	}

	public int length() {
		int length = 0;
		Node current = head; // Starts counting from head - first node
		while (current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}

	
}
