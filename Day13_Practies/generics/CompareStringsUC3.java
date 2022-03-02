package generics;
import java.lang.String;
import java.util.Scanner;


public class CompareStringsUC3<T extends Comparable<T>> {
	T first;
	T second;
	T third;
	
	public CompareStringsUC3(T x, T y, T z) {
		this.first = x;
		this.second = y;
		this.third = z;
	}
	
	 public T maximum() {
		 return testMaximum(first,second,third);
	 }
	//@SuppressWarnings("hiding")
	public <T extends Comparable<T>> T testMaximum(T first, T second, T third) {
		T max = first;
		
		if(second.compareTo(max)>0) {
			max=second;
		}
		else if(third.compareTo(max)>0) {
			max=third;
		}
		return max;
		
	}
	
	public static void main(String args[]) {
		   System.out.println("Maximum value is : " + new CompareStringsUC3<Integer>(6,9,5).maximum());
		   CompareStringsUC3<String> String = new CompareStringsUC3<String>("Mamta","Muskan","Mohini");	
		   System.out.println("Maximum String value is : " + String.maximum());
		   
	   }
}
