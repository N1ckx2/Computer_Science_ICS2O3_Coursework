/* Nicholas Vadivelu
ICS 203-02
November 29, 2014
In Class 2b*/

/* For this in-class assignment, you are to complete the program by writing these methods so that
   the program can produce the output shown.

   I would suggest that you write near-empty methods with return statements first to get the
   program running, then work on the problems themselves.

   1. numCaps accepts a string, then returns the number of characters that are capital letters.

   2. capitalize accepts a string of words, then returns the string with the first letter in each
      word capitalized.  A word starts after a space (or spaces).
      HINT: toUpperCase will only change a string, so use a string of length 1 at start of words

   3. reverse accepts a string, then returns the same string in reverse order
      HINT: build the new string like in alphabetize (or yesterday's noVowels)

   YOU ARE NOT ALLOWED TO CHANGE THE MAIN PROGRAM (except for commenting out code).
*/
import java.awt.*;
import hsa.Console;

public class VN_InClass2b
{
    static Console c;
    //*************************************numCaps*********************************
    public static int numCaps (String x)
    {
	char[] caps = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; //all capital letters
	int counter = 0, i, y;
	for (i = 0 ; i < x.length () ; i++) //goes through every letter in the message
	    for (y = 0 ; y < caps.length ; y++) //goes through ever element in the array
		if (x.charAt (i) == caps [y])
		    counter++;                             //if that letter is a capital letter, add one to counter

	return counter;
    }


    //*************************************Capitalize*********************************
    public static String capitalize (String x)
    {
	String fnl = "";
	int i, let; //let will be the ASCII value of the character
	// finl = x.toUpperCase(); <-------the easy way
	for (i = 0 ; i < x.length () ; i++)
	{
	    let = (int) x.charAt (i); //gets the ascii value of that character
	    if (let >= 97 && let <= 122)
		let -= 32;     //makes the ascii value 32 less to get the capital number
	    fnl += (char) let;
	}
	return fnl;
    }


    //*************************************Reverse*********************************
    public static String reverse (String x)
    {
	String fnl = ""; //creates return variable
	for (int i = x.length()-1 ; i >= 0 ; i--) 
	    fnl += x.charAt (i); //goes through ever character in the original string backwards
	return fnl;
    }


    //************************************Main************************************
    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("\n\nEnter a multi-word message: ");
	String message = c.readLine ();

	c.println ("\nThe message has " + numCaps (message) + " capital letter(s).");

	c.println ("\nThe capitalized version is " + capitalize (message));

	c.println ("\nThe reversed version is " + reverse (message));
    } // main method
} // Inclass2 class

/* Sample run

   Enter a multi-word message: This is a test

   The message has 1 capital letter(s).

   The capitalized version is  This Is A Test

   The reversed version is tset a si sihT
*/
