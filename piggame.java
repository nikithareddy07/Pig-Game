import java.util.Scanner;
import java.util.Random;

public class Pig
{
  public static void main(final String[] args)
{
	  int humanScore = 0;
	  int humanTotal = 0;
	  int computerScore = 0;
	  int subtotal = 0;
	  int humanRoll, computerRoll;
	  final Scanner keyboard = new Scanner(System.in);
	  final Random rand = new Random();
	  char choice = 'h';
	  String input;
	  System.out.println("Welcome to the game of Pig!\n");
	  System.out.println("It is Human's Turn.");
	  System.out.println("_ _ _ _ _ _ _ _ _ _ _\n");
			    while (subtotal < 100 && humanTotal < 100)//computerScore < 100 && humanScore < 100
	  {
		do
		  {
	       humanRoll = rand.nextInt(6) + 1;
	       System.out.println("You rolled: " + humanRoll);
	       if (humanRoll == 1)
	         {
	    	   humanScore = 0;
	    	   System.out.print("You lose your turn! ");
	    	   System.out.print("Your current turn gets " + humanScore + " points.");// it should be humanScore instead of humanTotal
	    	   break;
	         }
	       else
	       {
	    	   humanScore += humanRoll; 
	    	   System.out.println("Your turn score is " + humanScore + " and your total score is " + humanTotal);
	    	   System.out.println("If you hold you will have " + (humanScore+humanTotal) + " points.");
	    	   System.out.println("Enter 'r' to roll again, 'h' to hold.");
	    	   input = keyboard.nextLine();
	    	   choice = input.charAt(0);
		          if (choice == 'h')
	    	   {
	    		   humanTotal += humanScore;
	    		   break;
	    	   }
	       }
		  }
		while (humanRoll != 1 && choice == 'r');// 'r' for more clarity 
		if (humanTotal >= 100) //use if instead of while
		  {
			  System.out.println("YOU WIN!");
			  break;
		  }
		//humanTotal += humanScore;// no need of this
		System.out.println("\nYour score is " + humanTotal);
		humanScore = 0;
		System.out.println();
		System.out.println("It is the computer's turn.");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _\n");
		do
		{
			computerRoll = rand.nextInt(6) + 1;
			System.out.println("The computer rolled: " + computerRoll);
			if (computerRoll == 1)
			{
				computerScore = 0;
				System.out.print("The computer lost its turn!");
				System.out.println(" Computer total is " + subtotal);
				break;
			}
			else
			{  
				computerScore += computerRoll;
				if (computerScore >= 20 )//|| subtotal >= 100 no need of this here
				{
				System.out.println("The computer holds");
				break;
				}
			}
      }
		while (computerRoll != 1 && computerScore <20);//it should be computerScore <20 not subtotal <=20
		subtotal += computerScore;
		System.out.println("The computer's score is " + subtotal + "\n");
		computerScore = 0;
		if (subtotal >= 100)//use if instead of while
		  {
			  System.out.println("THE COMPUTER WINS!");
			  break;
		  }  
	  }
	   
}
  
}



