package equipment;

import utils.ImageLoader;

import java.awt.image.BufferedImage;

public class Equipment {
    //field 그릴것
    private BufferedImage equipImg;
    private BufferedImage Noodle;
    private BufferedImage Powder;
    private BufferedImage Egg;
    private BufferedImage Flakes;

    public Equipment(String file){
        equipImg = ImageLoader.loadImage(file);
        Noodle = ImageLoader.loadImage(file);
        Powder = ImageLoader.loadImage(file);
        Egg = ImageLoader.loadImage(file);
        Flakes = ImageLoader.loadImage(file);
    }
}
