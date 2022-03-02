package generics;

import java.util.Scanner;

class GenericClassUC5<T extends Comparable<T>>{
	T first;
	T second;
	T third;
	
	public GenericClassUC5(T x, T y, T z) {
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
		Scanner input = new Scanner(System.in);
		int ans;
		do {
			System.out.println("1.Integers\n2.Float\n3.String\nSelect Your Choice: ");
			int ch = input.nextInt();
			switch(ch) {
			case 1:
			{
				System.out.print("Enter First Value: \n");
				Integer first = input.nextInt();

				System.out.print("Enter Second Value: \n");
				Integer second = input.nextInt();

				System.out.print("Enter Third Value: \n");
				Integer third = input.nextInt();

				System.out.println("Maximum Integer value is : " + new GenericClassUC5(first, second, third).maximum());

				break;
			}				
			case 2:
			{
				System.out.print("Enter First Value: \n");
				Float first = input.nextFloat();

				System.out.print("Enter Second Value: \n");
				Float second = input.nextFloat();

				System.out.print("Enter Third Value: \n ");
				Float third = input.nextFloat();

				System.out.println("Maximum float value is : " + new GenericClassUC5(first, second, third).maximum());
				break;
			}
			case 3:
			{
				System.out.print("Enter First Value:  \n");
				String first = input.nextLine();

				System.out.print("Enter Second Value: \n");
				String second =  input.nextLine();

				System.out.print("Enter Third value \n");
				String third =  input.nextLine();
				

				System.out.println("Maximum String value is : " + new GenericClassUC5(first, second,third).maximum());
				break;
			}
			default:
				System.out.println("Enter Choice Between 1 And 3");				
			}
			System.out.println("Do you want to continue ? press 1 for continue");
			ans =  input.nextInt();
		}while(ans == 1);
		
	}
}

