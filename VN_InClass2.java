/*Nicholas Vadivelu
ICS 203-02
November 27, 2014
In Class 2 */

/* For this in-class assignment, you are to complete the program by writing the methods getint,
   getDigit and noVowels so that the program can produce the output shown.

   I would suggest that you write near-empty methods with return statements first to get the
   program running, then work on the problems themselves.

   YOU ARE NOT ALLOWED TO CHANGE THE MAIN PROGRAM.
*/
import java.awt.*;
import hsa.Console;

public class VN_InClass2
{
    static Console c;


    //*****************************************getInt**************************************************
    public static int getInt (int x)
    {
	int y = c.readInt ();
	while (y > x || y < 0)
	{
	    c.println ("Invalid input, the number is outside of the range 0 to " + x + "\n"); //gives the user an error if the number is outside of range
	    c.print ("Input another number from 0 to " + x + ":"); //prompts for number
	    y = c.readInt (); //receives number
	} //keeps running so long as the number is not in the range
	/* getInt is an overloaded method that uses a loop to do a range check and displays an error
	   message as shown below if the user enters a value outside the range.  Since you did this
	   as an assignment and have access to your files, this should be automatic marks. */
	return y;
    }


    public static int getInt (int x, int z)
    {
	int y = c.readInt ();
	while (y < x || y > z)
	{
	    c.println ("Invalid input, the number is outside of the range " + x + " to " + z + "\n"); //gives the user an error if the number is outside of range
	    c.print ("Input another number from " + x + " to " + z + ": "); //prompts for number
	    y = c.readInt (); //receives number
	} //keeps running so long as the number is not in the range

	/* getInt is an overloaded method that uses a loop to do a range check and displays an error
	   message as shown below if the user enters a value outside the range.  Since you did this
	   as an assignment and have access to your files, this should be automatic marks. */
	return y;
    }


    //*****************************************getDigit**************************************************
    public static int getDigit (int num, int digit)
    {
	int digits[] = { - 1, -1, -1}; //makes an array to hold all the digits
	int finals[] = { - 1, -1, -1};
	int i = 0, y = 0;

	while (num > 0)
	{
	    digits [i++] = num % 10; //runs through all the digits to assign each to the array
	    num /= 10; //subtracts amount
	}
	for (int x = 2; x >= 0; x--)
	{
	    finals[y] = digits[x];
	    y++;
	}
	return finals [digit - 1];

	/*       getDigit will return the specified digit from the given number.  If the digit doesn't exist
	(ex. 3rd digit of 57) or a negative value is entered, a -1 should be returned. */
    }


    //*****************************************noVowels**************************************************
    public static String noVowels (String x)
    {
	char vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}; //makes an array of vowels
	String ret = ""; //delares return value
	for (int i = 0 ; i < x.length () ; i++)
	{
	    boolean t = true;
	    for (int y = 0 ; y < vowels.length ; y++)
	    {
		if (x.charAt (i) == vowels [y])
		    t = false;
	    } //if the character at that spot is a vowel, it makes t false
	    if (t)
		ret += x.charAt (i); //adds character to string when it isn't a vowel
	}
	return ret;
	/*       noVowels will return a version of the accepted string that doesn't have any vowels
	       (caps or small AEIOU) */
    }


    //*****************************************Bonus Method**************************************************
    public static String exclude (String message, String ex)
    {
	int[] exc = new int [ex.length () - 1];
	for (int i = 0 ; i < exc.length ; i++)
	{
	    exc [i] = ex.charAt (i); //adds all the characters into a string to check the other string
	}
	String ret = "";
	for (int i = 0 ; i < message.length () ; i++)
	{
	    boolean t = true;
	    for (int y = 0 ; y < exc.length ; y++)
	    {
		if (message.charAt (i) == exc [y]) //checks each character in the string to make sure it isn't one of the characters in the array
		    t = false;
	    }
	    if (t)
		ret += message.charAt (i); //adds character into the final string so long as it isn't a part of the array
	}
	return ret;
    }


    //*******************************************Main Method**********************************************
    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter an integer from 0 to 999: ");
	int number = getInt (999); // forces user to enter value from 0 to 999

	c.print ("\nWhich digit do you want?(1-3): ");
	int digit = getInt (1, 3); // forces user to enter value from 1 to 3

	c.println ("\nThe digit you requested is " + getDigit (number, digit));

	c.print ("\n\nEnter a secret message: ");
	String message = c.readLine ();

	c.println ("\nThe no vowel version is  " + noVowels (message));
	c.println ("\nThe excluded letters version is " + exclude (message, "AEIOUaeiou"));
    } // main method
} // Inclass2 class

/* Sample run

   Enter an integer from 0 to 999: 9876
   Not in range - 0 to 999: 987

   Which digit do you want?(1-3): 1

   The digit you requested is 9


   Enter a secret message: This is a test

   The no vowel version is  Ths s  tst
*/
