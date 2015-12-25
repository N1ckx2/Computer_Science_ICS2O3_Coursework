/* For this in-class assignment, you are to complete the program by writing the methods getCard and
   quality.

   I would suggest that you write near-empty methods with return statements first to get the
   program running, then work on the problems themselves.

   YOU ARE NOT ALLOWED TO CHANGE THE MAIN PROGRAM (except for testing).
*/
import java.awt.*;
import hsa.Console;

public class Inclass2Nov06
{
    static Console c;

    // getCard simply accepts a low and high integer and returns a random integer in that range
    // 4 marks

    // show accepts an integer and displays the card value A (for 1), 2, 3, ... 10, 
    // J (for 11), Q (for 12), K (for 13)
    // 5 marks

    // quality accepts 3 integers and returns whether you have a pair, 3 of a kind or nothing
    // 6 marks
    
    // BONUS: add an option that identifies a straight (run of 3) - efficiency counts
    // 2 marks

    public static void main (String[] args)
    {
	c = new Console ();
	char again;

	do
	{
	    c.print ("\n\nHere is your 3-card hand: ");
	    int card1 = getCard (1, 13), card2 = getCard (1, 13), card3 = getCard (1, 13);

	    show (card1);
	    show (card2);
	    show (card3);

	    c.println ("\nYou have " + quality (card1, card2, card3));

	    c.print ("Do you want to play again?");
	    again = c.getChar ();
	}
	while (again == 'y');
    } // main method
} // Inclass2Nov06 class


/* Sample run

   Here is your 3-card hand: K J J
   You have a pair
   Do you want to play again?
   
   Here is your 3-card hand: 3 2 8
   You have nothing
   Do you want to play again?
   
   Here is your 3-card hand: Q Q Q
   You have 3 of a kind
   Do you want to play again?
   
   Here is your 3-card hand: J 9 10     BONUS ONLY
   You have a straight
   Do you want to play again?
   
   
*/
