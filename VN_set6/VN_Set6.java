/*Set 6
Nicholas Vadivelu
ICS203
September 27th, 2014*/

import java.awt.*;
import hsa.Console;
import java.lang.Math;

public class VN_Set6
{
    static Console c;

//*******************************NameAge*********************************

    public static void NameAge ()  
    {
	c.println("Type in your name and <Enter>");
	String name = c.readLine();
	c.println("Type in your year of birth and <Enter>");
	int age = c.readInt();
	age = 2014-age;
	c.println();
	c.println(name + ", you will be " + age + " years old this year.");
    }

//*******************************Chocs*********************************

    public static void Chocs ()  
    {
	c.println("Type in the name of any chocolate bar and <Enter>");
	String chocs = c.readLine();
	c.println("Type in how many you want and <Enter>");
	int num = c.readInt();
	double cost = num*0.99;
	c.clear();
	c.print("CHOC BAR", 20);
	c.print("QUANTITY", 20);
	c.println("COST");
	c.print(chocs, 20);
	c.print(num);
	c.print(" ", 18);
	c.print("$");
	c.println(cost, 0, 2);
    }

//*******************************Supermarket*********************************

    public static void Supermarket ()  
    {
	c.println("Type in the name of any food and <Enter>");
	String food = c.readLine();
	c.println("Type in the price of " + food + " and <Enter>");
	double price = c.readDouble();
	c.println();
	c.println("Type in the name of another food and <Enter>");
	String food1 = c.readLine();
	c.println("Type in the price of " + food1 + " and <Enter>");
	double price1 = c.readDouble();
	c.clear();
	c.println("Sally's Supermarket\n");
	c.print(food, 15);
	c.println(price, 5, 2);
	c.print(food1, 15);
	c.println(price1, 5 ,2);
	c.print(" ", 15);
	c.println("------");
	c.print("TOTAL", 15);
	double total = price1+price;
	c.println(total, 5, 2);
    }

//*******************************Rounded Marks*********************************

    public static void RoundedMarks ()  
    {
	c.println("Type in the name of a pupil and <Enter>");
	String pupil = c.readLine();
	c.println("Type in the mark " + pupil + " got (out of 43) and <Enter>");
	int mark = c.readInt();
	int perc = (int) (Math.round((mark*100)/43));
	c.print("NAME", 15);
	c.print("MARK OUT OF 43", 20);
	c.println("ROUNDED %");
	c.print(pupil, 15);
	c.print(mark);
	c.print(" ", 18);
	c.println(perc);
    }

//*******************************PlayCosts*********************************

    public static void PlayCosts ()  
    {
	c.println("Type in the number of adults that came on the first night and <Enter>");
	int adults1 = c.readInt();
	c.println("Type in the number of pupils that came on the first night and <Enter>");
	int pupils1 = c.readInt();
	c.println();
	c.println("Type in the number of adults that came on the second night and <Enter>");
	int adults2 = c.readInt();
	c.println("Type in the number of pupils that came on the second night and <Enter>");
	int pupils2 = c.readInt();
	int proceeds = ((adults1+adults2)*15) + ((pupils1+pupils2)*10);
	c.clear();
	c.println("The total number of adults from both nights was: " + (adults1+adults2));
	c.println("The total cost for the adults from both nights was: $" + ((adults1+adults2)*15));
	c.println("The total number of pupils from both nights was: " + (pupils1+pupils2));
	c.println("The total cost for the pupils from both nights was: $" + ((pupils1+pupils2)*15));
	c.print("Total Proceeds: $", 15);
	c.println(proceeds);
	c.print("Profit Made:    $", 15);
	c.println((proceeds-9000));
	
    }
    
//*******************************Swimmers*********************************

    public static void Swimmers ()  
    {
	c.println("Type in the name of an Olympic woman swimmer and <Enter>");
	String swim1 = c.readLine();
	c.println("Type in " + swim1 + "'s 100m time(in seconds) and <Enter>");
	double time1 = c.readDouble();
	c.println("Type in the name of another Olympic woman swimmer and <Enter>");
	String swim2 = c.readLine();
	c.println("Type in " + swim2 + "'s 100m time(in seconds) and <Enter>");
	double time2 = c.readDouble();
	c.clear();
	c.println("100M BREASTROKE FINAL\n");
	c.print("NAME", 14+10);
	c.println("TIME");
	c.print(swim1, 10+10);
	c.println(time1, 9, 2);
	c.print(swim2, 10+10);
	c.println(time2, 9, 2);
    }
    
//*******************************Rings*********************************

    public static void Rings ()  
    {
	int x = 100;
	int y = 150;
	c.setColor(Color.blue);
	c.drawOval(x, y, 150, 150);
	c.setColor(Color.black);
	c.drawOval(x+175, y, 150, 150);
	c.setColor(Color.red);
	c.drawOval(x+175*2, y, 150, 150);
	c.setColor(Color.yellow);
	c.drawOval(x+85, y+100, 150, 150);
	c.setColor(Color.green);
	c.drawOval(x+75+185, y+100, 150, 150);
    }
    
//*******************************MarkAverage*********************************

