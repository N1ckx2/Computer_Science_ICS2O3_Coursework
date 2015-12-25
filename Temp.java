/*Set 5
Nicholas Vadivelu
Mr. Brossard
ICS203
September 23rd, 2014*/

import java.awt.*;
import hsa.Console;

public class Temp
{
    static Console c;

//*******************************PrintName*********************************


    public static void PrintName ()  
    {
    }
//***********************************Menu Program Here*************************
    public static void main (String[] args)
    {

	c = new Console ();

	int choice;

	do
	{
	    //Promting for choice
	    c.println ("Choose from the following menu\n");
	    c.println ("Enter 1, 2, 3, 4");
	    c.println ("1 - PrintName");
	    c.println ("2 - PrintOutput");
	    c.println ("3 - Music");
	    c.println ("4 - Shopping");
	    c.println ("5 - PrintOutputb");
	    c.println ("6 - NameAndAddress");
	    c.println ("7 - VirusWarning");
	    c.println ("8 - Fieldwidths");


	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) PrintName();
	    else if (choice == 2) PrintOutput();
	    else if (choice == 3) Music();
	    else if (choice == 4) Shopping();
	    else if (choice == 5) PrintOutputb();
	    else if (choice == 6) NameAndAddress();
	    else if (choice == 7) VirusWarning();
	    else if (choice == 8) Fieldwidths();
	c.print ("\n\nPress enter to continue");
	c.getChar ();
	
	c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
	// Place your program here.  'c' is the output console
    } // main method
} // Menu Demo class
