/*Nicholas Vadivelu
ICS 203-02
December 2, 2014
Methods Parameter Passing */
import java.awt.*;
import hsa.Console;

public class VN_MethodsParameterPassing
{
    static Console c;           // The output console
    //********************************Border 1**************************
    public static void border (int x)
    {
	for (int i = 0; i < x; i++) //runs the loop x times
	{
	    c.print("=");
	}
	c.println();
    }


    //********************************Main Menu**************************
    public static void border (int x, char y)
    {
	for (int i = 0; i < x; i++) //runs loop x times
	{
	    c.print(y); //prints char
	}
	c.println();
    }


    //********************************Main Menu**************************
    public static void main (String[] args)
    {
	c = new Console ();
	char printed = '?';

	//appropriate version of border method called based on value(s) send
	border (5); //Displays =====
	border (5 * 2); // Accepts any integer expression and displays ==========
	border (10, printed); // Accepts variable and displays ??????
	// Place your program here.  'c' is the output console
    } // main method
} // VN_MethodsParameterPassing class
