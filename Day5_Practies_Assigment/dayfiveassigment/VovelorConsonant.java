package dayfiveassigment;
import java.util.Scanner;

public class VovelorConsonant {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter any charector or latter");
		char ch = sc.next().charAt(0);
		
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
	         System.out.println("Given character is an vowel");
	      }else{
	         System.out.println("Given character is a consonant");
	      }
		}

}
