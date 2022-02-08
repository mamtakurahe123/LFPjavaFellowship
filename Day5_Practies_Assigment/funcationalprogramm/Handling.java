package funcationalprogramm;
import java.util.*;

class Counter {
	private static int count;
	public Counter() {
		count++;
	}
	public static void show() {
		System.out.println(count);
	}
}

public class Handling {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		c1.show();
		c2.show();
		c3.show();
		Counter.show();
		
		int x=5,y=8;
		new U().swap(x, y);
		System.out.println(x+ " " +y);
		
	}

}
//coll by value example
class U{
	public void swap(int x, int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
}

