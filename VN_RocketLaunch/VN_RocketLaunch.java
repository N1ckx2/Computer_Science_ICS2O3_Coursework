/* Nicholas Vadivelu
ICS 203-02
November 12, 2014
Rocket Launch */

//Before starting, go to File>Preferences>Java>Additional Class Path Directories
//From here copy and paste the directory leading to the Jlayer.jar file

import java.awt.*;
//import hsa.Console;
import javazoom.jl.player.Player;
import java.awt.image.BufferedImage; //need to animate image
import javax.imageio.*; //need for image
import java.io.*; //need to access files
import java.lang.*;
//import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;
import hsa.*;

public class VN_RocketLaunch
{
//***************************Output Declarations*******************************************
    static Console c;           // The output console
    static BufferedImage image = new BufferedImage (640, 500, BufferedImage.TYPE_INT_ARGB);
    static Graphics2D g = image.createGraphics ();

//***************************Image Reader*******************************************
    public static Image loadImage (String name)  //Loads image from file
    {
	Image img = null;
	try
	{
	    img = ImageIO.read (new File (name));
	}
	catch (IOException e)
	{
	    c.println ("Error loading the image"); //if the image load fails it will tell you
	}
	return img;
    }


//*******************************Rocket Countdown*********************************
    public static void CountDown () throws InterruptedException
    {
	AudioPlayer rocket = new AudioPlayer ("Rocket.mp3"); //creates the audio player with the rocket
	Image ten = loadImage ("ten.jpg");
	Image nine = loadImage ("nine.png");
	Image eight = loadImage ("eight.png");
	Image seven = loadImage ("seven.png");
	Image six = loadImage ("six.jpg");
	Image five = loadImage ("five.png");
	Image four = loadImage ("four.png");
	Image three = loadImage ("three.jpg");
	Image two = loadImage ("two.png");
	Image one = loadImage ("one.jpg");
	Image blast = loadImage ("blastoff.jpg"); //import all the number pictures

	g.setColor (Color.white); //sets rectangle colours to white

	rocket.play (); //starts audip

	g.drawImage (ten, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //ten

	g.fillRect (0, 0, 640, 500);
	g.drawImage (nine, 0, -70, 640, 640, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //nine

	g.fillRect (0, 0, 640, 500);
	g.drawImage (eight, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //eight

	g.fillRect (0, 0, 640, 500);
	g.drawImage (seven, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //seven

	g.fillRect (0, 0, 640, 500);
	g.drawImage (six, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //six

	g.fillRect (0, 0, 640, 500);
	g.drawImage (five, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //five

	g.fillRect (0, 0, 640, 500);
	g.drawImage (four, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //four

	g.fillRect (0, 0, 640, 500);
	g.drawImage (three, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //three

	g.fillRect (0, 0, 640, 500);
	g.drawImage (two, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //two

	g.fillRect (0, 0, 640, 500);
	g.drawImage (one, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);
	c.clear (); //one

	g.fillRect (0, 0, 640, 500);
	g.drawImage (blast, 0, 0, 640, 500, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000); //blast off

	rocket.stop (); //stops audip
	c.clear (); //clears the screen
    }


//*****************************Rocket Take off************************************
    public static void TakeOff () throws InterruptedException
    {
	int i, rand, mx, my; //declares incrementing variable
	boolean n = true; //to make the flying infinite until exited
	char move = 'w'; //to control movement
	mx = 270;
	my = 100; //these two variables determine the ships position
	AudioPlayer shipsound = new AudioPlayer ("spaceship.mp3"); //creates the audio player with the rocket
	AudioPlayer laser = new AudioPlayer ("laser.mp3"); //creates laser sound
	Font font = new Font (null, Font.PLAIN, 30); //font
	g.setFont (font);
	c.setColor (Color.white);
	Image ship = loadImage ("ship.png");
	Image fire = loadImage ("fire.png");
	Image stars = loadImage ("stars.jpg"); //image declarations
	Image launch = loadImage ("launchpad.jpg");

	shipsound.play (); //starts audio
	for (i = 200 ; i >= -350 ; i--)
	{
	    rand = (int) (Math.random () * 20 + 100); //makes random number for the variation in the flame size
	    g.drawImage (launch, 0, 0, 640, 500, null); //draws background
	    g.drawString ("Launchpad McQuack", 10, 30);
	    if (i <= 50)
	    {
		g.drawImage (fire, 495, i + 170, rand, rand + 80, null); //draws flames (485)
		g.drawImage (ship, 500, i - 10, 100, 199, null); //draws ship
	    }
	    else
		g.drawImage (ship, 500, 130, 100, 199, null);     //draws ship
	    c.drawImage (image, 0, 0, null); //puts the buffered image onto the console
	}
	while (n)
	{
	    shipsound.play ();
	    for (i = -(1920 - 640) ; i <= 0 ; i++)
	    {
		rand = (int) (Math.random () * 20 + 100); //generates random number for flame
		g.drawImage (stars, 0, i, 640, 1920, null); //adds background
		g.drawImage (fire, mx-5, my + 180, rand, rand + 80, null); //adds flames
		g.drawImage (ship, mx, my, 100, 199, null); //adds ship
		c.drawImage (image, 0, 0, null); //draws buffered image onto console
		if (i % 5 == 0)
		{
		    move = c.getChar ();
		    if (move == 'a')
			mx -= 10;
		    if (move == 'd')
			mx += 10;
		    if (move == 's')
			my += 10;
		    if (move == 'w')
			my -= 10;
		    if (move == 'z')
			break; //this is to control the rocket's movement
		    if (move == 'l')
		    {
			laser.play ();
			//Thread.sleep (100);
			for (int l = my; l >= -35; l-=15)
			{
			    g.setColor(Color.red);
			    g.drawImage (stars, 0, i, 640, 1920, null); //adds background
			    g.drawImage (fire, mx-5, my + 180, rand, rand + 80, null); //adds flames
			    g.fillRect (mx+47, l, 5, 30);
			    g.drawImage (ship, mx, my, 100, 199, null); //adds ship
			    c.drawImage (image, 0, 0, null); //draws buffered image onto console
			    //Thread.sleep(1);   
			} //laser animation
			laser.stop (); //this controls the laser sound
			g.setColor(Color.white);
		    }
		    if (move == '0')
		    {
			n = false;
			break; //this makes sure the loop ends when the user pressed 0
		    }
		}
	    }
	}
	shipsound.stop ();
    }


//*****************************Landing***************************************

    public static void Landing () throws InterruptedException
    {
	Font font = new Font (null, Font.PLAIN, 30); //font
	g.setFont (font);
	c.setColor (Color.white);
	Image pluto = loadImage ("pluto.gif");
	Image planet = loadImage ("planet.png");
	Image ship = loadImage ("ship.png");
	Image fire = loadImage ("fire.png");
	Image stars = loadImage ("stars.jpg"); //image declarations
	AudioPlayer shipsound = new AudioPlayer ("spaceship.mp3"); //creates the audio player with the rocket
	shipsound.play (); //starts sound
	Thread.sleep (30);
	for (int i = 640 ; i >= 236 ; i--)
	{
	    g.drawImage (stars, 0, 0, 640, 1920, null);
	    g.drawString ("Pluto", 10, 30);
	    g.drawImage (pluto, -50, 200, 640, 361, null);
	    g.drawImage (planet, i, 146, 356, 356, null);
	    c.drawImage (image, 0, 0, null);
	} //this loops moves pluto into place
	for (int i = -200 ; i <= 100 ; i++)
	{
	    int rand = (int) (Math.random () * 20 + 100);
	    g.drawImage (stars, 0, 0, 640, 1920, null);
	    g.drawString ("Pluto", 10, 30);
	    g.drawImage (fire, 392 - 3, i + 90, rand / 2, (rand + 80) / 2, null); //adds flames
	    g.drawImage (ship, 392, i, 50, 100, null);
	    g.drawImage (pluto, -50, 200, 640, 361, null);
	    g.drawImage (planet, 236, 146, 356, 356, null);
	    c.drawImage (image, 0, 0, null);
	} //this loops lands the rocket
	shipsound.stop (); //stops audio
    }


//*****************************Landing***************************************

    public static void Success () throws InterruptedException
    {
	AudioPlayer trumpet = new AudioPlayer ("trumpet.mp3"); //imports sound
	g.fillRect (0, 0, 640, 500);
	g.drawImage (loadImage ("success.jpg"), 0, 37, 640, 425, null); //draws success baby onto the screen
	c.drawImage (image, 0, 0, null); //draws buffered image
	trumpet.play (); //starts trumped
	Thread.sleep(10000);
	c.println("Press any key to continue...");
	c.getChar();
	//trumpet.stop();
    }


//*****************************Main Program***************************************

    public static void main (String[] args) throws InterruptedException
    {
	c = new Console ();
	char choice;
	do
	{
	    c.println ("\t\t\t\t    Rocket Launch \n\t\t\t\tBy Nicholas Vadivelu");
	    for (int y = 0 ; y < 80 ; y++)
	    {
		c.print ('-');
	    }

	    c.println ("INSTRUCTIONS:  After the rocket launch sequence, you must control the rocket.\nPress and hold the following keys to control:\n'w' = Up\n's' = Down\n'a' = Left\n'd' = Right\n'l' = Laser\n'0' = Stop Flying"); //explaining rocket controls
	    c.println ("\nPress '1' to start launch");

	    c.println ();
	    c.println ("Press '0' to exit");
	    choice = c.getChar ();
	    c.clear ();
	    if (choice == '1')
	    {
		CountDown ();
		TakeOff ();
		Landing ();
		Success ();
	    }
	    c.clear ();
	    //This will loop until user enters 'z'
	}

	while (choice != '0');
	c.println ("The program has terminated.  Goodbye!!");
	Thread.sleep (500);
	c.close ();
	// Place your program here.  'c' is the output console
    } // main method
} // VN_RocketLaunch class

class AudioPlayer implements Runnable
{ //this class lets you play audio
    private Player player;
    private Thread thread;
    private boolean loop = false;
    private String fileName;
    public AudioPlayer (String s)
    {
	load (s);
    }


    public void load (String s)
    {
	fileName = s;
	try
	{
	    player = new Player (new FileInputStream (s));
	    thread = new Thread (this);
	}
	catch (Exception e)
	{
	    e.printStackTrace ();
	}
    }


    public void play ()
    {
	if (thread != null)
	    thread = null;
	if (thread == null)
	    load (fileName);
	thread.start ();
    }


    public void loop ()
    {
	loop = true;
	play ();
    }


    public void stop ()
    {
	loop = false;
	thread = null;
	player.close ();
    }


    public void run ()
    {
	do
	{
	    try
	    {
		player.play ();
	    }
	    catch (Exception e)
	    {
		e.printStackTrace ();
	    }
	    if (loop)
		load (fileName);
	}
	while (loop);
    }
}
