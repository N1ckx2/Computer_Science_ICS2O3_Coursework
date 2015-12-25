/* Nicholas Vadivelu
ICS 203-02
November 20, 2014
Array Assignment */

import java.awt.*;
import hsa.Console;

public class VN_ArrayAssignment
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	char n; //char to exit or continue
	do
	{
	    c.clear(); //clear screen
	    int size, sum, prod, i; // declares sum, product, size of array and iterator
	    prod = 1;
	    sum = 0;
	    c.print ("Enter the size of the array using an integer: ");
	    size = c.readInt (); //prompt and receive size of array
	    int[] array = new int [size]; // declares the array
	    for (i = 0 ; i < size ; i++)
	    {
		c.println ("Enter a number to store in element " + (i + 1));
		array [i] = c.readInt (); //prompts and receives array elements
		prod *= array [i]; //multiplies array elements
		sum += array [i];  //adds up array elements
	    }
	    for (i = 0 ; i < size ; i++)
	    {
		c.println ("Element " + (i + 1) + " = " + array [i]); //outputs array elements
	    }
	    c.println ("\nThe sum of the numbers is " + sum); // outputs sum
	    c.println ("The product of the numbers is " + prod);  //outputs product
	    c.println ("\nYou picked a fine size user.");
	    c.println ("With just 1 for loop we filled the array efficiently.");
	    c.println ("Thank you for loop"); // ending message
	    c.println ("\nEnter <q> to exit or any other key to start over."); //prompt for char
	    n = c.getChar(); //get the continue or exit char
	}
	while (n != 'q'); //continue so long as n does not equal q
	c.println ("\nGoodbye!!!"); //goodbye message
	// Place your program here.  'c' is the output console
    } // main method
} // ArrayAssignment class
