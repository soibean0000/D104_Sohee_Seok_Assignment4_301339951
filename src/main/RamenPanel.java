package main;
import equipment.Equipment;
import equipment.Pot;
import kitchen.FireSwitch;
import kitchen.Kitchen;
import kitchen.Switch;
import kitchen.WaterSwitch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RamenPanel extends JPanel implements ActionListener {
    //field
    public static int W_WIDTH = 1280;
    public static int W_HEIGHT = 1024;
    private double mouseX;
    private double mouseY;
    private Kitchen kitchen;
    private Pot pot;
    private ArrayList<Switch> switches;
    private Timer timer;

    //private Switch stoveLever;

    public RamenPanel(JFrame frame) {
        setPreferredSize(new Dimension(W_WIDTH, W_HEIGHT));
        kitchen = new Kitchen("assets/KitchenImg.png");
        pot = new Pot("assets/Pot.png", 0.4, 450, 300);
        switches = new ArrayList<>();
        Switch fireSwitch = new FireSwitch("assets/StoveLever.png", "assets/FireOn.png", 0.2, 520, 630);
        Switch waterSwitch = new WaterSwitch("assets/Faucet.png", "assets/WaterOn.png", 0.25, 1055, 257);
        switches.add(fireSwitch);
        switches.add(waterSwitch);

        MyMouseListener m1 = new MyMouseListener();
        addMouseListener(m1);

        MyMouseMotionListener m2 = new MyMouseMotionListener();
        addMouseMotionListener(m2);

        timer = new Timer(30, this);
        timer.start();
        //stoveLever = new stoveLever();
    }

    public void paintComponent(Graphics g) {
        //test 할시 만들고 draw
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        kitchen.drawKitchen(g2);
        for (Switch sw : switches) {
            sw.draw(g2);
        }
        pot.draw(g2);
        //aSwitch.draw(g2);
        //stoveLever.draw(g2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }

    public class MyMouseListener extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();

            for (Switch sw : switches) {
                sw.clicked(mouseX, mouseY);
            }


        }
    }

    public class MyMouseMotionListener extends MouseMotionAdapter {


        public void mouseDragged(MouseEvent e) {
            mouseX = e.getX();
            mouseY = e.getY();
            if (pot.clicked(mouseX, mouseY)) {
                pot.move((int) mouseX, (int) mouseY);
            }
            for (Switch sw : switches) {
                if (sw.hit(pot)) {
                    if (pot.getState() == 0) {
                        if (sw instanceof WaterSwitch) {
                            pot.setState(1);
                        }
                    }
                }
            }
        }
    }
}
