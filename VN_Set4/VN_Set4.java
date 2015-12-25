/* Set 4
ICS203-02
Nicholas Vadivelu
September 22, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_Set4
{
    static Console c;

//*******************************MakeLabels*********************************


    public static void MakeLabels ()  
    {
	//Nicholas Vadivelu, September 22, 2014
	String subject, name;
	
	c.println("Type in the person's name and <Enter>");
	name = c.readLine();
	c.println("Type in the subject and <Enter>");
	subject = c.readLine();
	
	c.println();
	c.println("****************");
	c.println("Name: " + name);
	c.println("Subject: " + subject);
	c.println("****************");
    }
    
//*******************************InOutWord*********************************


    public static void InOutWord ()  
    {
	//Nicholas Vadivelu, September 22, 2014
	String word;
	c.println("Type in any word, then <Enter> ");
	word = c.readString();
	
	c.println();
	c.println("The word that was input is " + word);
    }
    
//*******************************InputRect*********************************


    public static void InputRect ()  
    {
	int length, breadth;
	c.println("RECTANGLE PROGRAM");
	c.print("Type in the length of the rectangle and <Enter>: ");
	length = c.readInt();
	c.print("Type in the breadth of the rectangle and <Enter>: ");
	breadth = c.readInt();
	c.setColor(Color.green);
	c.fillRect(100, 100, length, breadth);
    }
    
//*******************************InputReals*********************************


    public static void InputReals ()  
    {
	//Nicholas Vadivelu, September 22, 2014
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
    }
    
//*******************************PersonalDetails*********************************


    public static void PersonalDetails ()  
    {
	String firstName, surname, telephone;
	int yearOfBirth;
	double height;
	
	c.println("Type in your first name and <Enter>");
	firstName = c.readString();
	c.println("Type in your surname and <Enter>");
	surname = c.readString();
	c.println("Type in your telephone number and <Enter>");
	telephone = c.readLine();
	c.println("Type in your year birth and <Enter>");
	yearOfBirth = c.readInt();
	c.println("Type in your height in metres and <Enter>");
	height = c.readDouble();
	c.clear();
	c.println("PERSONAL DETAILS");
	c.println();
	c.println("NAME: " + firstName + " " + surname);
	c.println("YEAR OF BIRTH: " + yearOfBirth);
	c.println("HEIGHT(m): " + height);
	c.println("TELEPHONE NUMBER: " + telephone);
	
    }
    
//*******************************ColoredCircles*********************************


    public static void ColoredCircles ()  
    {
	int redSize, blueSize, red, green, blue;
	c.println("This program will draw one red and one blue circle");
	c.println("Type in the size of the red circle (between 100 and 300) and <Enter>");
	redSize = c.readInt();
	c.println("Type in the size of the blue circle (between 50 and 150) and <Enter>");
	blueSize = c.readInt();
	c.setColor(Color.red);
	c.drawOval(100, 200, redSize, redSize);
	c.setColor(Color.blue);
	c.drawOval(300, 400, blueSize, blueSize);
	c.println("Type in the red value for the two circles (between 0 and 255) and <Enter>");
	red = c.readInt();
	c.println("Type in the green value for the two circles (between 0 and 255) and <Enter>");
	green = c.readInt();
	c.println("Type in the blue value for the two circles (between 0 and 255) and <Enter>");
	blue = c.readInt();
	Color col = new Color(red, green, blue);
	c.setColor(col);
	c.clear();
	c.drawOval(50, 150, redSize, redSize);
	c.drawOval(400, 150, blueSize, blueSize);
    }
    
//*******************************Prices*********************************


    public static void Prices ()  
    {
	String product1, product2, product3;
	double price1, price2, price3;
	
	c.println("Type in the first product and <Enter>");
	product1 = c.readLine();
	c.println("Type in the cost of " + product1 + " and <Enter>");
	price1 = c.readDouble();
	c.println("Type in the second product and <Enter>");
	product2 = c.readLine();
	c.println("Type in the cost of " + product2 + " and <Enter>");
	price2 = c.readDouble();
	c.println("Type in the third product and <Enter>");
	product3 = c.readLine();
	c.println("Type in the cost of " + product3 + " and <Enter>");
	price3 = c.readDouble();
	c.clear();
	c.println("SHOPPING LIST");
	c.print(product1, 15);
	c.println(price1, 8, 2);
	c.print(product2, 15);
	c.println(price2, 8, 2);
	c.print(product3, 15);
	c.println(price3, 8, 2); 
    }
    
//*******************************InputChars*********************************


    public static void InputChars ()  
    {
	char ch1, ch2, ch3;
	c.println("Type in any three characters on the keyboard");
	//c.println("Press <Enter> after each.");
	ch1 = c.getChar();
	ch2 = c.getChar();
	ch3 = c.getChar();
	c.println();
	c.println("Together these 3 letters spell: " + ch1 + ch2 + ch3);
	c.print("The ASCII number for the letter " + ch1 + " is: ");
	c.println(0+ch1);
	c.print("The ASCII number for the letter " + ch2 + " is: ");
	c.println(0+ch2);
	c.print("The ASCII number for the letter " + ch3 + " is: ");
	c.println(0+ch3);
	c.print("Together the letters " + ch1 + ", " + ch2 + " and " + ch3 + " add up to: ");
	c.println(ch1+ch2+ch3);
    }
    
//*******************************InputChars2*********************************


    public static void InputChars2 ()  
    {
	String ch1, ch2, ch3;
	c.println("Type in any three characters on the keyboard");
	c.println("Press <Enter> after each.");
	ch1 = c.readString();
	ch2 = c.readString();
	ch3 = c.readString();
	c.println();
	c.print("Together these 3 letters spell: " + ch1 + ch2 + ch3);
    }
    
//*******************************Overwrite*********************************


    public static void Overwrite ()  
    {
	//The "Overwrite" class
	String name;
	
	c.println("Type in a name and <Enter>");
	name = c.readString();
	c.println("Type in another anme and <Enter>");
	name = c.readString();
	c.println("The name is " + name);   
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
	    c.println ("Enter 1, 2, 3, 4, 5, 6 or 7.");
	    c.println ("1 - MakeLabel");
	    c.println ("2 - InOutWord");
	    c.println ("3 - InputRect");
	    c.println ("4 - InputReals");
	    c.println ("5 - PersonalDetails");
	    c.println ("6 - ColoredCircles");
	    c.println ("7 - Prices");
	    c.println ("8 - InputChars");
	    c.println ("9 - InputChars2");
	    c.println ("10 - Overwrite");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1)
	    {
		MakeLabels();
	    }
	    else if (choice == 2)
	    {
		InOutWord();
	    }
	    else if (choice == 3)
	    {
		InputRect();
	    }
	    else if (choice == 4)
	    {
		InputReals();
	    }
	    else if (choice == 5) 
	    {
		PersonalDetails();
	    }
	    else if (choice == 6) 
	    {
		ColoredCircles();
	    }
	    else if (choice == 7) 
	    {
		Prices();
	    }
	    else if (choice == 8)
	    {
		InputChars();
	    }
	    else if (choice == 9) 
	    {
		InputChars2();
	    }
	    else if (choice == 10)
	    {
		Overwrite();
	    }
	c.getChar ();
	
	c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
	// Place your program here.  'c' is the output console
    } // main method
} // Menu Demo class

