/* Nicholas Vadivelu
ICS 203-02
November 14, 2014
Array In Class */
import java.awt.*;
import hsa.Console;

public class VN_ArrayInClass
{
    static Console c;

    //******************************************************print Program**************************************
    // print will accept an array of integers and display them separated by commas and
    // spaces as shown in the sample run.  If the list is empty, a message should be
    // displayed.   [5 marks]
    // Here is the original list: 3, 23, 234, 173, 245, 34, 45
    public static void print (int array[])
    {
	if (array == null)
	{
	    c.println ("The array is empty");
	}
	else
	{
	    c.print ("{"); //prints the first bracket for the array
	    for (int i = 0 ; i < array.length ; i++)
	    {
		c.print (array [i]); // prints each number in the array
		if (i < array.length - 1)
		    c.print (", ");                          //prints the comma to seperate the numbers
	    }
	    c.println ("}"); //prints the last bracket for the array
	}
    }


    //******************************************************new order Program**************************************
    // neworder will accept an array of integers and return another array with the order changed
    // as follows: 0 1 2 3 4 5 6 7 8 will become 0 5 1 6 2 7 3 8 4  (odd number of values)
    // 0 1 2 3 4 5 6 7 will become 0 4 1 5 2 6 3 7  (even number of values)     [8 marks]
    // The re-ordered list: 3, 245, 23, 34, 234, 45, 173
    public static int[] neworder (int array[])
    {
	int i, y = 0;
	int[] array2 = new int [array.length];
	array2 [0] = array [0];
	if (array.length % 2 == 1)
	    y++;
	int[] first = new int [(array.length / 2) + y];
	int[] second = new int [array.length / 2]; //declares first and second half of array
	for (i = 1 ; i < first.length ; i++)
	    first [i - 1] = array [i];
	for (i = 1 ; i < second.length ; i++)
	    second [i - 1] = array [i + first.length - 1]; //splits up first and second half of array
	for (i = 2 ; i < array2.length ; i += 2)
	    array2 [i] = first [i / 2 - 1];
	for (i = 1 ; i < array2.length ; i += 2)
	    array2 [i] = second [i / 2]; //adds all the numbers into the final array in the right order
	array2 [array2.length - (1 + y)] = array [array.length - 1]; //makes sure  second last term is the last term in the original array
	
	return array2;
    }


    //******************************************************two digits Program**************************************
    // twodigits will accept an array of integers and return another array that contains
    // only the 2-digit numbers.    [8 marks]
    // The 2-digit numbers: 23, 34, 45
    public static int[] twodigits (int array[])
    {
	int[] two = new int [array.length]; //new array with the same length as original
	int num = 0; //place in the second array
	for (int i = 0 ; i < array.length ; i++) //goes through array
	{
	    if (array [i] >= 10 && array [i] < 100) //check if it is a 2 digit number
	    {
		two [num] = array [i]; // adds to the array
		num++;
	    }
	}
	num = 0; //now will serve as counter for array
	for (int i = 0 ; i < two.length ; i++) //goes through array
	{
	    if (two [i] > 0)
		num++;                 //counts the number of spots being used in array
	}
	int[] fin = new int [num];
	for (int i = 0 ; i < num ; i++) //goes through array
	{
	    fin [i] = two [i]; //assigns each spot to the appropriate number
	}
	return fin;
    }


    //******************************************************Main Menu**************************************

    public static void main (String[] args)
    {
	c = new Console ();

	int list[] = {3, 23, 234, 173, 245, 34, 45};  // change this list for testing purposes
	//int list[] = {0, 1, 2, 3, 4, 5, 6, 7}; // test list
	//int list[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};

	c.println ("\t\t\t\t   Array In Class \n\t\t\t\tBy Nicholas Vadivelu");
	for (int y = 0 ; y < 80 ; y++)
	{
	    c.print ('-');
	}
	c.print ("Here is the original list: ");
	print (list);

	c.print ("\nThe re-ordered list: ");
	int changed[] = neworder (list);
	print (changed);

	c.print ("\nThe 2-digit numbers: ");
	int some[] = twodigits (changed);
	print (some);
    } // main method
} // ArrayInClass class
