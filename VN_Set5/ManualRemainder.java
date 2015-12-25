// The "Asdf" class.
import java.awt.*;
import hsa.Console;

public class ManualRemainder
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
    c = new Console ();    
    while(true){
	
	c.println("new line\n");
	double x = c.readDouble();
	double y = c.readDouble();
	double ans = x/y;
	int ans2 = (int) ans;
	double remainder = x - ans2*y;
	c.println(remainder);
	c.getChar();
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Asdf class
