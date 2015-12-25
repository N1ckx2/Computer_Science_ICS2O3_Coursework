/*Nicholas Vadivelu
ICS 203-02
November 29, 2014
In Class2 Nov 06*/

/* For this in-class assignment, you are to complete the program by writing the methods getCard and
   quality.

   I would suggest that you write near-empty methods with return statements first to get the
   program running, then work on the problems themselves.

   YOU ARE NOT ALLOWED TO CHANGE THE MAIN PROGRAM (except for testing).
*/
import java.awt.*;
import hsa.Console;
import java.lang.Math;

public class VN_Inclass2Cards2
{
    static Console c;

    public static int[] sort (int[] nums)
    { //takes unsorted array, returns sorted
	int index = 1; //start of search
	int temp;
	while (index < nums.length)
	{ //until the array is fully sorted
	    if (nums [index] < nums [index - 1])
	    { //compares nums[index] with nums[index-1]. if smaller, switch.
		temp = nums [index];
		nums [index] = nums [index - 1];
		nums [index - 1] = temp;
		index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
		if (index == 0) //prevents index from going lower than 1
		    index = 1;
	    }
	    else
		index++; //if sorted, go up
	}
	return nums; //reaching the end of the array- completely sorted, returns nums
    }


    // getCard simply accepts a low and high integer and returns a random integer in that range
    // 4 marks
    //**************************************getCard*************************************************
    public static int getCard (int lo, int hi)
    {
	int card = (int) (Math.random () * (hi - lo) + lo); //makes random number in that range
	return card;
    }


    // show accepts an integer and displays the card value A (for 1), 2, 3, ... 10,
    // J (for 11), Q (for 12), K (for 13)
    // 5 marks
    //**************************************show*************************************************
    public static void show (int x)
    {
	String[] cards = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	c.print (cards [x - 1] + " "); //displays the appropriate card based on integer input
    }


    // quality accepts 3 integers and returns whether you have a pair, 3 of a kind or nothing
    // 6 marks
    //**************************************getCard*************************************************
    public static String quality (int one, int two, int three)
    {
	String ret = "";
	// BONUS: add an option that identifies a straight (run of 3) - efficiency counts
	// 2 marks
	int[] hand = {one, two, three};

	if (one == two && one == three && two == three)
	    ret = "3 of a kind!";
	else if (one == two || one == three || two == three)
	    ret = "a pair!";
	else
	{
	    sort (hand);
	    if (hand [0] == hand [1] - 1 && hand [1] == hand [2] - 1)
		ret = "a straight!";
	    else
		ret = "nothing.";
	}
	return ret;
    }



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
