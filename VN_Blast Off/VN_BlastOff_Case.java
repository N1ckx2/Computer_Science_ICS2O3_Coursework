/*Blast Off with Case and Switch
Nicholas Vadivelu
ICS203
October 30th, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_BlastOff_Case
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
	    c.println ("Enter 1, 2, or 3");
	    c.println ("1 - While");
	    c.println ("2 - Do While");
	    c.println ("3 - For");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    switch (choice)
	    {
		case 1: While();
			break;
		case 2: DoWhile();
			break;
		case 3: For();
			break;
		case 0: break;
		default: c.println("Input a valid number, use a different number");
			 break;
	    }

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
