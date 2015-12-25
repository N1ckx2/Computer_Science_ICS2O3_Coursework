/*Set ()
Nicholas Vadivelu
ICS203
<Date>*/

import java.awt.*;
import hsa.Console;

public class VN_MenuTemp
{
    static Console c;

//*******************************Name of Program*********************************

    public static void Clas ()  
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
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 or 15");
	    c.println ("1 - ");
	    c.println ("2 - ");
	    c.println ("3 - ");
	    c.println ("4 - ");
	    c.println ("5 - ");
	    c.println ("6 - ");
	    c.println ("7 - ");
	    c.println ("8 - ");
	    c.println ("9 - ");
	    c.println ("10 - ");
	    c.println ("11 - ");
	    c.println ("12 - ");
	    c.println ("13 - ");
	    c.println ("14 - ");
	    c.println ("15 - ");


	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) ();
	    else if (choice == 2) ();
	    else if (choice == 3) ();
	    else if (choice == 4) ();
	    else if (choice == 5) ();
	    else if (choice == 6) ();
	    else if (choice == 7) ();
	    else if (choice == 8) ();
	    else if (choice == 9) ();
	    else if (choice == 10) ();
	    else if (choice == 11) ();
	    else if (choice == 12) ();
	    else if (choice == 13) ();
	    else if (choice == 14) ();
	    else if (choice == 15) ();
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
