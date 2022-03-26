package utils;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    public static BufferedImage loadImage(String fileName){
        BufferedImage bufImg = null;
        try{
            bufImg = ImageIO.read(new File(fileName));
        }catch (IOException e){
            System.out.println("Your image file is either missing or corrupted!");
        }
        return bufImg;
    }
}
