// The "RealNumberOutput" class.
import java.awt.*;
import hsa.Console;

public class RealNumberOutput
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.println(75.375, 4);
	c.println(75.375, 2);
	c.println(75.375, 10);
	c.println(75.375, 0, 4);
	c.println(75.375, 0, 2);
	c.println(75.375, 0, 1);
	c.println();
	c.println(63.97567, 10, 2);
	c.println(63.97567, 10, 3);
	c.println(63.97567, 10, 4);
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // RealNumberOutput class