    public static void MarkAverage ()  
    {
	c.println("Type in the name of a pupil and <Enter>");
	String pupil = c.readLine();
	c.println("Type in " + pupil + "'s first mark (out of 25) and <Enter>");
	int mark1 = c.readInt();
	c.println("Type in " + pupil + "'s first mark (out of 55) and <Enter>");
	int mark2 = c.readInt();
	int total = mark1 + mark2;
	int perc = (total*100)/(25+55);
	c.println(pupil + " got " + mark1 + " out of 25 and " + mark2 + " out of 55, so his/her final percentage is " + perc + "%.");
    }
    
//*******************************Foodstall*********************************

    public static void Foodstall ()  
    {
	c.println("Type in the number of cokes you want to buy and <Enter>");
	int cokes = c.readInt();
	c.println("Type in the number of packs of chips you want to buy and <Enter>");
	int chips = c.readInt();
	c.print("You have to pay $");
	double cost = ((cokes*3)+(chips*2.50));
	c.print(cost, 4, 2);
	c.println(" for " + cokes + " coke(s) and " + chips + " bag(s) of chip(s).");
	c.println();
	c.println("Type in the amount of money($) the customer gave you and <Enter>");
	double money = c.readDouble();
	double change = money-cost;
	c.print("You need to give the customer $");
	c.print(change, 6, 2);
	c.println(" in change.");
    }
    
//*******************************StarBox*********************************

    public static void StarBox ()  
    {
	c.setColor(Color.blue);
	c.fillStar(640/2-400/2, 480/2-400/2, 400, 400);
	c.setColor(Color.red);
	c.fillStar(640/2-350/2, 480/2-350/2, 350, 350);
    }
    
//*******************************p85 - UsingMathMethods*********************************

    public static void UsingMathMethods ()  
    {
	c.println("Type in any real number and <Enter>");
	double num = c.readDouble();
	c.println(Math.round(num));
	c.println(Math.sqrt(num));
	c.println(Math.abs(num));
	c.println(Math.pow(num, 2));
    }
    
//*******************************ColdDrinks*********************************

    public static void ColdDrinks ()  
    {
	c.println("Type in the number of cold drinks you want and <Enter>");
	int num = c.readInt();
	c.println("You want " + num + " cold drinks.");
	c.print("That will cost $", 20);
	c.print((num*1.89), 6, 2); 
	c.println(".");
	c.println("\nType in the amount of money given by the customer and <Enter>");
	int mon = c.readInt();
	c.print("Give the customer $", 20);
	c.print((mon-(num*1.89)), 6, 2);
	c.println(" in change.");
    }
    
//*******************************DiceThrow*********************************

    public static void DiceThrow ()  
    {
	c.println(((int)(Math.random()*6)+1));
    }
    
//*******************************RandomShapes*********************************

    public static void RandomShapes ()  
    {
	int x, y;
	x = (int)(Math.random() * (640-250)+50);
	y = (int)((Math.random() * (480-250)));
	Color col1 = new Color(((int)(Math.random() * 256)), ((int)(Math.random() * 256)), ((int)(Math.random() * 256)));
	c.setColor(col1);
	c.fillOval(x, y, 150, 150);
	int[] two = {(int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)};
	Color col2 = new Color(((int)(Math.random() * 256)), ((int)(Math.random() * 256)), ((int)(Math.random() * 256)));
	c.setColor(col2);
	c.fillRect(-50+x, y+150, 250, 150);
	
    }
//***********************************Menu Program Here*************************
    public static void main (String[] args)
    {

	c = new Console ();

	int choice;

	do
	{
	    //Promting for choice
	    c.println ("Choose from the following menu\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, or 14");
	    c.println ("1 - NameAge");
	    c.println ("2 - Chocs");
	    c.println ("3 - Supermarket");
	    c.println ("4 - Rounded Marks");
	    c.println ("5 - PlayCosts");
	    c.println ("6 - Swimmers");
	    c.println ("7 - Rings");
	    c.println ("8 - MarkAverage");
	    c.println ("9 - Foodstall");
	    c.println ("10 - StarBox");
	    c.println ("11 - P85 - UsingMathMethods");
	    c.println ("12 - ColdDrinks");
	    c.println ("13 - DiceThrow");
	    c.println ("14 - RandomShapes");


	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) NameAge();
	    else if (choice == 2) Chocs();
	    else if (choice == 3) Supermarket();
	    else if (choice == 4) RoundedMarks();
	    else if (choice == 5) PlayCosts();
	    else if (choice == 6) Swimmers();
	    else if (choice == 7) Rings();
	    else if (choice == 8) MarkAverage();
	    else if (choice == 9) Foodstall();
	    else if (choice == 10) StarBox();
	    else if (choice == 11) UsingMathMethods();
	    else if (choice == 12) ColdDrinks();
	    else if (choice == 13) DiceThrow();
	    else if (choice == 14) RandomShapes();
	//c.print ("\n\nPress enter to continue");
	c.getChar ();
	
	c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
	// Place your program here.  'c' is the output console
    } // main method
} // Menu class
