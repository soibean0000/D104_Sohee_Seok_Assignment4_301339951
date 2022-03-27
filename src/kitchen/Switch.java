package kitchen;

import utils.ImageLoader;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Switch{
    //field
    protected Rectangle2D.Double button;
    private BufferedImage img;
    private boolean lightOn = false;
    private boolean fireOn = false;
    private boolean waterOn = false;

    public Switch(){
        img = ImageLoader.loadImage("assets/DarkFilter.png");

        img = ImageLoader.loadImage("assets/WaterOn.png");

        img = ImageLoader.loadImage("assets/RightFireOn.png");
        img = ImageLoader.loadImage("assets/LeftFireOn.png");
    }

    public void draw(Graphics2D g){
        if(!lightOn){

        }
    }

    public void lightOn(boolean on){
        lightOn = on;
    }

    public void fireOn(boolean on){
        fireOn = on;
    }

    public void waterOn(boolean on){
        waterOn = on;
    }
}
