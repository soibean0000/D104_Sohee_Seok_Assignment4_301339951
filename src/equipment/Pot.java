package equipment;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Pot extends Equipment{

    public Pot(String file, double scale, int posX, int posY) {
        super(file, scale, posX, posY);
    }

    public void draw(Graphics2D g){
        g.draw(boundBox);
        AffineTransform at = g.getTransform();
        g.drawImage(img, xPos, yPos, (int) (img.getWidth()*scale), (int) (img.getHeight()*scale), null);
        g.setTransform(at);
    }


    @Override
    public void setState(int state){
        super.setState(state);
        if(state == 1){
            setImg("assets/FireOn.png");  //pot with water in
        }
    }
}
