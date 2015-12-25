/*Lesson 4
Nicholas Vadivelu
ICS203
November 4, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_Lesson4
{
    static Console c;

//*******************************sumOdd*********************************

    public static int sumOdd (int s)  
    {
	int sum = 0; //declares the sum
	for (int i = 1; i <= s; i+=2) // loops through all the odd numbers up to s
	    sum += i; //add the odd number to the sum.

	return sum; // returns the number
    }
    
//*******************************factorial*********************************

    public static long factorial (int s)  
    {
	long num = 0; //declares the value
	if (s<=1) num = 1; //if the number is 1 or less the value is 1
	else num = s* factorial(s-1); //this makes the method call upon itself many times until the value of num is 1
	return num;
    }
   
//*******************************prime*********************************

    public static boolean prime (int s)  
    {
	for (int i = 2; i <= s/2+1; i++) //runs the loop as long as i is less than half of the number
	{
	    if (s==1) return true; // if the number is one it returns true
	    else if (s % i == 0) return false; // if the number is divisable by i, it will return false since a prime can only be divided by 1 and itself
	}
	return true; // if the loop runs and nothing divides into the number, then it is prime
    }
    
//*******************************gcf*********************************

    public static int gcf (int s, int t)  
    {
	int hi, lo; 
	hi = 0;
	lo = 0;
	//makes two variables to store the higher and lower number
	if (s > t)
	{
	    hi = s;
	    lo = t;
	}
	else if (t > s)
	{
	    hi = t;
	    lo = s;
	}
	// checks to see whether s or t is higher to assign hi and lo to the appropriate numbers
	else if (s == t) return s;  // if the two number are equal then the GCF is the number

	for (int i = lo; i >= 1; i--) // checks numbers from the lower number down to see if they divide into both
	{
	    if (hi%i == 0 && lo % i == 0) return i;
	}
	return 1; //if nothing works, return 1
    }
    
//*******************************getInt*********************************

    public static int getInt (int lo, int hi)  
    {
	long i;
	do
	{
	    c.println("Enter an integer between " + lo + " and " + hi + ":"); //prompts user for number between min and max
	    i = c.readLong(); //receives input
	} while (i > hi || i < lo); //runs this loops as long as the number is not between the min and the max
	c.println();
	int x = (int) i; //turns i into an int
	return x;
    }

//***********************************Menu Program Here*************************
    public static void main (String[] args)
    {

	c = new Console ();

	int choice, x, y, inMax;
	inMax = 2147483647;

	do
	{
	    //Promting for choice
	    c.println ("\t\t\t\t       Lesson 4 \n\t\t\t\t By Nicholas Vadivelu");
	    for (int t = 0 ; t < 80 ; t++)
	    {
		c.print ('-');
	    }
	    c.println ("Choose from the following menu:\n");
	    c.println ("Enter 1, 2, 3, or 4");
	    c.println ("1 - sumOdd");
	    c.println ("2 - factorial");
	    c.println ("3 - prime");
	    c.println ("4 - gcf");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) 
	    {
		x = getInt(0, 92680); //prompts and receives input
		c.println("The sum of all the odd digits from 1 to " + x + " is " + sumOdd(x)); //outputs result
	    }
	    else if (choice == 2)
	    {
		x = getInt(0, 25); //prompts and receives input
		c.println (x + "! = " + factorial(x)); //outputs result
	    }
	    else if (choice == 3) 
	    {
		x = getInt(1, inMax); //prompts and receives input
		if (prime(x)) c.println(x + " is a prime number!");
		else c.println("\n" + x + " is not a prime number!"); // tells user if the number is prime or not
	    }
	    else if (choice == 4)
	    {
		x = getInt(1, inMax); //prompts and receives input
		y = getInt(1, inMax); //prompts and receives input
		c.println("\nThe greatest common factor of " + x + " and " + y + " is " + gcf(x, y));
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
