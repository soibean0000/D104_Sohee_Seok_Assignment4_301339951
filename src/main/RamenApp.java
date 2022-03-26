package main;

import javax.swing.*;

public class RamenApp extends JFrame {
    public RamenApp(String title){
        //constructor
        super(title);	//that inherits from JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,800);	//Panel size

        //instantiating the FishPanel
        RamenPanel panel = new RamenPanel(this.getSize());

        //adding it to the current frame
        this.add(panel);

        //displaying the frame
        this.setVisible(true);
    }

    public static void main(String[] args) {
        RamenApp app = new RamenApp("My Ramen App");
    }
}
