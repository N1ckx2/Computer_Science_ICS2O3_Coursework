/*Nicholas Vadivelu
Mr. Brossard
ICS203
September 15th, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_Menu_Set2
{
    static Console c;

//*******************************PrintName*********************************


    public static void PrintName ()  
    {
	c.println("My name is Nicholas.");
	c.println("I am in Grade 10.");
	c.println("I go to Marc Garneau Collegiate Institute.");
	c.println("I live in Markham.");
    }
    
//*******************************PrintOutput*********************************

    public static void PrintOutput()
    {
	c.print("12345678901234567890 ");
	c.print("Hello ");
	c.print("How are you");
	c.println("XXXXXXXXXXXXXXX");
    }
    
//*******************************Music*********************************

    public static void Music()
    {
	c. println("123456789012345");
	c.println("  Rock and Roll");
	c.println("      Metal");
	c.println();
	c.println("    The Blues");
    }
//*******************************Shopping*********************************

    public static void Shopping()
    {
	c.print("I am going ");
	c.println("to the");
	c.println("shopping mall.");
	c.println();
	c.println("There is no bus");
	c.println("may I have a lift?");
    }
//*******************************PrintOutputb*********************************

    public static void PrintOutputb()
    {
	c.print("12345678901234567890 ");
	c.print("Hello. " + "How are you today?");
	c.println("XXXXXXXXXXXXXXX");
    }
//*******************************NameAndAddress*********************************

    public static void NameAndAddress()
    {
	c.println("\t\t\t\tNicholas Vadivelu");
	c.println("\t\t\t\t54 Hepburn Street");
	c.println("\t\t\t\tMarkham");
	c.println("\t\t\t\tOntario");
	c.println("\t\t\t\tL3S 3Z9");
    }
//*******************************VirusWarning*********************************

    public static void VirusWarning()
    {
	c.println("\t" + "WARNING" + "\n");
	c.println("\tPossible virus detected \n\tReboot and run antivirus software");

    }
//*******************************Fieldwidths*********************************

    public static void Fieldwidths()
    {
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


