package kitchen;

import equipment.Equipment;
import utils.ImageLoader;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public abstract class Switch{
    //field
    protected Integer xPos;
    protected Integer yPos;
    protected double scale;
    protected BufferedImage img;
    protected boolean trigger = false;
    protected Effect effect;
    protected Rectangle2D.Double boundBox;

    public Switch(String sw, double scale, int xPos, int yPos){
        img = ImageLoader.loadImage(sw);
        this.scale = scale;
        this.xPos = xPos;
        this. yPos = yPos;
        boundBox = new Rectangle2D.Double((xPos), (yPos), ((img.getWidth()*scale)), ((img.getHeight()*scale)));

    }

    public abstract void draw(Graphics2D g);

    public void setTrigger(){
        if(trigger){
            trigger = false;
        }
        else{
            trigger = true;
        }
    }

    public void fireOn(boolean on){
        fireOn = on;
    }

    public void waterOn(boolean on){
        waterOn = on;
    }

    public boolean hit(Equipment equipment){
        return effect.hit(equipment);
    }

    public Effect getEffect() {
        return effect;
    }
}
