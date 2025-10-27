package materi;

import javax.swing.*;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

public class FrameBeraksi{
    public static void main(String[] args) {
    JFrame frame = new JFrame("Frame Beraksi");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel emptyJLabel = new JLabel("Ginanjar Beraksi");
    // emptyJLabel.setSize(300, 300);
    frame.getContentPane().add(emptyJLabel);

    frame.setSize(800, 400);
    frame.setVisible(true);
    }

}