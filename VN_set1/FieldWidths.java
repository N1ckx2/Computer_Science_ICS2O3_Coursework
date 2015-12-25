/* Nicholas Vadivelu
Mr. Brossard
ICS203
September 11th, 2014 */

//******************FieldWidths******************
import java.awt.*;
import hsa.Console;

public class FieldWidths
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.print("1234567890");
	c.println("12345678902345");
	//First, display column numbers
	c.print("Hello", 6);
	c.print("Hello", 6);
	c.print("Hello");
	c.println();
	c.println();
	c.println("1234567890123456789012345678901234567890");
	c.print("Hello", 12);
	c.print("Hello", 12);
	c.print("Hello");
	c.println();
	c.println();
	c.println("12345678901234567890");
	c.print("", 5);
	c.println("COMPUTER STUDIES");
	c.println();
	c.print("", 5);
	c.print("Theory", 15);
	c.println("Practical");
	
	
    } // main method
} // FieldWidths class

/* Programmer Joke #8

Program, noun: A magic spell cast upon a computer
to enable it to turn input into error messages.

Ba Dum Tss!

*/
