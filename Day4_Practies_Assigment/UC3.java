package snakeladderprogram;
import java.util.Scanner;
import java.util.Random;

public class UC3 {
	
	public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int POSITION_CHECK = 0;
	
	public static void main(String[] agrs) {
		
		int player_position=0, position=0;
		
		System.out.println("Welcome to snake ladder program");		
		
		//Player Position 
		 System.out.println("Staring position of the player is " + player_position);
		
		//Roll Dice
	       Random rand = new Random();
	       int dice = 0;
	       while (true)
	       {
	            dice = rand.nextInt((6)+1);
	              if(dice != 0) break;
	       }
	        System.out.println("Number of dice: " + dice);
	        
	        //check option 
	        Random op = new Random();
	        int option = 0;
	        while(true) {
	        	option = op.nextInt(4);
	        	if(option != 0)break;
	        }
	        
	         System.out.println("*OPTIONS*\nOption 1 : No Play\nOption 2 : Ladder \nOption 3 : Snake ");
	         System.out.println("Options : " + option);
	         System.out.println("Number of dice: " + dice);
	         System.out.println("Roll Dice: " + dice);

	         //using switch case statement to check the condition of the player 
	         
	         //in the place of switch case we can use if/else statement
	         switch (option) {
	           case NO_PLAY:
	                    System.out.println("Player stays in the same position : " + position);
	           break;
	           case LADDER:
	               position += dice;
	               if ((position + dice) > POSITION_CHECK)
	                    System.out.println("Player moves ahead by : " + position);
	           break;
	           case SNAKE:
	               position += dice;
	               if ((position + dice) < POSITION_CHECK){
	                    position = POSITION_CHECK;
	                    System.out.println("Player moves behind by : " + position);
	               }
	               else
	                    System.out.println("Player moves behind by: " + position);
	           break;
	           default:
	                    System.out.println("Enter correct value");
	           break;
	       }
	        
	}

}
