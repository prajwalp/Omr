import java.io.*;
import java.nio.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
public class Omr
{
    
    public void omr() throws Exception
    {
        File file = new File("a.jpg");
        BufferedImage img=ImageIO.read(file);
        int a = img.getHeight();
        int b = img.getWidth();
        System.out.println(a+"   "+b);
    }
    public void readPixels() throws Exception
    {
        File file = new File("a.jpg");
        BufferedImage img=ImageIO.read(file);
        int[] a = img.getRGB(0,0,133,200,null,0,133); 

        Color c = new Color(a[100]);

        System.out.println(c.getRed());   
        System.out.println(c.getGreen()); 
        System.out.println(c.getBlue());  
        System.out.println(c.getAlpha());
        
    }
}
