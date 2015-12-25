/*Set 7
Nicholas Vadivelu
ICS203
October 7, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_Set7
{
    static Console c;

//*******************************P112 - CheckDivision*********************************

    public static void CheckDivision ()  
    {
	double a, b, result;
	c.println("Enter a value for a");
	a = c.readDouble();
	c.println("Enter a value for b");
	b = c.readDouble();
	if (b!=0)
	{
	    result = a/b;
	    c.print("The result is ");
	    c.println(result, 0, 2);
	}
	else
	{
	    c.println("This calculation cannot be performed!");
	}
    }

//*******************************P113 - NumChars*********************************

    public static void NumChars ()  
    {
	String wrd;
	int num, posn;
	c.println("Type any word <Enter> ");
	wrd = c.readString();
	num = wrd.length();
	
	if (num%2 != 0)
	{
	    c.println(wrd + " has an odd numbers of letters.");
	    posn = num/2+1;
	    c.println("The middle letter is at position " + posn);
	}
	else
	{
	    c.println(wrd + " has an even number of letters.");
	}
    }
    
//*******************************P119 - MaxMinNum*********************************

    public static void MaxMinNum ()  
    {
	int max, min, num;
	max = 60;
	min = 21;
	c.println("Enter any whole number: ");
	num = c.readInt();
	
	if (num>0)
	{
	    c.println("Your number "+num+" is larger than zero");
	}
	else
	{
	    c.println("Your number is negative or zero");
	}
	
	if (num>max)
	{
	    c.println("Your number "+num+" is larger than "+max);
	}
	if (num < min)
	{
	    c.println("Your number "+num+" is smaller than "+min);
	}
	
    }
    
//*******************************P120 CheckDivision2*********************************

    public static void CheckDivision2 ()  
    {
	double a, b, result;
	c.println("Enter a value for a");
	a = c.readDouble();
	c.println("Enter a value for b");
	b = c.readDouble();
	if (b==0)
	{
	    c.println("This calculation cannot be performed!");
	}
	else
	{
	    result = a/b;
	    c.print("The result is ");
	    c.println(result, 0, 2);
	}
    }

//*******************************P121 - EvenOddNum*********************************

    public static void EvenOddNum ()  
    {
	int num, mult;
	c.print("Type in any integer and <Enter>: ");
	num = c.readInt();
	c.print("\nType in another integer and <Enter>: ");
	mult = c.readInt();
	c.println();
	if (num%mult == 0)
	{
	    c.println(mult + " is a multiple of " + num + ".");
	}
	else
	{
	    c.println(mult + " is not a multiple of " + num + ".");
	}
    }
    
//*******************************Discount*********************************

    public static void Discount ()  
    {
	c.print("Type in the total amount spent and <Enter>: $");
	double cost = c.readDouble();
	c.println();
	
	if (cost > 100.00)
	{
	    c.print("The final cost will be $");
	    c.println((cost*0.9), 0, 2);
	}
	else if (cost < 100.00)
	{
	    c.print("The final cost will be $");
	    c.println(cost, 0, 2);
	}
    }

//*******************************TestNumber*********************************

    public static void TestNumber ()  
    {
	int num;
	c.print("Type in any number and <Enter>: ");
	num = c.readInt();
	if (num > 0)
	{
	    c.println (num + " is positive");
	}
	else 
	{
	    c.println (num + " is negative");
	}
	if (num % 7 == 0)
	{
	    c.println(num + " is divisble by 7");
	}
	else
	{
	    c.println(num+" is NOT divisble by 7");
	}
    }

//*******************************Driving*********************************

    public static void Driving ()  
    {
	c.print("How old are you?: ");
	int age = c.readInt();
	c.println();
	
	if (age <=75 && age >=18) c.println("Age OK.  Have you got a driver's licence?");
	else if (age < 18) c.println("Too young to drive.");
	else if (age > 75) c.println("Sorry you are over the legal age limit for driving.");
	
    }
    
//*******************************MarSymbol*********************************

    public static void MarSymbol ()  
    {
	c.print("Type a mark and <Enter>: ");
	int mark = c.readInt();
	c.println();
	if (mark >= 80) c.println('A');
	else if (mark >= 70 && mark < 80) c.println('B');
	else if (mark >= 60 && mark < 70) c.println('C');
	else if (mark >= 50 && mark < 60) c.println('D');
	else if (mark < 50) c.println('E');
    }
    
//*******************************CompareNumChars *********************************

    public static void CompareNumChars  ()  
    {
	String wrd1, wrd2;
	c.print("Type in a word and <Enter>: ");
	wrd1 = c.readString();
	c.print("\nType in another word and <Enter>: ");
	wrd2 = c.readString();
	c.println();
	
	if (wrd1.length() < wrd2.length()) c.println(wrd1 + " then " + wrd2);
	else if (wrd2.length() < wrd1.length()) c.println(wrd2 + " then " + wrd1);
	else c.print(wrd1 + " is the same length as " + wrd2);
    }
    
//*******************************SportingEvents*********************************

    public static void SportingEvents ()  
    {
	int year;
	c.print("Type in a year and <Enter>: ");
	year = c.readInt();
	c.println();
	
	if (year%4 == 0) c.println("This year the Olympics will be held");
	else if (year%4 == 1) c.println("There will be no sporting events this year");
	else if (year%4 == 2) c.println("This year the Cricket World Cup will be held");
	else if (year%4 == 3) c.println("This year the Rugby World Cup will be held");
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
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, or 10");
	    c.println ("1 - CheckDivision");
	    c.println ("2 - NumChars");
	    c.println ("3 - MaxMinNum");
	    c.println ("4 - CheckDivision2");
	    c.println ("5 - EvenOddNum");
	    c.println ("6 - Discount");
	    c.println ("7 - TestNumber");
	    c.println ("8 - Driving");
	    c.println ("9 - MarSymbol");
	    c.println ("10 - CompareNumChars ");
	    c.println ("11 - SportingEvents");



	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) CheckDivision();
	    else if (choice == 2) NumChars();
	    else if (choice == 3) MaxMinNum();
	    else if (choice == 4) CheckDivision2();
	    else if (choice == 5) EvenOddNum();
	    else if (choice == 6) Discount();
	    else if (choice == 7) TestNumber();
	    else if (choice == 8) Driving();
	    else if (choice == 9) MarSymbol();
	    else if (choice == 10) CompareNumChars();
	    else if (choice == 11) SportingEvents();
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
