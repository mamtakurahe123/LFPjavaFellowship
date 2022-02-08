package snakeladderprogram;
import java.util.Random;

public class UC2 {

public static void main(String[] args) {
		
		int playerposition=0, dice;
		
		System.out.println("Welcome to snake ladder program");		
		
		//Player Position 
		 System.out.println("Staring position of the player is " + playerposition);
		
		//Roll Dice
	       Random rand = new Random();
	         dice = rand.nextInt((6)+1);
	       System.out.println("Roll Dice: " + dice);
	}
	
}
