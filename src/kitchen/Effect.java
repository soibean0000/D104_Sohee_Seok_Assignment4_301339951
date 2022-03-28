package kitchen;

import equipment.Equipment;
import utils.ImageLoader;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public abstract class Effect {
    protected Integer xPos;
    protected Integer yPos;
    protected double scale;
    protected BufferedImage img;
    protected Rectangle2D.Double boundBox;


    public Effect(String file, double scale, int xPos, int yPos){
        img = ImageLoader.loadImage(file);
        this.scale = scale;
        this.xPos = xPos;
        this.yPos = yPos;
        boundBox = new Rectangle2D.Double((xPos), (yPos), ((img.getWidth()*scale)), ((img.getHeight()*scale)));

    }

    public abstract void draw(Graphics2D g2);

    public boolean hit(Equipment equipment){
        if(boundBox.intersects(equipment.getBoundBox()))
            return true;
        return false;
    }
}
