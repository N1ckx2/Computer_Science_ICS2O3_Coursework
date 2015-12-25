/* Nicholas Vadivelu
ICS 203-02
November 20, 2014 
Array Assignment */

import java.awt.*;
import hsa.Console;

public class ArrayAssignment
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int size, sum, prod, i;
	prod = 1;
	sum = 0;
	c.print ("Enter the size of the array using an integer: ");
	size = c.readInt();
	int[] array = new int[size];
	for (i = 0; i < size; i++)
	{
	    c.println ("Enter a number to store in element " + (i+1));
	    array[i] = c.readInt();
	    prod *= array[i];
	    sum += array[i];
	}
	for (i = 0; i < size; i++)
	{
	    c.println ("Element " + (i+1) + " = " + array[i]);
	}
	for 
	// Place your program here.  'c' is the output console
    } // main method
} // ArrayAssignment class
