package linklist;

class Node1 {
	int data;
	Node1 next;
public Node1(int data) {
		this.data = data;
		this.next = null;
	}	
}

class operations {
	// Taking variables to store the head.
	Node1 head;
	public void pushData(int data) {
		
		//created the object of the Node class to get the address of the Node and
		// passing the "data" it will store in constructor
		Node1 newnode = new Node1(data);
		if (head == null) {
			head = newnode;
		} else {
			Node1 temp = head;
			this.head = newnode;
			newnode.next = temp;			
		}
	}
	public void print() {
		if (head == null)
			System.out.println("Empty LinkedList");
		else {
			Node1 temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}
}
public class UC2_CreateLinkedList_toAddElement {

	public static void main(String[] args) {
		System.out.println("Welcome To LinkList Program");
		operations link = new operations();
		link.pushData(70);
		link.pushData(30);
		link.pushData(56);
		link.print();
		}
}
