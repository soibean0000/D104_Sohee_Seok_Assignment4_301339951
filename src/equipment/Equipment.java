package equipment;

import utils.ImageLoader;

import java.awt.image.BufferedImage;

public class Equipment {
    //field 그릴것
    private BufferedImage equipImg;

    public Equipment(String file){
        equipImg = ImageLoader.loadImage(file);
    }
}
