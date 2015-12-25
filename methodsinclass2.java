/* For this in-class assignment, you are to complete the program by writing the methods getint,
   getDigit and noVowels so that the program can produce the output shown.

   I would suggest that you write near-empty methods with return statements first to get the
   program running, then work on the problems themselves.

   YOU ARE NOT ALLOWED TO CHANGE THE MAIN PROGRAM.
*/
import java.awt.*;
import hsa.Console;

public class MethodsInclass2
{
    static Console c;

    /* getInt is an overloaded method that uses a loop to do a range check and displays an error
       message as shown below if the user enters a value outside the range.  Since you did this
       as an assignment and have access to your files, this should be automatic marks.

       getDigit will return the specified digit from the given number.  If the digit doesn't exist
       (ex. 3rd digit of 57) or a negative value is entered, a -1 should be returned.

       noVowels will return a version of the accepted string that doesn't have any vowels
       (caps or small AEIOU)
       
       BONUS METHOD
       excluded will accept an additional string that contains the characters to be excluded
       from the returned version
    */

    public static void main (String [] args)
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
	
	// c.println( "\nThe excluded letters version is " + exclude(message,"AEIOUaeiou"));
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
