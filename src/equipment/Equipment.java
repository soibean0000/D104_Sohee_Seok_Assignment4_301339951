package equipment;

import utils.ImageLoader;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public abstract class Equipment {
    //field 그릴것
    protected int xPos, yPos;
    protected double scale;
    protected BufferedImage img;
    protected int state = 0;
    protected boolean selected = false;
    protected Rectangle2D.Double boundBox;

    public Equipment(String file, double scale, int posX, int posY){
        img = ImageLoader.loadImage(file);
        this.scale = scale;
        this.xPos = posX;
        this.yPos = posY;
        boundBox = new Rectangle2D.Double((xPos), (yPos), ((img.getWidth()*scale)), ((img.getHeight()*scale)));
    }

    public abstract void draw(Graphics2D g);


    public void move(int xPos, int yPos){
        this.xPos = (int) (xPos-(img.getWidth()*scale/2));
        this.yPos = (int) (yPos-(img.getHeight()*scale/2));
        boundBox = new Rectangle2D.Double((this.xPos), (this.yPos), ((img.getWidth()*scale)), ((img.getHeight()*scale)));

    }

    public boolean clicked(double x, double y){
        return boundBox.contains(x, y);
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setImg(String file) {
        img = ImageLoader.loadImage(file);
    }

    public int getState() {
        return state;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Rectangle2D.Double getBoundBox() {
        return boundBox;
    }
}
