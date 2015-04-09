import java.io.*;
import java.nio.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
public class Omr
{
    BufferedImage img;
    File file;
    public void omr() throws Exception
    {
        file = new File("a.jpg");
        img = ImageIO.read(file);
        int a = img.getHeight();
        int b = img.getWidth();
    }
    public void readPixels() throws Exception
    {
        omr();
        int a=img.getRGB(0,0);
        Color col = new Color(a);
        System.out.println(col.getRed());
        System.out.println(col.getGreen());
        System.out.println(col.getBlue());
        System.out.println(col.getAlpha());
    }
}
