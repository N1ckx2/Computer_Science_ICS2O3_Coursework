/* Nicholas Vadivelu
ICS 203-02
October 17, 2014
Java Input Output Program */

import java.awt.*;
import hsa.Console;

public class VN_JavaInOut
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int num1, num2, summ, prod;
	c.print("Type in a number and <Enter>: ");
	num1 = c.readInt();
	c.print("Type in another number and <Enter>: ");
	num2 = c.readInt();
	
	summ = num1+num2;
	prod = num1*num2;
	
	c.println("The sum of " + num1 + " and " + num2 + " is " + summ);
	c.println("The product of " + num1 + " and " + num2 + " is " + prod);
	
	if (summ > prod) c.println("The sum is greater than the product");
	else if (summ < prod) c.println("The product is greater than the sum");
	else 
	{
	    c.println("The sum and product are equal");
	    c.println("What are the chances!");
	}
	c.println("\nPress enter to continue...");
	c.getChar();
    } // main method
} // JavaInOut class
