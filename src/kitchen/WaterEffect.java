package kitchen;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class WaterEffect extends Effect{
    public WaterEffect(String file, double scale, int xPos, int yPos){
        super(file, scale, xPos, yPos);
    }

    public void draw(Graphics2D g) {
        AffineTransform at = g.getTransform();
        g.drawImage(img, xPos, yPos, (int) (img.getWidth()*scale), (int) (img.getHeight()*scale), null);
        g.setTransform(at);

    }
}
