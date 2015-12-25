/* Set 3
ICS203-02
Nicholas Vadivelu
Sept. 12, 2014*/

import java.awt.*;
import hsa.Console;

public class VN_Set3
{
    static Console c;

//*******************************BlueRect*********************************


    public static void BlueRect ()  
    {
	c.setColor (Color.white);
	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.blue);
	c.fillRect (635, 0, 5, 5);
	c.setColor (Color.red);
	c.fillRect (0, 495, 5, 5);
	c.setColor (Color.green);
	c.fillRect (0, 0, 5, 5);
	c.setColor (Color.yellow);
	c.fillRect (635, 495, 5, 5);
	c.setColor (Color.pink);
	c.fillRect (640/2-2, 500/2-2, 5, 5);
    }
    
//*******************************Rectangles*********************************


    public static void Rectangles ()  
    {
	c.setColor (Color.white);
	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.blue);
	c.fillRect (635, 0, 5, 5);
	c.setColor (Color.red);
	c.fillRect (0, 495, 5, 5);
	c.setColor (Color.green);
	c.fillRect (0, 0, 5, 5);
	c.setColor (Color.yellow);
	c.fillRect (635, 495, 5, 5);
	c.setColor (Color.pink);
	c.fillRect (640/2-2, 500/2-2, 5, 5);
    }
    
//*******************************MyColors*********************************

    public static void MyColors()
    {
	Color col = new Color (255, 0, 255);
	c.setColor(col);
	c.fillRect (0, 0, 50, 50);
	
	Color col1 = new Color (0, 0, 0);
	c.setColor(col1);
	c.fillRect (0, 50, 50, 50);
	
	Color col2 = new Color(200, 200, 200);
	c.setColor(col2);
	c.fillRect (0, 100, 50, 50);
	
	Color col3 = new Color(25, 255, 255);
	c.setColor(col3);
	c.fillRect (0, 150, 50, 50);
	
	Color col4 = new Color(255, 0, 0);
	c.setColor(col4);
	c.fillRect (0, 200, 50, 50);
	
	Color col5 = new Color(0, 255, 0);
	c.setColor(col5);
	c.fillRect (0, 250, 50, 50);
	
	Color col6 = new Color(0, 0, 255);
	c.setColor(col6);
	c.fillRect (0, 300, 50, 50);
	
	Color col7 = new Color(160, 100, 0);
	c.setColor(col7);
	c.fillRect (0, 350, 50, 50);
	
	Color col8 = new Color(0, 200, 200);
	c.setColor(col8);
	c.fillRect (0, 400, 50, 50);
	
	Color col9 = new Color (200, 100, 50);
	c.setColor(col9);
	c.fillRect (0, 450, 50, 50);
	
	Color col10 = new Color (50, 100, 200);
	c.setColor(col9);
	c.fillRect (50, 0, 50, 50);
    }
//*******************************Circles*********************************

    public static void Circles()
    {
	Color col = new Color (255, 0, 255);
	c.setColor(col);
	c.drawOval (640/2-250/2, 500/2-250/2, 250, 250);
    }
//*******************************House*********************************

    public static void House()
    {
	int i = 0;
	int x = 195;
	int y = 0;
	while (i <= 50) 
	{
	    c.clear();
	    c.setColor(Color.blue);
	    c.fillRect(640/2-300/2, 640/2-300/2, 300, 300);
	    c.setColor(Color.yellow);
	    c.fillRect(640/2-300/2 + 200, 640/2-300/2+100, 50, 50);
	    c.fillRect(640/2-300/2 + 50, 640/2-300/2+100, 50, 50);
	    c.setColor(Color.green);
	    c.fillRect(640/2-50/2, 640/2-300/2+210, 50, 90);
	    c.setColor(Color.red);
	    c.fillRect(640/2-400/2, 150, 400, 75);
	    c.fillRect(640/2-250/2, 75, 75, 150);
	    c.setColor(Color.gray);
	    c.fillOval(x, y, 50, 50);
	    x = x - 1;
	    y = y - 1;
	    i++;
	    
	    try 
	    {
		Thread.sleep(100L);    // one second
	    }
		catch (Exception e) {}
	      
	    }
	c.fillOval(195, 0, 50, 50);
    }
//*******************************Moon*********************************

    public static void Moon()
    {
	int i = 0;
	int y = -350;
	while(i <= 500)
	{
	    c.clear();
	    c.setColor(Color.black);
	    c.fillRect(0, 0, 640, 500);
	    c.setColor(Color.yellow);
	    c.fillOval(640/2-300/2, 500/2-300/2, 300, 300);
	    c.setColor(Color.black);
	    c.fillOval(640/2-300/2+100, 500/2-300/2, 250, 250);
	    c.setColor(Color.yellow);
	    c.fillStar(100,100,25,25);
	    c.fillStar(200,200,25,25);
	    c.fillStar(50,450,25,25);
	    c.fillStar(450,50,25,25);
	    c.fillStar(100,50,25,25);
	    c.fillStar(50,222,25,25);
	    c.fillStar(550,65,25,25);
	    c.fillStar(500,550,25,25);
	    c.fillStar(450, 400, 25,25);
	    c.fillStar(100,y,25,25);
	    c.fillStar(200,y+50,25,25);
	    c.fillStar(50,y+100,25,25);
	    c.fillStar(450,y+150,25,25);
	    c.fillStar(100,y+200,25,25);
	    c.fillStar(50,y+250,25,25);
	    c.fillStar(550,y+300,25,25);
	    c.fillStar(500,y+350,25,25);
	    c.fillStar(450, 400, 25,25);
	    y = y+1;
	    i++;
	    try 
	    {
		Thread.sleep(10L);    // one second
	    }
		catch (Exception e) {} 
	}
    }
    
//*******************************ColSquares*********************************

    public static void ColSquares()
    {
	c.setColor(Color.blue);
	c.fillRect(640/2-200, 500/2-200, 400, 400);    
	c.setColor(Color.yellow);
	c.fillRect(640/2-150, 500/2-150, 300, 300);    
	c.setColor(Color.green);
	c.fillRect(640/2-100, 500/2-100, 200, 200);
	c.setColor(Color.red);
	c.fillRect(640/2-50, 500/2-50, 100, 100);
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
	    c.println ("Enter 1, 2, 3, 4, 5, 6 or 7.");
	    c.println ("1 - BlueRect");
	    c.println ("2 - Rectangles");
	    c.println ("3 - MyColors");
	    c.println ("4 - Circles");
	    c.println ("5 - House");
	    c.println ("6 - Moon");
	    c.println ("7 - ColSquares");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1)
	    {
		BlueRect();
	    }
	    else if (choice == 2)
	    {
		Rectangles();
	    }
	    else if (choice == 3)
	    {
		MyColors();
	    }
	    else if (choice == 4)
	    {
		Circles();
	    }
	    else if (choice == 5) 
	    {
		House();
	    }
	    else if (choice == 6) 
	    {
		Moon();
	    }
	    else if (choice == 7) 
	    {
		ColSquares();
	    }
	c.getChar ();
	
	c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
	// Place your program here.  'c' is the output console
    } // main method
} // Menu Demo class

