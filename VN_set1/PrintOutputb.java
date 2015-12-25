/* Nicholas Vadivelu
Mr. Brossard
ICS203
September 11th, 2014 */

//******************PrintOutputb******************

import java.awt.*;
import hsa.Console;

public class PrintOutputb
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.print("12345678901234567890 ");
	c.print("Hello. " + "How are you today?");
	c.println("XXXXXXXXXXXXXXX");
    } // main method
} // PrintOutput class

/* Programmer Joke #5

"Knock, knock."
"Who's there?"
very long pause….
"Java." 

Ba Dum Tss!

*/
