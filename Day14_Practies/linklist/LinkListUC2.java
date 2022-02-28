//Ability to create Linked List by adding 30 and 56 to 70

package linklist;
import java.io.*;
import java.util.*;

public class LinkListUC2 {
	class Node{  
		
	       int data;    
	       Node next;    
	           
	       public Node(int data) {    
	           this.data = data;    
	           this.next = null;    
	       }    
	   }    
	   
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {    
	       //Create a new node    
	       Node newNode = new Node(data);    
	           
	       //Checks if the list is empty    
	       if(head == null) {    
	           //If list is empty, both head and tail will point to new node    
	           head = newNode;    
	           tail = newNode;    
	       }    
	       else {    
	           //newNode will be added after tail such that tail's next will point to newNode    
	           tail.next = newNode;    
	           //newNode will become new tail of the list    
	           tail = newNode;    
	       }    
	   }    
	       
	   //display() will display all the nodes present in the list    
	   public void display() {    
	       //Node current will point to head    
	       Node current = head;    
	           
	       if(head == null) {    
	           System.out.println("List is empty");    
	           return;    
	       }    
	       System.out.println("Nodes of singly linked list: ");    
	       while(current != null) {    
	           //Prints each node by incrementing pointer    
	           System.out.print(current.data + " ");    
	           current = current.next;    
	       }    
	       System.out.println();    
	   }    
	       
	   public static void main(String[] args) {    
	           
		   LinkListUC2 List = new LinkListUC2();    
	           
	       //Add nodes to the list    
	       List.addNode(56);    
	       List.addNode(30);    
	       List.addNode(70);    
	           
	       //Displays the nodes present in the list    
	       List.display();    
	   } 
}
