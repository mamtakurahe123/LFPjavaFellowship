//Lets create a simple Linked List of 56, 30 and 70

package linklist;
import java.io.*;
import java.util.*;

public class LinkListUC1 {
    
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(56);
		list.add(70);
		list.add(30);
		

		Iterator It = list.iterator();
		
		System.out.println("LinkedList elements:");
	    while(It.hasNext()){
	       System.out.println(It.next());
	    }
		
	}
}
