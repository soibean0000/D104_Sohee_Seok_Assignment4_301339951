package kitchen;

import kitchen.Switch;
import main.RamenPanel;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class WaterSwitch extends Switch {
    public WaterSwitch(String file, String eff, double scale, int xPos, int yPos){
        super(file, scale, xPos, yPos);
        effect = new WaterEffect(eff, 0.4, 1059, 348);

    }

    public void draw(Graphics2D g) {
        AffineTransform at = g.getTransform();
        g.drawImage(img, xPos, yPos, (int) (img.getWidth()*scale), (int) (img.getHeight()*scale), null);
        g.setTransform(at);
        if(trigger){
            effect.draw(g);
        }
    }
}
