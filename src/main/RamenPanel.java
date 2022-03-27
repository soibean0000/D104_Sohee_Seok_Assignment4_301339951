package main;
import kitchen.Kitchen;
import kitchen.Switch;

import javax.swing.*;
import java.awt.*;

public class RamenPanel extends JPanel {
    //field
    private Kitchen kitchen;
    private Switch aSwitch;
    //private Switch stoveLever;

    public RamenPanel(Dimension dimension){
        kitchen = new Kitchen("assets/KitchenImg.png");
        aSwitch = new Switch();
        //stoveLever = new stoveLever();
    }

    public void paintComponent(Graphics g) {

    }

}
