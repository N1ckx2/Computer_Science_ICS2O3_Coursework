/* Nicholas Vadivelu
ICS 203-02
December 2, 2014
Method Practice
*/
import java.awt.*;
import hsa.Console;

public class VN_MethodPractice
{
    static Console c;           // The output console
    public static int course, mark; //declares public ints
    public static double total;
    //**********************************border*****************************
    public static void border ()
    {
	for (int i = 0; i < 30; i++)
	{
	    c.print("="); //displays 30 lines
	} 
	c.println();
    }


    //**********************************introduction*****************************
    public static void introduction ()
    {
	c.println("Enter four marks for semester 1"); //prompts for the marks
    }


    //**********************************input mark*****************************
    public static void inputMark ()
    {
	c.print("#" + course + ":  ");
	mark = c.readInt();
    }


    //**********************************updateTotal*****************************
    public static void updateTotal ()
    {
	total += mark; //adds to total
    }


    //**********************************display results*****************************
    public static void displayResults ()
    {
	double average = total/(course-1); //calc average
	c.print("Average is "); //displays average
	c.print(average, 0, 2);
	c.println("%");
    }


    //**********************************Main Menu*****************************
    public static void main (String[] args)
    {
	c = new Console ();
	border ();
	introduction ();

	for (course = 1 ; course <= 4 ; course++)
	{
	    inputMark ();
	    updateTotal ();
	}
	border ();
	displayResults ();
	// Place your program here.  'c' is the output console
    } // main method
} // VN_MethodPractice class
