/*Nicholas Vadivelu
ICS 203-02
December 3, 2014
Return Values 2*/

import java.awt.*;
import hsa.Console;

public class VN_ReturnValues
{
    static Console c;

    // percent converts a fractional value to a percentage
    //Method here. 
    public static double percentage (double x, double y)
    {
	return ((double) (x/y*100)); //calculates and returns
    }
    // max accepts two integer values and returns the larger value
    //Method here. 
    public static int max(int x, int y)
    {
	int ret = 0;
	if (x >= y) ret = x;
	if (y >= x) ret = y; //finds larger int
	return ret;
    }

    public static void main (String [] args)
    {
	c = new Console ();
	c.println(percentage(16, 20), 5, 1);//code here // Displays  80.0 Use formatting to align it properly. Send numbers 16 and 20
	c.println(max(5, 7));//code here // displays largest of 5 and 7, which is 7
	c.println(max(5, max(7, 9)));//code here // displays largest of 5 and max(7,9) = 9       
    }
} 
