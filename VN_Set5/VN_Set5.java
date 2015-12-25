/*Set 5
Nicholas Vadivelu
Mr. Brossard
ICS203
September 23rd, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_Set5
{
    static Console c;

//*******************************InputReals*********************************

    public static void InputReals ()  
    {
	//Nicholas Vadivelu, September 23, 2014
	double num1, num2;
	c.println("Type in one real number and <Enter>: ");
	num1 = c.readDouble();
	c.println("Type in another real numner and <Enter>: ");
	num2 = c.readDouble();
	c.println();
	c.print("The first real number entered was ");
	c.println(num1, 0, 3);
	c.print("The second real number entered was ");
	c.println(num2, 0, 3);
	c.print("The cost is $");
	c.println(123.7567, 0, 2);
	c.println("The firt real number entered was " + num1);
	c.println("The second real number entered was " + num2);
	c.print("The sum of the 2 numbers is ");
	c.println((num1+num2), 0, 1);
	c.print("The difference of the 2 numbers is ");
	c.println((num1-num2), 0, 1);
	c.print("The product of the 2 numbers is ");
	c.println((num1*num2), 0, 1);
    }
    
//*******************************Division*********************************

    public static void Division ()  
    {
	c.println("INTEGER DIVISION");
	c.println();
	int num1, num2;
	c.println("Type in one number and <Enter>: ");
	num1 = c.readInt();
	c.println("Type in another number and <Enter>: ");
	num2 = c.readInt();
	c.println();
	c.println("The answer to " + num1 + " divided by " + num2 + " is " + (num1/num2));
    }

//*******************************Remainder*********************************

    public static void Remainder ()  
    {
	c.println("FINDING THE REMAINDER");
	c.println();
	double num1, num2;
	c.println("Type in one real number and <Enter>: ");
	num1 = c.readDouble();
	c.println("Type in another real number and <Enter>: ");
	num2 = c.readDouble();
	c.println();
	c.println("The remainder when " + num1 + " is divided by " + num2 + " is " + (num1%num2));
    }

//*******************************Division 2*********************************

    public static void Division2 ()  
    {
	c.println("REAL NUMBER DIVISION");
	c.println();
	double num1, num2;
	c.println("Type in one real number and <Enter>: ");
	num1 = c.readInt();
	c.println("Type in another real number and <Enter>: ");
	num2 = c.readDouble();
	c.println();
	c.print("The answer to " + num1 + " divided by " + num2 + " is ");
	c.print((num1/num2), 10, 3);
    }
    
//*******************************Incrementing*********************************

    public static void Incrementing ()  
    {
	int num1 = 7;
	int num2 = 10;
	c.println("The first integer is " + num1);
	c.println("The second integer is " + num2);
	num1++;
	num2++;
	c.println("After incrementing:");
	c.println("The first integer is now " + num1);
	c.println("The second integer is now " + num2);
    }
  
//*******************************Excercise 5D - Three Words*********************************

    public static void ThreeWords ()  
    {
	String one, two, three;
	c.println("Type in a word and <Enter>");
	one = c.readString();
	c.println("Type in another word and <Enter>");
	two = c.readString();
	c.println("Type in another word and <Enter>");
	three = c.readString();
	c.println(one + " has " + one.length() + " characters.");
	c.println(two + " has " + two.length() + " characters.");
	c.println(three + " has " + three.length() + " characters.");
	c.println("The three words have " + (one.length() + two.length() + three.length()) + " characters.");
    }

//*******************************Excercise 5D - Numder of Digits*********************************

    public static void NumberOfDigits ()  
    {
	c.println("Type in an integer and <Enter>");
	String wholeNum = c.readString();
	c.println("The number " + wholeNum + " has " + wholeNum.length() + " digits in it.");
    }
    
//*******************************Marks*********************************

    public static void Marks ()  
    {
	c.println( "123456789012345678901234567890");
	c.println("Type in a student's name and <Enter>");
	String student1 = c.readString();
	c.println("What was " + student1 + "'s mark");
	int mark1 = c.readInt();
	c.println("\nType in another student's name and <Enter>");
	String student2 = c.readString();
	c.println("What was " + student2 + "'s mark");
	int mark2 = c.readInt();
	c.println("\nType in the final student's name and <Enter>");
	String student3 = c.readString();
	c.println("What was " + student3 + "'s mark");
	int mark3 = c.readInt();
	
	c.clear();
	c.println( "123456789012345678901234567890");
	c.print(student1);
	c.println(mark1, 25 - student1.length());
	c.print(student2);
	c.println(mark2, 25 - student2.length());
	c.print(student3);
	c.println(mark3, 25 - student3.length());
    }

//*******************************Shopping List*********************************

    public static void ShoppingList ()  
    {
	c.println("123456789012345678901234567890");
	c.println("    SHOPPING LIST\n");
	c.print("Box of disks");
	c.println(43.95, 25 - "Box of disks".length());
	c.print("Computer");
	c.println(4999.99, 25 - "Computer".length());
	c.print("Printer");
	c.println(899.50, 25 - "Printer".length());
	c.print("MS Works");
	c.println(450.00, 25 - "MS Works".length());
	c.println("                  ________");
	c.print("TOTAL");
	c.println((43.95+4999.99+899.50+450.00), 25 - "TOTAL".length());
    }

//*******************************Centre Display*********************************

    public static void CentreDisplay ()  
    {
	c.println("Type in a sentence and <Enter>");
	String sent = c.readLine();
	c.println("12345678901234567890123456789012345678901234567890123456789012345678901234567890");
	c.print(" ", 40-sent.length()/2);
	c.println(sent);
    }

//*******************************Flyer*********************************

    public static void Flyer ()  
    {
	String design = "/\\" ;
	for (int i=0; i < 22; i++)
	{
	    c.print(design);
	}
	c.print("\n ", 16);
	c.print("ETHNIK");
	c.print("\n ", 16);
	c.println("AFRIKA");
	c.print(" ", 8);
	c.println("Ethnic gear at low prices");
	for (int i=0; i < 22; i++)
	{
	    c.print(design);
	}
	c.print("\nWEDNESDAY", 34);
	c.println("Fleamarket");
	c.print("SATURDAY", 33);
	c.println("Bruma Lake");
	c.print("SUNDAY", 35);
	c.println("Stand 43");
	for (int i=0; i < 22; i++)
	{
	    c.print(design);
	}
    }

//*******************************Computer Menu*********************************

    public static void ComputerMenu ()  
    {
	int x = 200;
	c.print(" ", x-"MEGABYTE MENU".length()/2);
	c.println("MEGABYTE MENU");
	c.print(" ", x-"STARTERS".length()/2);
	c.println("STARTERS");
	c.print(" ", x-"Hot keys - hot Mexican chilli chips".length()/2);
	c.println("Hot keys - hot Mexican chilli chips");
	c.print(" ", x-"Data - be suprised and try this starter".length()/2);
	c.println("Data - be suprised and try this starter");
	c.print(" ", x-"MAIN COURSE".length()/2);
	c.println("MAIN COURSE");
	c.print(" ", x-"RAM - grilled to perfection in BBQ sauce".length()/2);
	c.println("RAM - grilled to perfection in BBQ sauce");
	c.print(" ", x-"DRINKS".length()/2);
	c.println("DRINKS");
	c.print(" ", x-"Tabs - Caffeine-free, sugar-free cola".length()/2);
	c.println("Tabs - Caffeine-free, sugar-free cola");
    }

//*******************************VarValues*********************************

    public static void VarValues ()  
    {
	// Declaring variables
	int num1;
	int num2;
	int num3;
	
	// Assigning values to variables
	num1 = 7;
	num2 = 15;
	
	// Getting a vlue into a variable from the keyboard
	c.print("Type in any integer and <Enter>: ");
	num3 = c.readInt();
	
	// Display output
	c.println();
	c.println("The first integer is " + num1);
	c.println("The second integer is " + num2);
	c.println("The third integer is " + num3);
	
	// Declaring and assigning in one statement
	int sum = num1 + num2 + num3;
	
	// More output
	c.println("The sum of the 3 integers is " + sum);
	
	int product = num1*num2*num3;
	c.println("The product of the 3 integers is " + product);
    }

//*******************************Exercise 5G - Eggs*********************************

    public static void Eggs ()  
    {
	int eggs;
	c.println("Type in the number of eggs in the box and <Enter>");
	eggs = c.readInt();
	c.println("There are " + eggs/12 + " full dozen eggs and " + eggs%12 + " eggs leftover");
    }
    
//*******************************Exercise 5G - Dat100*********************************

    public static void Date100 ()  
    {
	int year, first, last;
	c.println("Type in a year and <Enter>");
	year = c.readInt();
	first = (year / 100);
	last = year % (first*100);
	first++;
	c.println(year + " in 100 years will be " + first+last);
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
	    c.println ("1 - InputReals");
	    c.println ("2 - Division");
	    c.println ("3 - Remainder");
	    c.println ("4 - Division2");
	    c.println ("5 - Incrementing");
	    c.println ("6 - Exercise 5D - Three Words");
	    c.println ("7 - Exercise 5D - Number of Digits");
	    c.println ("8 - Marks");
	    c.println ("9 - Shopping List");
	    c.println ("10 - Centre Display");
	    c.println ("11 - Flyer");
	    c.println ("12 - Computer Menu");
	    c.println ("13 - VarValues");
	    c.println ("14 - Exercise 5G - Eggs");
	    c.println ("15 - Exercise 5G - Date100");


	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) InputReals();
	    else if (choice == 2) Division();
	    else if (choice == 3) Remainder();
	    else if (choice == 4) Division2();
	    else if (choice == 5) Incrementing();
	    else if (choice == 6) ThreeWords();
	    else if (choice == 7) NumberOfDigits();
	    else if (choice == 8) Marks();
	    else if (choice == 9) ShoppingList();
	    else if (choice == 10) CentreDisplay();
	    else if (choice == 11) Flyer();
	    else if (choice == 12) ComputerMenu();
	    else if (choice == 13) VarValues();
	    else if (choice == 14) Eggs();
	    else if (choice == 15) Date100();
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
