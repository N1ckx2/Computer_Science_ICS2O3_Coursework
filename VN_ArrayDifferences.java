/*Nicholas Vadivelu
ICS 203-02
December 3, 2014
Array Differences*/
import hsa.Console;
import java.lang.Math;

public class VN_ArrayDifferences
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int marks[] = new int [5]; // for list of 5 marks
	int diff[] = {0, 0, 0, 0, 0}; // create and set the differences
	int total = 0, average; // initialize accumulator

	// fill list with random marks from 1 to 100
	/*
	for (int i = 0 ; i < marks.length ; i++)
	{
	    c.print ("Input Mark #" + (i + 1) + ": ");
	    marks [i] = c.readInt ();
	    while (marks [i] > 100) //error check
	    {
		c.print ("Error, mark cannot be greater than 100.\nRe-input mark #" + (i+1) + ": ");
		marks [i] = c.readInt ();
		c.println();
	    }
	    total += marks [i]; //records all the values and accumulates total
	}
	*/
	for (int i = 0; i < marks.length; i++)
	{
	    marks[i] = (int) (Math.random()*101); //generates number for each marks
	    total += marks [i]; //records all the values and accumulates total
	}
	average = total / marks.length; //calculates average
	for (int i = 0 ; i < diff.length ; i++)
	    diff [i] = marks [i] - average; //calculates each difference
	c.clear ();
	c.print ("Marks", 11);
	for (int i = 0 ; i < marks.length ; i++)
	    c.print (marks [i], 5); //displays marks
	c.print ("", 6);
	c.print ("Average: " + average); //displays average
	c.print ("\nDifferernce", 11);
	for (int i = 0 ; i < diff.length ; i++)
	    c.print (diff [i], 5); //displays differences
	// calculate total and display list of marks


	// calculate and display average of marks

    }
}
