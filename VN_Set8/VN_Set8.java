/*Set 8
Nicholas Vadivelu
ICS203
October 19th, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_Set8
{
    static Console c;

    //*******************************8D: 1 - PrintChars*********************************

    public static void PrintChars ()
    {
	for (char n = 'a' ; n <= 'z' ; n++) // declares letter variable, says to run as long as it is before z, then add 1 to variable
	{
	    c.print (n, 2); //prints letter with a space
	}
	c.println (); // adds new line
	for (char n = 'a' ; n <= 'z' ; n++) // declares letter variable, says to run as long as it is before z, then add 1 to variable
	{
	    c.print (n, 4); // prints letter with 3 spaces
	}
	c.println ("\n");
	for (char n = 32 ; n <= 126 ; n++) // declares letter variable with an ascii value, runs as long as equal to or below 126, then add 1 to variable
	{
	    c.print (n + ": "); //prints character with a colon
	    c.print ((int) n); //prints the ascii code of the character
	    if ((int) n < 100)
		c.print (" | ");                  //divider for organization
	    else
		c.print ("| ");     //divider for organization
	}
    }


    //*******************************8D: 2 - PrintLbl*********************************

    public static void PrintLbl ()
    {
	for (int n = 0 ; n < 80 ; n++)
	{
	    if (n <= 80 / 2 - 11)
		c.print (" ");
	    else if (n >= 80 / 2 - 11 && n <= 80 / 2 + 11)
		c.print ("=");
	}
	c.print ("\n", 34);
	c.println ("realcoolclothing");
	c.print ("", 45);
	c.println ("from");
	c.print ("", 32);
	c.println ("ETHNIK AFRIKA");
	for (int n = 0 ; n < 80 ; n++)
	{
	    if (n <= 80 / 2 - 11)
		c.print (" ");
	    else if (n >= 80 / 2 - 11 && n <= 80 / 2 + 11)
		c.print ("=");
	}


    }


    //*******************************8E: 1 - PrintDiag*********************************

    public static void PrintDiag ()
    {
	int choice;
	int k = 6;
	do
	{
	    c.clear();
	    c.println ("Which pattern do you want to see?  Type in and <Enter> 1, 2, 3, or 4");
	    c.println ("1 - a)");
	    c.println ("2 - b)");
	    c.println ("3 - c)");
	    c.println ("4 - d)");
	    c.println ("0 - Exit");
	    choice = c.readInt ();
	    c.clear();
	    if (choice == 1)
	    {
		c.println ("a)");
		for (int j = 6 ; j >= 1 ; j--)
		{
		    c.println (j, j);
		}
	    } else if (choice == 2)
	    {
		c.println ("b)");
		for (int j = 1 ; j <= 6 ; j++)
		{
		    c.println (j, k);
		    k--;
		}
	    } else if (choice == 3)
	    {
		c.println ("c)");
		k = 1;
		for (int j = 6 ; j >= 1 ; j--)
		{
		    c.println (j, k);
		    k++;
		}
	    } else if (choice == 4)
	    {
		c.println ("d)");
		k = 0;
		for (char j = 'A' ; j <= 'F' ; j++)
		{
		    if (j == 'E')
			c.println ("EEEEEE");
		    else
		    {
			c.print ("", k);
			c.println (j);
		    }
		    k++;
		}
	    }
	    c.println("\nPress <Enter> to continue...");
	    c.getChar();
	} while (choice != 0);
    }


    //*******************************8E: 2 - ConvertTemp*********************************

    public static void ConvertTemp ()
    {
	double ti;
	int t;
	
	c.println("C = Centigrade \nF = Fahrenheit");
	for (int x = 100 ; x <= 280 ; x++)
	{
	    if (x == 180)
	    {
		c.println ("\nPress <Enter> to see the rest of the converted temperatures.");
		c.getChar ();
	    }
	    ti = 9 / 5 * x + 32;
	    t = (int)ti;
	    c.print ("C: " + x);
	    c.print (" F: " + t);
	    c.print (" | ");
	}
    }


    //*******************************8I: A - MaxNums*********************************

    public static void MaxNums ()
    {
	int n, m;
	m = 0;
	for (int i = 1 ; i <= 10 ; i++)
	{
	    c.print ("Enter number " + i + " followed by <Enter>: ");
	    n = c.readInt ();
	    if (n > m)
		m = n;
	}
	c.println ("\nThe largest number is " + m);
    }


    //*******************************8I: B - MaxNums2*********************************

    public static void MaxNums2 ()
    {
	int n, m, o;
	m = 0;
	c.print ("Type in the number of numbers followed by <Enter>: ");
	o = c.readInt ();
	c.println ();
	for (int i = 1 ; i <= o ; i++)
	{
	    c.print ("Enter number " + i + " followed by <Enter>: ");
	    n = c.readInt ();
	    if (n > m)
		m = n;
	}
	c.println ("\nThe largest number is " + m);
    }


    //*******************************8I: C - MaxNums3*********************************

    public static void MaxNums3 ()
    {
	int n, m, o;
	m = 0;
	c.print ("Type in the number of numbers followed by <Enter>: ");
	o = c.readInt ();
	c.println ();
	for (int i = 1 ; i <= o ; i++)
	{
	    c.print ("Enter number " + i + " followed by <Enter>: ");
	    n = c.readInt ();
	    if (i == 1) m = n;
	    else if (n < m) m = n;
	}
	c.println ("\nThe smallest number is " + m);
    }


    //*******************************8J - Baked Beans*********************************

    public static void BakedBeans ()
    {
	double[] bprice = new double [8];
	double cheap = 0;
	int i;
	String[] bname = new String [8];
	String cheapname = "";

	for (i = 0 ; i < 8 ; i++)
	{
	    c.print ("Type in the name of the bean brand and <Enter>: ");
	    bname [i] = c.readLine ();
	    c.print ("Type in the price of " + bname [i] + " and <Enter>: $");
	    bprice [i] = c.readDouble ();
	    if (i == 0)
		cheap = bprice [0];
	    else if (bprice [i] <= cheap)
	    {
		cheap = bprice [i];
		cheapname = bname [i];
	    }
	    c.println ();
	}
	c.clear ();
	for (i = 0 ; i < 8 ; i++)
	{
	    c.print (bname [i], 10);
	    c.print (bprice [i], 6, 2);
	    c.println ();
	}
	c.print ("\nThe cheapest brand of beans is " + cheapname + ", which costs $");
	c.println(cheap, 0, 2);
    }


    //*******************************197: 2*********************************

    public static void FivePatterns ()
    {
	int choice;
	do
	{
	    c.clear();
	    c.println ("Which pattern do you want to see?  Type in and <Enter> 1, 2, 3, 4, or 5");
	    c.println ("1 - a)");
	    c.println ("2 - b)");
	    c.println ("3 - c)");
	    c.println ("4 - d)");
	    c.println ("5 - e)");
	    c.println ("0 - Exit");
	    choice = c.readInt ();
	    c.clear();
	    if (choice == 1)
	    {
		c.println ("a)");
		for (int i = 1; i <= 4; i++)
		{
		    for (int y = 1; y <= i; y++)
		    {
			c.print(y);
		    }
		    c.println();
		}
	    } else if (choice == 2)
	    {
		c.println ("b)");
		for (int i = 1; i <= 4; i++)
		{
		    for (int y = 1; y <= i; y++)
		    {
			c.print(i);
		    }
		    c.println();
		}
	    } else if (choice == 3)
	    {
		c.println ("c)");
		for (int i = 1; i <= 4; i++)
		{
		    for (int y = 0; y < i; y++)
		    {
			c.print(i-y);
		    }
		    c.println();
		}
	    } else if (choice == 4)
	    {
		int y = 1;
		c.println ("d)");
		for (int i = 1; i <= 4; i++)
		{
		    for (int x = 1; x <=i; x++)
		    {
			c.print(y);
			y++;
		    }
		    c.println();
		}
	    } else if (choice == 5)
	    {
		c.println ("e)");
		for (int i = 1; i <= 5; i++)
		{
		    for (int y = 0; y < 5 ; y++)
		    {
			c.print(i+y);
		    }
		    c.println();
		}
	    }
	    c.println("\nPress <Enter> to continue...");
	    c.getChar();
	} while (choice != 0);
    }


    //*******************************197: 3a*********************************

    public static void Triangle ()
    {
	for (int i = 1; i <= 10; i+=2)
	{
	    for (int y = 1; y <= i; y++)
	    {
		c.print("%");
	    }
	    c.println();
	}
    }

    //*******************************197: 3b*********************************

    public static void Triangle2 ()
    {
	int x = 4;
	for (int i = 1; i <= 10; i+=2)
	{
	    c.print("", x);
	    for (int y = 1; y <= i; y++)
	    {
		c.print("%");
	    }
	    c.println();
	    x--;
	}
    }

    //***********************************Menu Program Here*************************
    public static void main (String[] args)
    {

	c = new Console ();

	int choice, x;
	x = 18;

	do
	{
	    //Promting for choice
	    c.println ("\t\t\t\t\t Set 8 \n\t\t\t\t By Nicholas Vadivelu");
	    for (int y = 0 ; y < 80 ; y++)
	    {
		c.print ('-');
	    }
	    c.println ("\nChoose from the following menu");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 or 15");
	    c.print ("1  - PrintChars", x);
	    c.println (" - 8D: 1");
	    c.print ("2  - PrintLbl", x);
	    c.println (" - 8D: 2");
	    c.print ("3  - PrintDiag", x);
	    c.println (" - 8E: 1");
	    c.print ("4  - ConvertTemp", x);
	    c.println (" - 8E: 2");
	    c.print ("5  - MaxNums", x);
	    c.println (" - 8I: a");
	    c.print ("6  - MaxNums2", x);
	    c.println (" - 8I: b");
	    c.print ("7  - MaxNums3", x);
	    c.println (" - 8I: c");
	    c.print ("8  - BakedBeans", x);
	    c.println (" - 8J");
	    c.print ("9  - FivePatterns", x);
	    c.println (" - 197: 2");
	    c.print ("10 - Triangle", x);
	    c.println (" - 197: 3a");
	    c.print ("11 - Triangle2", x);
	    c.println (" - 197: 3b");


	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();
	    c.clear ();
	    if (choice == 1)
		PrintChars ();
	    else if (choice == 2)
		PrintLbl ();
	    else if (choice == 3)
		PrintDiag ();
	    else if (choice == 4)
		ConvertTemp ();
	    else if (choice == 5)
		MaxNums ();
	    else if (choice == 6)
		MaxNums2 ();
	    else if (choice == 7)
		MaxNums3 ();
	    else if (choice == 8)
		BakedBeans ();
	    else if (choice == 9)
		FivePatterns ();
	    else if (choice == 10)
		Triangle ();
	    else if (choice == 11)
		Triangle2 ();
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
