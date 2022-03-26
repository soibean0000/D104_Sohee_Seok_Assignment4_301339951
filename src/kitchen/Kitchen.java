package kitchen;

import utils.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Kitchen {
    private BufferedImage kitchenImg;

    public Kitchen(String file){
        kitchenImg = ImageLoader.loadImage(file);
    }

    public void drawKitchen(Graphics2D g2){

    }
}
