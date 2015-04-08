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
        int a=img.getRGB(133,200);
    }
}