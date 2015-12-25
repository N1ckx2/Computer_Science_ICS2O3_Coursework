import java.awt.*;
import hsa.Console;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class Rockettest{
  
  public static File ShuttleClose = new File ("shuttle.png"); 
  public static File Launch = new File ("launch complex.jpg");
  
  static Console c;
  
  // 
  
  public static Image loadImage (String name){
    
    Image img = null;
    
    try{
      
      img = ImageIO.read (new File (name));
    
    }
    
    catch (IOException e){
      
    }
    
    return img;
  
  }
  
  //
  
  public static void main (String[] args)throws InterruptedException, IOException{
    
    c = new Console ();
    
    BufferedImage Shuttleclose = ImageIO.read(ShuttleClose);
    BufferedImage ShuttleCloseImage = new BufferedImage (Shuttleclose.getWidth(), Shuttleclose.getHeight(), BufferedImage.TYPE_INT_ARGB);
    
    BufferedImage launch = ImageIO.read(Launch);
    BufferedImage LaunchImage = new BufferedImage (launch.getWidth(), launch.getHeight(), BufferedImage.TYPE_INT_ARGB);
    
    c.drawImage(LaunchImage, -100, -25, null);
    
    int shuttley = 0;
    
    while(true){
      
      c.drawImage(ShuttleCloseImage, 400, shuttley, null);
      
      shuttley--;
      
      if(shuttley < -50){
      
      Thread.sleep(50);
      
      }
      
      c.clear();
      c.drawImage(LaunchImage, -100, -25, null);
      
    }
  }
}


