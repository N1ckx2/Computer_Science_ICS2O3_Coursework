// The "Improved_House" class.
import java.awt.*;
import hsa.Console;

public class Improved_House
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
		// Start of the gradient sky
	Color col = new Color (0, 0, 255);
	for(int i=0; i<=100; i++) {
	    int r,g,b;
	    r = (int)(0+1.2*i);
	    g = (int)(162+0.5*i);
	    b = (int)(232+0.2*i);
	    Color sky = new Color(r,g,b);
	    c.setColor(sky);
	    c.fillRect(0,i*5,640,5);
	}
	// End of the gradient sky
	
	// Start of the grass
	Color grass = new Color (50, 148, 3);
	c.setColor(grass);
	c.fillRect (0, 300, 640, 200);
	// End of the Grass
	
	// Start of main building
	    //Start of body
	Color building = new Color (154, 33, 33);
	c.setColor(building);
	c.fillRect (640/2-250/2, 600/2-250/2, 250, 250);
	
	c.setColor (Color.white);
	c.drawRect (
	    //End of Body
	    
	    //Start of Roof
	Color roof = new Color (26, 26, 26);
	c.setColor (roof);
	int[]rx = {640/2, 640/2+175, 640/2-175};
	int[]ry = {600/2-200, 640/2-125, 640/2-125};
	c.fillPolygon(rx, ry, 3);
	    // End of Roof
	
	// Place your program here.  'c' is the output console
    } // main method
} // Improved_House class
