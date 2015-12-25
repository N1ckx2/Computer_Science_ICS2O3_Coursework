/* Improved House and Moon
Nicholas Vadivelu
ICS203-02
September 16th, 2014*/

import java.awt.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;
import java.lang.Object;

public class VN_Improved_House_and_Moon
{
    static Console c;

//*******************************Improved House*********************************


    public static void House ()  
    {
	c.println("Improved House: This is a 2D version of the Mickey Mouse Clubhouse");
	try 
	    {
		Thread.sleep(3000L);    // one second
	    }
		catch (Exception e) {}
	 int var = 175;
	int m = 50;
	while (var >= 0)
	{
	    c.clear();
	    //Sky
	    for(int i=0; i<=100; i++) 
	    {
		int r,g,b;
		r = 0;
		g = (int)(81+1*i);
		b = (int)(130+1.2*i);
		Color sky = new Color(r,g,b);
		c.setColor(sky);
		c.fillRect(0,500-i*5,640,5);
	    }
	    // Main Body
	    Color body = new Color (250, 18, 0);
	    c.setColor(body);
	    c.fillOval(640/2-250/2+m, 275+var, 250, 250);
	    
		    // Start of the grass
	    Color grass = new Color (10, 200, 0);
	    for(int e=0; e<=100; e++) 
	    {
		int r,g,b;
		r = (int)(5+0.1*e);
		g = (int)(100+1.1*e);
		Color grass1 = new Color(r,g,0);
		c.setColor(grass1);
		c.fillRect(0,e+400,640,1);
	    }
	    // End of the Grass
	    
	    var--;
	    
	    try 
	    {
		Thread.sleep(40L);    // one second
	    }
		catch (Exception e) {}
	}
	
	
	try 
	{
	    Thread.sleep(500L);    // one second
	}
	    catch (Exception e) {}
	
	c.setColor(Color.black);
	c.fillOval (640/2-25, 310, 45, 70);
	c.fillOval (640/2+75, 310, 45, 70);
	
	Color window = new Color (0, 70, 190);
	c.setColor(window);
	c.fillOval (640/2-25+2, 310+2, 41, 66);
	c.fillOval (640/2+75+2, 310+2, 41, 66); // glass
	
	c.setColor(Color.black);
	c.fillRect (317, 312, 2, 66);
	c.fillRect (417, 312, 2, 66); // vertical bars
	c.fillRect (298, 332, 40, 2);
	c.fillRect (398, 332, 40, 2); // top horizontal bars
	c.fillRect (298, 354, 40, 2);
	c.fillRect (398, 354, 40, 2); // bottom horizontal bars
	
	try 
	{
	    Thread.sleep(500L);    // one second
	}
	    catch (Exception e) {}
	    
	int var2 = -90;
	while (var2 < 0)
	{
	    c.clear();
	    
	    for(int i=0; i<=100; i++) 
	    {
		int r,g,b;
		r = 0;
		g = (int)(81+1*i);
		b = (int)(130+1.2*i);
		Color sky = new Color(r,g,b);
		c.setColor(sky);
		c.fillRect(0,500-i*5,640,5);
	    }
	    
	    //Start of Shoe
	    c.setColor(Color.black);
	    c.fillRect(300+m+var2, 350, 200, 50);
	
	    c.setColor(Color.yellow);
	    c.fillRoundRect(515+m+var2, 230, 55, 305, 40, 40);
	    c.fillOval(480+m+var2, 230, 90, 105);
	    c.fillOval(485+m+var2, 325, 80, 90);
	    //End of SHoe
	    
	    // Main Body
	    Color body = new Color (250, 18, 0);
	    c.setColor(body);
	    c.fillOval(640/2-250/2+m, 275, 250, 250);
	
	    c.setColor(Color.black);
	    c.fillOval (640/2-25, 310, 45, 70);
	    c.fillOval (640/2+75, 310, 45, 70);
	
	    Color window2 = new Color (0, 70, 190);
	    c.setColor(window);
	    c.fillOval (640/2-25+2, 310+2, 41, 66);
	    c.fillOval (640/2+75+2, 310+2, 41, 66); // glass
	
	    c.setColor(Color.black);
	    c.fillRect (317, 312, 2, 66);
	    c.fillRect (417, 312, 2, 66); // vertical bars
	    c.fillRect (298, 332, 40, 2);
	    c.fillRect (398, 332, 40, 2); // top horizontal bars
	    c.fillRect (298, 354, 40, 2);
	    c.fillRect (398, 354, 40, 2); // bottom horizontal bars
	    //End of Main Body
	    
	    Color grass = new Color (10, 200, 0);
	    for(int e=0; e<=100; e++) 
	    {
		int r,g,b;
		r = (int)(5+0.1*e);
		g = (int)(100+1.1*e);
		Color grass1 = new Color(r,g,0);
		c.setColor(grass1);
		c.fillRect(0,e+400,640,1);
	    }
	    try 
	    {
		Thread.sleep(40L);    // one second
	    }
		catch (Exception e) {}
	   var2++;
	}
	
	try 
	{
	    Thread.sleep(500L);    // one second
	}
	    catch (Exception e) {}
	    
	int var3 = 250;
	while (var3 >= 0) 
	{
	    c.clear();
	    
	    for(int i=0; i<=100; i++) 
	    {
		int r,g,b;
		r = 0;
		g = (int)(81+1*i);
		b = (int)(130+1.2*i);
		Color sky = new Color(r,g,b);
		c.setColor(sky);
		c.fillRect(0,500-i*5,640,5);
	    }
	    
	    //Start of Shoe
	    c.setColor(Color.black);
	    c.fillRect(300+m, 350, 200, 50);
	
	    c.setColor(Color.yellow);
	    c.fillRoundRect(515+m, 230, 55, 305, 40, 40);
	    c.fillOval(480+m, 230, 90, 105);
	    c.fillOval(485+m, 325, 80, 90);
	    //End of SHoe
	    
	    // Main Body
	    Color body = new Color (250, 18, 0);
	    c.setColor(body);
	    c.fillOval(640/2-250/2+m, 275, 250, 250);
	
	    c.setColor(Color.black);
	    c.fillOval (640/2-25, 310, 45, 70);
	    c.fillOval (640/2+75, 310, 45, 70);
	
	    Color window2 = new Color (0, 70, 190);
	    c.setColor(window);
	    c.fillOval (640/2-25+2, 310+2, 41, 66);
	    c.fillOval (640/2+75+2, 310+2, 41, 66); // glass
	
	    c.setColor(Color.black);
	    c.fillRect (317, 312, 2, 66);
	    c.fillRect (417, 312, 2, 66); // vertical bars
	    c.fillRect (298, 332, 40, 2);
	    c.fillRect (398, 332, 40, 2); // top horizontal bars
	    c.fillRect (298, 354, 40, 2);
	    c.fillRect (398, 354, 40, 2); // bottom horizontal bars
	    //End of Main Body
 
	    //Start of Hand
	    c.fillRect(50, 300+var3, 60, 250);
	    c.setColor(Color.white);
	    c.fillOval(20, 225+var3, 125, 125);
	    c.fillRoundRect(36, 330+var3, 95, 25, 20, 20);
	    c.fillRoundRect(120, 265+var3, 80, 30, 20, 20); // thumb
	    c.fillOval(165, 260+var3, 40, 40);
	    c.fillRoundRect(67, 175+var3, 30, 80, 20, 20); // vertical finger
	    c.fillOval(80-20+2, 160+var3, 40, 40);
	    int[] x1 = {30+60, 50+60, 100+60, 80+60};
	    int[] y1 = {180+100+var3, 200+100+var3, 100+100+var3, 80+100+var3};
	    c.fillPolygon(x1, y1, 4); // diagonal finger pointing right
	    c.fillOval(128, 175+var3, 40, 40);
	    int[] x2 = {60, 80, 30, 10};
	    int[] y2 = {300+10+var3, 280+10+var3, 180+10+var3, 200+10+var3};
	    c.fillPolygon(x2, y2, 4); // diagonal finger pointing left
	    c.fillOval(-1, 175+var3, 40, 40);
	
	
	    c.setColor(Color.black); // lines inside the hand
	    c.fillRect(80, 250+var3, 3, 60);
	    int[] x3 = {50, 52, 70, 68};
	    int[] y3 = {262+var3, 260+var3, 312+var3, 314+var3};
	    c.fillPolygon(x3, y3, 4);
	    int[] x4 = {118-7, 120-7, 102-7, 100-7};
	    int[] y4 = {260+var3, 262+var3, 314+var3, 312+var3};
	    c.fillPolygon(x4, y4, 4);
	    //End of Hand
	    
	    Color grass = new Color (10, 200, 0);
	    for(int e=0; e<=100; e++) 
	    {
		int r,g,b;
		r = (int)(5+0.1*e);
		g = (int)(100+1.1*e);
		Color grass1 = new Color(r,g,0);
		c.setColor(grass1);
		c.fillRect(0,e+400,640,1);
	    }
	    try 
	    {
		Thread.sleep(40L);    // one second
	    }
		catch (Exception e) {}
	   var3--;
	}
	
	int var4 = 225;
	
	while (var4 >= 0)
	{
	    c.clear();
	    
	    for(int i=0; i<=100; i++) 
	    {
		int r,g,b;
		r = 0;
		g = (int)(81+1*i);
		b = (int)(130+1.2*i);
		Color sky = new Color(r,g,b);
		c.setColor(sky);
		c.fillRect(0,500-i*5,640,5);
	    }
	    
	    //Start of Head
	    c.setColor(Color.black);
	    c.fillRect(640/2-50/2+m, 230+var4, 50, 100);
	    c.fillOval(640/2-200/2+m, 65+var4, 200, 200);
	    c.fillOval(165+m, 25, 100-var4, 100-var4);
	    c.fillOval(375+m, 25, 100-var4, 100-var4);
	    //End of Head
	    
	    //Start of Shoe
	    c.setColor(Color.black);
	    c.fillRect(300+m, 350, 200, 50);
	
	    c.setColor(Color.yellow);
	    c.fillRoundRect(515+m, 230, 55, 305, 40, 40);
	    c.fillOval(480+m, 230, 90, 105);
	    c.fillOval(485+m, 325, 80, 90);
	    //End of SHoe
	    
	    
	    // Main Body
	    Color body = new Color (250, 18, 0);
	    c.setColor(body);
	    c.fillOval(640/2-250/2+m, 275, 250, 250);
	
	    c.setColor(Color.black);
	    c.fillOval (640/2-25, 310, 45, 70);
	    c.fillOval (640/2+75, 310, 45, 70);
	
	    Color window2 = new Color (0, 70, 190);
	    c.setColor(window);
	    c.fillOval (640/2-25+2, 310+2, 41, 66);
	    c.fillOval (640/2+75+2, 310+2, 41, 66); // glass
	
	    c.setColor(Color.black);
	    c.fillRect (317, 312, 2, 66);
	    c.fillRect (417, 312, 2, 66); // vertical bars
	    c.fillRect (298, 332, 40, 2);
	    c.fillRect (398, 332, 40, 2); // top horizontal bars
	    c.fillRect (298, 354, 40, 2);
	    c.fillRect (398, 354, 40, 2); // bottom horizontal bars
	    //End of Main Body
 
	    //Start of Hand
		c.fillRect(50, 300, 60, 250);
		c.setColor(Color.white);
		c.fillOval(20, 225, 125, 125);
		c.fillRoundRect(36, 330, 95, 25, 20, 20);
		c.fillRoundRect(120, 265, 80, 30, 20, 20); // thumb
		c.fillOval(165, 260, 40, 40);
		c.fillRoundRect(67, 175, 30, 80, 20, 20); // vertical finger
		c.fillOval(80-20+2, 160, 40, 40);
		int[] x1 = {30+60, 50+60, 100+60, 80+60};
		int[] y1 = {180+100, 200+100, 100+100, 80+100};
		c.fillPolygon(x1, y1, 4); // diagonal finger pointing right
		c.fillOval(128, 175, 40, 40);
		int[] x2 = {60, 80, 30, 10};
		int[] y2 = {300+10, 280+10, 180+10, 200+10};
		c.fillPolygon(x2, y2, 4); // diagonal finger pointing left
		c.fillOval(-1, 175, 40, 40);
	
	
		c.setColor(Color.black); // lines inside the hand
		c.fillRect(80, 250, 3, 60);
		int[] x3 = {50, 52, 70, 68};
		int[] y3 = {262, 260, 312, 314};
		c.fillPolygon(x3, y3, 4);
		int[] x4 = {118-7, 120-7, 102-7, 100-7};
		int[] y4 = {260, 262, 314, 312};
		c.fillPolygon(x4, y4, 4);
		//End of Hand
	    
	    Color grass = new Color (10, 200, 0);
	    for(int e=0; e<=100; e++) 
	    {
		int r,g,b;
		r = (int)(5+0.1*e);
		g = (int)(100+1.1*e);
		Color grass1 = new Color(r,g,0);
		c.setColor(grass1);
		c.fillRect(0,e+400,640,1);
	    }
	    try 
	    {
		Thread.sleep(40L);    // one second
	    }
		catch (Exception e) {}
	   var4--;
	}
    }
    
//*******************************Improved Moon*********************************

