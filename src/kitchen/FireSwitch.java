package kitchen;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class FireSwitch extends Switch {
    public FireSwitch(String sw, String eff, double scale, int xPos, int yPos){
        super(sw, scale, xPos, yPos);
        this.effect = new FireEffect(eff, 0.3, 400, 450);

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
