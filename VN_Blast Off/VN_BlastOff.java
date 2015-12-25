/*Set 8
Nicholas Vadivelu
ICS203
October 14th, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_BlastOff
{
    static Console c;

//*******************************While*********************************

    public static void While ()  throws InterruptedException 
    {
	int x = 10; //declare variable
	
	while (x >= 0) //as long as x is bigger than 0 it runs
	{
	    c.clear(); // clears screen
	    if (x == 0)
	    {
		c.println("Blast Off!!!!"); //prints blast off at 0
	    }
	    else
	    {
		c.println(x); //counts down
	    }
	    Thread.sleep(500); //waits for 500 ms
	    x--; //subtracts 1 from x
	}
    }

//*******************************DoWhile*********************************

    public static void DoWhile ()  throws InterruptedException 
    {
	int x = 10;//declare variable
	
	do {
	    c.clear(); // clears screen
	    if (x == 0)
	    {
		c.println("Blast Off!!!!"); //prints blast off at 0
	    }
	    else
	    {
		c.println(x); //counts down
	    }
	    Thread.sleep(500);//waits for 500 ms
	    x--;//subtracts 1 from x
	    
	} while(x >= 0); //as long as x is bigger than 0 it runs
    }
    
//*******************************While*********************************

    public static void For ()  throws InterruptedException 
    {
	for(int x = 10; x >= 0; x--) //declare variable, while greater than 0, subtracts 1 from x
	{
	    c.clear();
	    if (x == 0) 
	    {
		c.println("Blast Off!!!!"); //prints blast off at 0
	    }
	    else
	    {
		c.println(x); //counts down
	    }
	    Thread.sleep(500); //waits for 500 ms
	}
    }
    
//***********************************Menu Program Here*************************
    public static void main (String[] args) throws InterruptedException 
    {

	c = new Console ();

	int choice;

	do
	{
	    //Promting for choice
	    c.println("Blast off by Nicholas Vadivelu\n");
	    c.println ("Choose from the following menu\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 or 15");
	    c.println ("1 - While");
	    c.println ("2 - Do While");
	    c.println ("3 - For");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) While();
	    else if (choice == 2) DoWhile();
	    else if (choice == 3) For();

	c.print ("\n\nPress enter to continue");
	c.getChar ();
	
	c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
	// Place your program here.  'c' is the output console
    } // main method
} // Menu class
