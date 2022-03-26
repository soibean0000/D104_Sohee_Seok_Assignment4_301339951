package main;
import kitchen.Kitchen;
import kitchen.Switch;

import javax.swing.*;
import java.awt.*;

public class RamenPanel extends JPanel {
    //field
    private Kitchen kitchen;
    private Switch aSwitch;

    public RamenPanel(Dimension dimension){
        kitchen = new Kitchen("assets/kitchen.png");
        aSwitch = new Switch();
    }

    public void paintComponent(Graphics g) {

    }

}
