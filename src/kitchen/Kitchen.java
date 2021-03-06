package kitchen;

import main.RamenPanel;
import utils.ImageLoader;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Kitchen {
    private BufferedImage kitchenImg;

    public Kitchen(String file){

        kitchenImg = ImageLoader.loadImage(file);
    }

    public BufferedImage getKitchenImg() {
        return kitchenImg;
    }

    public void drawKitchen(Graphics2D g2){
        AffineTransform at = g2.getTransform();
        g2.drawImage(kitchenImg, 0, 0, RamenPanel.W_WIDTH, RamenPanel.W_HEIGHT, null);
        g2.setTransform(at);
    }
}
