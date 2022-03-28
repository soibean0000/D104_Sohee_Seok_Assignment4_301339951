package main;

import javax.swing.*;

public class RamenApp extends JFrame {
    public RamenApp(String title){
        //constructor
        super(title);	//that inherits from JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,800);	//Panel size

        //instantiating the FishPanel
        RamenPanel panel = new RamenPanel(this);

        //adding it to the current frame
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);

        //displaying the frame
        this.setVisible(true);
    }

    public static void main(String[] args) {
        RamenApp app = new RamenApp("My Ramen App");
    }
}
