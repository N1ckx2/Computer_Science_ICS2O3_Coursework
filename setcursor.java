/* The "SetCursor" class.
Investigating 
ICS2O
Mr. Brossard
Sep 26 14
placing characters on the screen*/
import java.awt.*;
import hsa.Console;

public class SetCursor
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.setCursor(10,40);
	c.print ("Here");
    } 
} 