    public static void Moon()
    {
	int n = -310;
	c.println("Improved Moon: This program shows you the lunar cycle from \nSeptember 22, 2014 to September 27, 2014");
	try 
	{
	    Thread.sleep(4000L);    // one second
	}
	    catch (Exception e) {}
	
	while (n < 555) 
	{
	
	
	//Start of Sky
	c.setColor(Color.black);
	c.fillRect(0, 0, 640, 500);
	//End of Sky
	
	//Start of Stars
	c.setColor (Color.yellow);
	c.fillStar (-100, 50, 20, 20);
	c.fillStar (640, 200, 20, 20);
	c.fillStar (-150+0, 10, 20, 20);
	c.fillStar (-210+0, 160, 20, 20);
	c.fillStar (-240+0,220, 20, 20);
	c.fillStar (380+0, 40, 20, 20);
	c.fillStar (400+0, 300, 20, 20);
	c.fillStar (420+0, 50, 20, 20);
	c.fillStar (600+0, 370, 20, 20);
	c.fillStar (500+0, 390, 20, 20);
	c.fillStar (0+0, 400, 20, 20);
	c.fillStar (60+0, 90, 20, 20);
	c.fillStar (80+0, 450, 20, 20);
	c.fillStar (-200+0, 50, 20, 20);
	c.fillStar ( 120+0, 250, 20, 20);
	c.fillStar ( 250+0, 140, 20, 20);
	c.fillStar ( 30+0, 80, 20, 20);
	c.fillStar (30+0, 405, 20, 20);
	c.fillStar (40+0, 30, 20, 20);
	c.fillStar ( 300+0, 420, 20, 20);
	c.fillStar ( 380+0, 40, 20, 20);
	c.fillStar ( 400+0, 300, 20, 20);
	c.fillStar ( 420+0, 50, 20, 20);
	c.fillStar ( 600+0, 370, 20, 20);
	c.fillStar ( 500+0, 20, 20, 20);
	c.fillStar ( 0+0, 400, 20, 20);
	c.fillStar ( 60+0, 90, 20, 20);
	
	c.println ("Moon on September 22, 2014: Waning Crescent");
	// Start of Moon
	Color moon = new Color (230, 230, 230);
	c.setColor(moon);
	c.fillOval (90+n, 100, 200, 200);
	Color moon2 = new Color(200, 200, 200);
	c.setColor(moon2);
	c.fillOval (120+n, 120, 50+15, 50+15);
	c.fillOval (130+n, 140, 40+10, 60+20);
	c.fillOval (150+n, 115, 50+15, 30+10);
	c.fillOval (180+n, 160, 30+10, 30+10);
	c.fillOval (100+n, 150, 30+10, 30+10);
	c.fillOval (205+n, 140, 20+9, 30+10);
	c.fillOval (100+125/2+n, 100+125/2+32, 25, 30);
	c.fillOval (230+n, 180, 55, 70);
	c.fillOval (200+n, 200, 80, 40);
	c.fillOval (180+n, 230, 60, 50);
	c.fillOval (120+n, 225, 50, 60);
	Color moon3 = new Color(180, 180, 180);
	c.setColor(moon3);
	c.fillOval (130+n, 130, 20+8, 20+10);
	c.fillOval (135+n, 145, 20+8, 30+10);
	c.fillOval (170+n, 125, 20+8, 10+5);
	c.fillOval (194+n, 172, 10+5, 10+5);
	c.fillOval (250+n, 200, 20, 20);
	c.fillOval (200+n, 250, 15, 10);
	c.fillOval (140+n, 23540, 15, 20);
	c.setColor(Color.black);
	c.fillOval(110+n, 100, 190, 190);
	
	
	
	n+=3;
	try 
	{
	    Thread.sleep(40L);    // one second
	}
	    catch (Exception e) {}
	
    }// end of loop1
    
    int v = -310;
    while ( v < 555) 
	{
	
	
	//Start of Sky
	c.setColor(Color.black);
	c.fillRect(0, 0, 640, 500);
	//End of Sky
	
	//Start of Stars
	c.setColor (Color.yellow);
	c.fillStar (-100, 50, 20, 20);
	c.fillStar (640, 200, 20, 20);
	c.fillStar (-150+0, 10, 20, 20);
	c.fillStar (-210+0, 160, 20, 20);
	c.fillStar (-240+0,220, 20, 20);
	c.fillStar (380+0, 40, 20, 20);
	c.fillStar (400+0, 300, 20, 20);
	c.fillStar (420+0, 50, 20, 20);
	c.fillStar (600+0, 370, 20, 20);
	c.fillStar (500+0, 390, 20, 20);
	c.fillStar (0+0, 400, 20, 20);
	c.fillStar (60+0, 90, 20, 20);
	c.fillStar (80+0, 450, 20, 20);
	c.fillStar (-200+0, 50, 20, 20);
	c.fillStar ( 120+0, 250, 20, 20);
	c.fillStar ( 250+0, 140, 20, 20);
	c.fillStar ( 30+0, 80, 20, 20);
	c.fillStar (30+0, 405, 20, 20);
	c.fillStar (40+0, 30, 20, 20);
	c.fillStar ( 300+0, 420, 20, 20);
	c.fillStar ( 380+0, 40, 20, 20);
	c.fillStar ( 400+0, 300, 20, 20);
	c.fillStar ( 420+0, 50, 20, 20);
	c.fillStar ( 600+0, 370, 20, 20);
	c.fillStar ( 500+0, 20, 20, 20);
	c.fillStar ( 0+0, 400, 20, 20);
	c.fillStar ( 60+0, 90, 20, 20);
	
	c.println ("Moon on September 23, 2014: Waning Crescent");
	// Start of Moon
	Color moon = new Color (230, 230, 230);
	c.setColor(moon);
	c.fillOval (90+v, 100, 200, 200);
	Color moon2 = new Color(200, 200, 200);
	c.setColor(moon2);
	c.fillOval (120+v, 120, 50+15, 50+15);
	c.fillOval (130+v, 140, 40+10, 60+20);
	c.fillOval (150+v, 115, 50+15, 30+10);
	c.fillOval (180+v, 160, 30+10, 30+10);
	c.fillOval (100+v, 150, 30+10, 30+10);
	c.fillOval (205+v, 140, 20+9, 30+10);
	c.fillOval (100+125/2+v, 100+125/2+32, 25, 30);
	c.fillOval (230+v, 180, 55, 70);
	c.fillOval (200+v, 200, 80, 40);
	c.fillOval (180+v, 230, 60, 50);
	c.fillOval (120+v, 225, 50, 60);
	Color moon3 = new Color(180, 180, 180);
	c.setColor(moon3);
	c.fillOval (130+v, 130, 20+8, 20+10);
	c.fillOval (135+v, 145, 20+8, 30+10);
	c.fillOval (170+v, 125, 20+8, 10+5);
	c.fillOval (194+v, 172, 10+5, 10+5);
	c.fillOval (250+v, 200, 20, 20);
	c.fillOval (200+v, 250, 15, 10);
	c.fillOval (140+v, 23540, 15, 20);
	c.setColor(Color.black);
	c.fillOval(100+v, 100, 200, 200);
	
	
	
	v+=3;
	try 
	{
	    Thread.sleep(40L);    // one second
	}
	    catch (Exception e) {}
	
    }// end of loop2
    
	int z = -310;
    while ( z < 555) 
	{
	
	
	//Start of Sky
	c.setColor(Color.black);
	c.fillRect(0, 0, 640, 500);
	//End of Sky
	
	//Start of Stars
	c.setColor (Color.yellow);
	c.fillStar (-100, 50, 20, 20);
	c.fillStar (640, 200, 20, 20);
	c.fillStar (-150+0, 10, 20, 20);
	c.fillStar (-210+0, 160, 20, 20);
	c.fillStar (-240+0,220, 20, 20);
	c.fillStar (380+0, 40, 20, 20);
	c.fillStar (400+0, 300, 20, 20);
	c.fillStar (420+0, 50, 20, 20);
	c.fillStar (600+0, 370, 20, 20);
	c.fillStar (500+0, 390, 20, 20);
	c.fillStar (0+0, 400, 20, 20);
	c.fillStar (60+0, 90, 20, 20);
	c.fillStar (80+0, 450, 20, 20);
	c.fillStar (-200+0, 50, 20, 20);
	c.fillStar ( 120+0, 250, 20, 20);
	c.fillStar ( 250+0, 140, 20, 20);
	c.fillStar ( 30+0, 80, 20, 20);
	c.fillStar (30+0, 405, 20, 20);
	c.fillStar (40+0, 30, 20, 20);
	c.fillStar ( 300+0, 420, 20, 20);
	c.fillStar ( 380+0, 40, 20, 20);
	c.fillStar ( 400+0, 300, 20, 20);
	c.fillStar ( 420+0, 50, 20, 20);
	c.fillStar ( 600+0, 370, 20, 20);
	c.fillStar ( 500+0, 20, 20, 20);
	c.fillStar ( 0+0, 400, 20, 20);
	c.fillStar ( 60+0, 90, 20, 20);
	
	c.println ("Moon on September 24, 2014: New Moon");
	// Start of Moon
	Color moon = new Color (230, 230, 230);
	c.setColor(moon);
	c.fillOval (90+z, 100, 200, 200);
	Color moon2 = new Color(200, 200, 200);
	c.setColor(moon2);
	c.fillOval (120+z, 120, 50+15, 50+15);
	c.fillOval (130+z, 140, 40+10, 60+20);
	c.fillOval (150+z, 115, 50+15, 30+10);
	c.fillOval (180+z, 160, 30+10, 30+10);
	c.fillOval (100+z, 150, 30+10, 30+10);
	c.fillOval (205+z, 140, 20+9, 30+10);
	c.fillOval (100+125/2+z, 100+125/2+32, 25, 30);
	c.fillOval (230+z, 180, 55, 70);
	c.fillOval (200+z, 200, 80, 40);
	c.fillOval (180+z, 230, 60, 50);
	c.fillOval (120+z, 225, 50, 60);
	Color moon3 = new Color(180, 180, 180);
	c.setColor(moon3);
	c.fillOval (130+z, 130, 20+8, 20+10);
	c.fillOval (135+z, 145, 20+8, 30+10);
	c.fillOval (170+z, 125, 20+8, 10+5);
	c.fillOval (194+z, 172, 10+5, 10+5);
	c.fillOval (250+z, 200, 20, 20);
	c.fillOval (200+z, 250, 15, 10);
	c.fillOval (140+z, 23540, 15, 20);
	c.setColor(Color.black);
	c.fillOval(90+z, 100, 200, 200);
	
	
	
	z+=3;
	try 
	{
	    Thread.sleep(40L);    // one second
	}
	    catch (Exception e) {}
	
    }// end of loop3
    
	    int z2 = -310;
    while ( z2 < 555) 
	{
	
	
	//Start of Sky
	c.setColor(Color.black);
	c.fillRect(0, 0, 640, 500);
	//End of Sky
	
	//Start of Stars
	c.setColor (Color.yellow);
	c.fillStar (-100, 50, 20, 20);
	c.fillStar (640, 200, 20, 20);
	c.fillStar (-150+0, 10, 20, 20);
	c.fillStar (-210+0, 160, 20, 20);
	c.fillStar (-240+0,220, 20, 20);
	c.fillStar (380+0, 40, 20, 20);
	c.fillStar (400+0, 300, 20, 20);
	c.fillStar (420+0, 50, 20, 20);
	c.fillStar (600+0, 370, 20, 20);
	c.fillStar (500+0, 390, 20, 20);
	c.fillStar (0+0, 400, 20, 20);
	c.fillStar (60+0, 90, 20, 20);
	c.fillStar (80+0, 450, 20, 20);
	c.fillStar (-200+0, 50, 20, 20);
	c.fillStar ( 120+0, 250, 20, 20);
	c.fillStar ( 250+0, 140, 20, 20);
	c.fillStar ( 30+0, 80, 20, 20);
	c.fillStar (30+0, 405, 20, 20);
	c.fillStar (40+0, 30, 20, 20);
	c.fillStar ( 300+0, 420, 20, 20);
	c.fillStar ( 380+0, 40, 20, 20);
	c.fillStar ( 400+0, 300, 20, 20);
	c.fillStar ( 420+0, 50, 20, 20);
	c.fillStar ( 600+0, 370, 20, 20);
	c.fillStar ( 500+0, 20, 20, 20);
	c.fillStar ( 0+0, 400, 20, 20);
	c.fillStar ( 60+0, 90, 20, 20);
	
	c.println ("Moon on September 25, 2014: Waxing Crescent");
	// Start of Moon
	Color moon = new Color (230, 230, 230);
	c.setColor(moon);
	c.fillOval (90+z2, 100, 200, 200);
	Color moon2 = new Color(200, 200, 200);
	c.setColor(moon2);
	c.fillOval (120+z2, 120, 50+15, 50+15);
	c.fillOval (130+z2, 140, 40+10, 60+20);
	c.fillOval (150+z2, 115, 50+15, 30+10);
	c.fillOval (180+z2, 160, 30+10, 30+10);
	c.fillOval (100+z2, 150, 30+10, 30+10);
	c.fillOval (205+z2, 140, 20+9, 30+10);
	c.fillOval (100+125/2+z2, 100+125/2+32, 25, 30);
	c.fillOval (230+z2, 180, 55, 70);
	c.fillOval (200+z2, 200, 80, 40);
	c.fillOval (180+z2, 230, 60, 50);
	c.fillOval (120+z2, 225, 50, 60);
	Color moon3 = new Color(180, 180, 180);
	c.setColor(moon3);
	c.fillOval (130+z2, 130, 20+8, 20+10);
	c.fillOval (135+z2, 145, 20+8, 30+10);
	c.fillOval (170+z2, 125, 20+8, 10+5);
	c.fillOval (194+z2, 172, 10+5, 10+5);
	c.fillOval (250+z2, 200, 20, 20);
	c.fillOval (200+z2, 250, 15, 10);
	c.fillOval (140+z2, 23540, 15, 20);
	c.setColor(Color.black);
	c.fillOval(80+z2, 100, 200, 200);
	
	
	
	z2+=3;
	try 
	{
	    Thread.sleep(40L);    // one second
	}
	    catch (Exception e) {}
	
    }// end of loop4
    
	    int z3 = -310;
    while ( z3 < 555) 
	{
	
	
	//Start of Sky
	c.setColor(Color.black);
	c.fillRect(0, 0, 640, 500);
	//End of Sky
	
	//Start of Stars
	c.setColor (Color.yellow);
	c.fillStar (-100, 50, 20, 20);
	c.fillStar (640, 200, 20, 20);
	c.fillStar (-150+0, 10, 20, 20);
	c.fillStar (-210+0, 160, 20, 20);
	c.fillStar (-240+0,220, 20, 20);
	c.fillStar (380+0, 40, 20, 20);
	c.fillStar (400+0, 300, 20, 20);
	c.fillStar (420+0, 50, 20, 20);
	c.fillStar (600+0, 370, 20, 20);
	c.fillStar (500+0, 390, 20, 20);
	c.fillStar (0+0, 400, 20, 20);
	c.fillStar (60+0, 90, 20, 20);
	c.fillStar (80+0, 450, 20, 20);
	c.fillStar (-200+0, 50, 20, 20);
	c.fillStar ( 120+0, 250, 20, 20);
	c.fillStar ( 250+0, 140, 20, 20);
	c.fillStar ( 30+0, 80, 20, 20);
	c.fillStar (30+0, 405, 20, 20);
	c.fillStar (40+0, 30, 20, 20);
	c.fillStar ( 300+0, 420, 20, 20);
	c.fillStar ( 380+0, 40, 20, 20);
	c.fillStar ( 400+0, 300, 20, 20);
	c.fillStar ( 420+0, 50, 20, 20);
	c.fillStar ( 600+0, 370, 20, 20);
	c.fillStar ( 500+0, 20, 20, 20);
	c.fillStar ( 0+0, 400, 20, 20);
	c.fillStar ( 60+0, 90, 20, 20);
	
	c.println ("Moon on September 26, 2014: Waxing Crescent");
	// Start of Moon
	Color moon = new Color (230, 230, 230);
	c.setColor(moon);
	c.fillOval (90+z3, 100, 200, 200);
	Color moon2 = new Color(200, 200, 200);
	c.setColor(moon2);
	c.fillOval (120+z3, 120, 50+15, 50+15);
	c.fillOval (130+z3, 140, 40+10, 60+20);
	c.fillOval (150+z3, 115, 50+15, 30+10);
	c.fillOval (180+z3, 160, 30+10, 30+10);
	c.fillOval (100+z3, 150, 30+10, 30+10);
	c.fillOval (205+z3, 140, 20+9, 30+10);
	c.fillOval (100+125/2+z3, 100+125/2+32, 25, 30);
	c.fillOval (230+z3, 180, 55, 70);
	c.fillOval (200+z3, 200, 80, 40);
	c.fillOval (180+z3, 230, 60, 50);
	c.fillOval (120+z3, 225, 50, 60);
	Color moon3 = new Color(180, 180, 180);
	c.setColor(moon3);
	c.fillOval (130+z3, 130, 20+8, 20+10);
	c.fillOval (135+z3, 145, 20+8, 30+10);
	c.fillOval (170+z3, 125, 20+8, 10+5);
	c.fillOval (194+z3, 172, 10+5, 10+5);
	c.fillOval (250+z3, 200, 20, 20);
	c.fillOval (200+z3, 250, 15, 10);
	c.fillOval (140+z3, 23540, 15, 20);
	c.setColor(Color.black);
	c.fillOval(60+z3, 100, 200, 200);
	
	
	
	z3+=3;
	try 
	{
	    Thread.sleep(40L);    // one second
	}
	    catch (Exception e) {}
	
    }// end of loop5
    
	    int z4 = -310;
    while ( z4 < 555) 
	{
	
	
	//Start of Sky
	c.setColor(Color.black);
	c.fillRect(0, 0, 640, 500);
	//End of Sky
	
	//Start of Stars
	c.setColor (Color.yellow);
	c.fillStar (-100, 50, 20, 20);
	c.fillStar (640, 200, 20, 20);
	c.fillStar (-150+0, 10, 20, 20);
	c.fillStar (-210+0, 160, 20, 20);
	c.fillStar (-240+0,220, 20, 20);
	c.fillStar (380+0, 40, 20, 20);
	c.fillStar (400+0, 300, 20, 20);
	c.fillStar (420+0, 50, 20, 20);
	c.fillStar (600+0, 370, 20, 20);
	c.fillStar (500+0, 390, 20, 20);
	c.fillStar (0+0, 400, 20, 20);
	c.fillStar (60+0, 90, 20, 20);
	c.fillStar (80+0, 450, 20, 20);
	c.fillStar (-200+0, 50, 20, 20);
	c.fillStar ( 120+0, 250, 20, 20);
	c.fillStar ( 250+0, 140, 20, 20);
	c.fillStar ( 30+0, 80, 20, 20);
	c.fillStar (30+0, 405, 20, 20);
	c.fillStar (40+0, 30, 20, 20);
	c.fillStar ( 300+0, 420, 20, 20);
	c.fillStar ( 380+0, 40, 20, 20);
	c.fillStar ( 400+0, 300, 20, 20);
	c.fillStar ( 420+0, 50, 20, 20);
	c.fillStar ( 600+0, 370, 20, 20);
	c.fillStar ( 500+0, 20, 20, 20);
	c.fillStar ( 0+0, 400, 20, 20);
	c.fillStar ( 60+0, 90, 20, 20);
	
	c.println ("Moon on September 27, 2014: Waxing Crescent");
	// Start of Moon
	Color moon = new Color (230, 230, 230);
	c.setColor(moon);
	c.fillOval (90+z4, 100, 200, 200);
	Color moon2 = new Color(200, 200, 200);
	c.setColor(moon2);
	c.fillOval (120+z4, 120, 50+15, 50+15);
	c.fillOval (130+z4, 140, 40+10, 60+20);
	c.fillOval (150+z4, 115, 50+15, 30+10);
	c.fillOval (180+z4, 160, 30+10, 30+10);
	c.fillOval (100+z4, 150, 30+10, 30+10);
	c.fillOval (205+z4, 140, 20+9, 30+10);
	c.fillOval (100+125/2+z4, 100+125/2+32, 25, 30);
	c.fillOval (230+z4, 180, 55, 70);
	c.fillOval (200+z4, 200, 80, 40);
	c.fillOval (180+z4, 230, 60, 50);
	c.fillOval (120+z4, 225, 50, 60);
	Color moon3 = new Color(180, 180, 180);
	c.setColor(moon3);
	c.fillOval (130+z4, 130, 20+8, 20+10);
	c.fillOval (135+z4, 145, 20+8, 30+10);
	c.fillOval (170+z4, 125, 20+8, 10+5);
	c.fillOval (194+z4, 172, 10+5, 10+5);
	c.fillOval (250+z4, 200, 20, 20);
	c.fillOval (200+z4, 250, 15, 10);
	c.fillOval (140+z4, 23540, 15, 20);
	c.setColor(Color.black);
	c.fillOval(40+z4, 100, 200, 200);
	
	
	
	z4+=3;
	try 
	{
	    Thread.sleep(40L);    // one second
	}
	    catch (Exception e) {}
	
    }// end of loop6
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
	    c.println ("Enter 1 or 2");
	    c.println ("1 - Improved House");
	    c.println ("2 - Improved Moon");


	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt();
	    c.clear();
	    if (choice == 1) House();
	    else if (choice == 2) Moon();
	c.getChar ();
	
	c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");
	// Place your program here.  'c' is the output console
    } // main method
} // Menu Demo class
